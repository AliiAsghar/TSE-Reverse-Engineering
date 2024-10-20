package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fks implements SensorEventListener {
    private final float[] a = new float[16];
    private final float[] b = new float[16];
    private final float[] c = new float[16];
    private final float[] d = new float[3];
    private final Display e;
    private final fkr[] f;
    private boolean g;

    public fks(Display display, fkr... fkrVarArr) {
        this.e = display;
        this.f = fkrVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        SensorManager.getRotationMatrixFromVector(this.a, sensorEvent.values);
        int rotation = this.e.getRotation();
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i2 = 130;
                        i = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i = 129;
                i2 = 2;
            }
            float[] fArr = this.a;
            System.arraycopy(fArr, 0, this.b, 0, 16);
            SensorManager.remapCoordinateSystem(this.b, i2, i, fArr);
        }
        SensorManager.remapCoordinateSystem(this.a, 1, 131, this.b);
        SensorManager.getOrientation(this.b, this.d);
        float[] fArr2 = this.d;
        float[] fArr3 = this.a;
        float f = fArr2[2];
        Matrix.rotateM(fArr3, 0, 90.0f, 1.0f, brg.a, brg.a);
        float[] fArr4 = this.a;
        if (!this.g) {
            akju.e(this.c, fArr4);
            this.g = true;
        }
        System.arraycopy(fArr4, 0, this.b, 0, 16);
        Matrix.multiplyMM(fArr4, 0, this.b, 0, this.c, 0);
        float[] fArr5 = this.a;
        fkr[] fkrVarArr = this.f;
        for (int i3 = 0; i3 < 2; i3++) {
            fkrVarArr[i3].a(fArr5, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
