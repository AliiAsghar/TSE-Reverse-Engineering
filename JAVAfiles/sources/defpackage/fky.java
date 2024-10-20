package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fky extends GLSurfaceView {
    public final CopyOnWriteArrayList a;
    public final Handler b;
    public final fkw c;
    public SurfaceTexture d;
    public Surface e;
    private final SensorManager f;
    private final Sensor g;
    private final fks h;
    private final fkz i;
    private final boolean j;
    private boolean k;
    private boolean l;

    public fky(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.b = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        dzg.g(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        this.f = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.g = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        fkw fkwVar = new fkw();
        this.c = fkwVar;
        fkx fkxVar = new fkx(this, fkwVar);
        fkz fkzVar = new fkz(context, fkxVar);
        this.i = fkzVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        dzg.g(windowManager);
        this.h = new fks(windowManager.getDefaultDisplay(), fkzVar, fkxVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(fkxVar);
        setOnTouchListener(fkzVar);
    }

    public static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private final void b() {
        boolean z;
        if (this.j && this.k) {
            z = true;
        } else {
            z = false;
        }
        Sensor sensor = this.g;
        if (sensor != null && z != this.l) {
            if (z) {
                this.f.registerListener(this.h, sensor, 0);
            } else {
                this.f.unregisterListener(this.h);
            }
            this.l = z;
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.post(new fhg(this, 14));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.k = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.k = true;
        b();
    }
}
