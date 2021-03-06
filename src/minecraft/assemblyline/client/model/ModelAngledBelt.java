// Date: 1/9/2013 10:47:12 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package assemblyline.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelAngledBelt extends ModelBase
{
	// fields
	ModelRenderer MRoller1;
	ModelRenderer bBELT;
	ModelRenderer MRoller2;
	ModelRenderer tBELT;
	ModelRenderer MRoller3;

	public ModelAngledBelt()
	{
		textureWidth = 128;
		textureHeight = 128;

		MRoller1 = new ModelRenderer(this, 0, 26);
		MRoller1.addBox(-7F, -1F, -1F, 14, 2, 2);
		MRoller1.setRotationPoint(0F, 14F, 0F);
		MRoller1.setTextureSize(128, 128);
		MRoller1.mirror = true;
		setRotation(MRoller1, 0.7853982F, 0F, 0F);
		bBELT = new ModelRenderer(this, 0, 0);
		bBELT.addBox(0F, 0F, 0F, 14, 1, 23);
		bBELT.setRotationPoint(-7F, 23.5F, -8F);
		bBELT.setTextureSize(128, 128);
		bBELT.mirror = true;
		setRotation(bBELT, 0.7853982F, 0F, 0F);
		MRoller2 = new ModelRenderer(this, 0, 26);
		MRoller2.addBox(-7F, -1F, -1F, 14, 2, 2);
		MRoller2.setRotationPoint(0F, 9F, 5F);
		MRoller2.setTextureSize(128, 128);
		MRoller2.mirror = true;
		setRotation(MRoller2, 0.7853982F, 0F, 0F);
		tBELT = new ModelRenderer(this, 0, 0);
		tBELT.addBox(0F, 0F, 0F, 14, 1, 23);
		tBELT.setRotationPoint(-7F, 19F, -8F);
		tBELT.setTextureSize(128, 128);
		tBELT.mirror = true;
		setRotation(tBELT, 0.7853982F, 0F, 0F);
		MRoller3 = new ModelRenderer(this, 0, 26);
		MRoller3.addBox(-7F, -1F, -1F, 14, 2, 2);
		MRoller3.setRotationPoint(0F, 19F, -5F);
		MRoller3.setTextureSize(128, 128);
		MRoller3.mirror = true;
		setRotation(MRoller3, 0.7853982F, 0F, 0F);
	}

	public void render(float f5, boolean slantAdjust)
	{
		if (slantAdjust)
			bBELT.setRotationPoint(-7F, 21.5F, -7F);
		else
			bBELT.setRotationPoint(-7F, 23.5F, -8F);

		MRoller1.render(f5);
		bBELT.render(f5);
		MRoller2.render(f5);
		tBELT.render(f5);
		MRoller3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
