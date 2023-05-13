package com.example.opengl;

import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

public abstract class Shape {
    protected FloatBuffer vertexBuffer;
    protected ShortBuffer drawListBuffer;
    protected int mProgram;
    protected int mPositionHandle;
    protected int mColorHandle;
    protected int mMVPMatrixHandle;

    public abstract void draw(float[] mvpMatrix);
}