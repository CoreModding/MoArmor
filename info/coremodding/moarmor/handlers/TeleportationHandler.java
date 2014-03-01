package info.coremodding.moarmor.handlers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Handler entity teleportation
 */
public class TeleportationHandler {
	private EntityPlayer entity;
	private double locX;
	private double locY;
	private double locZ;
	private Random rand;
	private World worldObj;

	@SuppressWarnings("javadoc")
	public TeleportationHandler(EntityPlayer e) {
		this.locX = e.posX;
		this.locY = e.posY;
		this.locZ = e.posZ;
		this.entity = e;
		this.rand = new Random();
		this.worldObj = e.worldObj;
	}

	/**
	 * Teleports entity to a random nearby position
	 */
	@SuppressWarnings("javadoc")
	public boolean random() {
		double d0 = this.locX + (this.rand.nextDouble() - 0.5D) * 64.0D;
		double d1 = this.locY + (this.rand.nextInt(64) - 32);
		double d2 = this.locZ + (this.rand.nextDouble() - 0.5D) * 64.0D;

		return this.teleportTo(d0, d1, d2);
	}

	/**
	 * Teleport the entity
	 */
	protected boolean teleportTo(double par1, double par3, double par5) {
		double d3 = this.locX;
		double d4 = this.locY;
		double d5 = this.locZ;
		this.locX = par1;
		this.locY = par3;
		this.locZ = par5;
		boolean flag = false;
		int i = MathHelper.floor_double(this.locX);
		int j = MathHelper.floor_double(this.locY);
		int k = MathHelper.floor_double(this.locZ);

		if (this.worldObj.blockExists(i, j, k)) {
			boolean flag1 = false;

			while (!flag1 && j > 0) {
				Block block = this.worldObj.getBlock(i, j, k);

				if (block.getMaterial().blocksMovement()) {
					flag1 = true;
				} else {
					--this.locY;
					--j;
				}
			}

			if (flag1) {
				this.entity.setPositionAndUpdate(this.locX, this.locY + 3,
						this.locZ);

				if (this.worldObj.getCollidingBoundingBoxes(this.entity,
						this.entity.boundingBox).isEmpty()
						&& !this.worldObj.isAnyLiquid(this.entity.boundingBox)) {
					flag = true;
				}
			}
		}

		if (!flag) {
			this.entity.setPositionAndUpdate(d3, d4, d5);
			return false;
		}
		short short1 = 128;

		for (int l = 0; l < short1; ++l) {
			double d6 = l / (short1 - 1.0D);
			float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
			float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
			float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
			double d7 = d3 + (this.locX - d3) * d6
					+ (this.rand.nextDouble() - 0.5D) * this.entity.width
					* 2.0D;
			double d8 = d4 + (this.locY - d4) * d6 + this.rand.nextDouble()
					* this.entity.height;
			double d9 = d5 + (this.locZ - d5) * d6
					+ (this.rand.nextDouble() - 0.5D) * this.entity.width
					* 2.0D;
			this.worldObj.spawnParticle("portal", d7, d8, d9, f, f1, f2);
		}

		this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F,
				1.0F);
		this.entity.playSound("mob.endermen.portal", 1.0F, 1.0F);
		return true;
	}

}
