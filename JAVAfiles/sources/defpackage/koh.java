package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class koh implements SensorEventListener {
    public static final xze a = xze.g("Bugle", "BugleAcceleratorSensorListener");
    public double b;
    public long c;
    public int d;
    public double e;
    public long f;
    public final Sensor g;
    public final SensorManager h;
    public ListenableFuture j;
    public final anen k;
    private final xnv l;
    public final Set i = new HashSet();
    private final float[] m = new float[3];
    private final koj n = koj.a();
    private final ArrayDeque o = new ArrayDeque();
    private long p = 0;

    public koh(Context context, xnv xnvVar, anen anenVar) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.h = sensorManager;
        this.g = sensorManager.getDefaultSensor(1);
        this.l = xnvVar;
        this.k = anenVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.m;
        boolean z = false;
        float f = (fArr2[0] * 0.8f) + (fArr[0] * 0.19999999f);
        fArr2[0] = f;
        float f2 = (fArr2[1] * 0.8f) + (fArr[1] * 0.19999999f);
        fArr2[1] = f2;
        float f3 = (fArr2[2] * 0.8f) + (fArr[2] * 0.19999999f);
        fArr2[2] = f3;
        fArr[0] = fArr[0] - f;
        fArr[1] = fArr[1] - f2;
        fArr[2] = fArr[2] - f3;
        this.n.b(fArr);
        if (this.n.b > this.b) {
            long a2 = this.l.a();
            atog atogVar = new atog(koj.a(), koj.a());
            float[] fArr3 = this.m;
            ((koj) atogVar.c).b(fArr);
            ((koj) atogVar.b).b(fArr3);
            atogVar.a = a2;
            this.o.add(atogVar);
            long j = a2 - this.c;
            while (!this.o.isEmpty() && ((atog) this.o.getFirst()).a < j) {
                this.o.removeFirst();
            }
            if (this.o.size() >= this.d) {
                atog atogVar2 = (atog) this.o.getFirst();
                atog atogVar3 = (atog) this.o.getLast();
                Object obj = atogVar2.b;
                Object obj2 = atogVar3.b;
                koj kojVar = (koj) obj;
                float[] fArr4 = kojVar.a;
                koj kojVar2 = (koj) obj2;
                float[] fArr5 = kojVar2.a;
                float f4 = fArr4[0] * fArr5[0];
                float f5 = fArr4[1] * fArr5[1];
                float f6 = fArr4[2] * fArr5[2];
                if (((f4 + f5) + f6) / (kojVar.b * kojVar2.b) < this.e) {
                    z = true;
                }
                this.o.clear();
                if (!z) {
                    long a3 = this.l.a();
                    if (this.p + this.f <= a3) {
                        a.o("Shake detected");
                        for (koi koiVar : this.i) {
                            if (((Boolean) ktf.a.e()).booleanValue()) {
                                kor korVar = (kor) koiVar.e.b();
                                Context context = koiVar.f;
                                ksw kswVar = new ksw(null, null);
                                kswVar.f(amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_SHAKE_GESTURE);
                                korVar.a(context, kswVar.e());
                            } else {
                                ((mho) koiVar.d.b()).aP(2);
                                cj cjVar = (cj) abbu.e(koiVar.f);
                                if (cjVar == null) {
                                    kon.a.q("No associated activity with the context, skip taking bug report");
                                } else if (cjVar.isFinishing()) {
                                    kon.a.q("Activity is finishing, can not show a dialog now");
                                } else {
                                    da a4 = cjVar.a();
                                    if (a4.ab()) {
                                        kon.a.q("Fragment manager has state saved, can not show a dialog now");
                                    } else {
                                        koo kooVar = new koo();
                                        apxh.e(kooVar);
                                        kooVar.q(a4, "com.google.android.apps.messaging.TakeBugReportDialogFragment");
                                    }
                                }
                            }
                        }
                        this.p = a3;
                    }
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
