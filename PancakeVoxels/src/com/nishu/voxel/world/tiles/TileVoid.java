package com.nishu.voxel.world.tiles;

import com.nishu.utils.Color4f;

public class TileVoid extends Tile{

	@Override
	public byte getId() {
		return 0;
	}

	@Override
	public Color4f getColor() {
		return Color4f.BLACK;
	}
}
