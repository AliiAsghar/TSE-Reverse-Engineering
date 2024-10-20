package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.AudioAttributes;
import android.media.MediaActionSound;
import android.opengl.GLES20;
import android.os.Looper;
import android.text.TextUtils;
import android.view.WindowManager;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aava implements aavs {
    public static final AudioAttributes b;
    public static final int[] c;
    private static final List y;
    private akul A;
    private final anen B;
    private final Context C;
    private final armf D;
    public int e;
    public boolean f;
    aavb g;
    aauz h;
    public Camera i;
    public MediaActionSound j;
    public int k;
    public int m;
    public int n;
    public boolean o;
    public final aavu p;
    public final Executor s;
    public final anen t;
    public Looper u;
    public final zmn v;
    public final yyt w;
    public static final alwo a = alwo.o("BugleCamera");
    private static final alhr x = uuh.x(227411292, "enable_media_action_sound_fix");
    public final Camera.CameraInfo d = new Camera.CameraInfo();
    public akul l = aktp.ae();
    private akul z = aktp.ae();
    public SettableFuture q = SettableFuture.create();
    public final AtomicBoolean r = new AtomicBoolean(true);
    private final HashSet E = new HashSet();

    static {
        uuh.i(uuh.b, "video_recorder_check_audio_format", false);
        uuh.e(uuh.b, "video_recording_quality", 5);
        b = new AudioAttributes.Builder().setContentType(4).setUsage(13).setLegacyStreamType(1).build();
        c = new int[]{0, 2, 3};
        y = new ArrayList();
    }

    public aava(Optional optional, zmn zmnVar, anen anenVar, anen anenVar2, Context context, yyt yytVar, armf armfVar, Optional optional2, Optional optional3) {
        Executor executor = (Executor) optional.get();
        this.s = executor;
        this.v = zmnVar;
        this.t = anenVar;
        this.B = anenVar2;
        this.C = context;
        this.w = yytVar;
        this.D = armfVar;
        this.e = -1;
        qjb.a(new aanh(this, Looper.myLooper(), 6, null), executor);
        this.p = new aavu(this, Looper.getMainLooper());
    }

    public static int a(int i) {
        List list = y;
        synchronized (list) {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras > 0 && numberOfCameras != list.size()) {
                list.clear();
                for (int i2 = 0; i2 < numberOfCameras; i2++) {
                    List list2 = y;
                    list2.add(new Camera.CameraInfo());
                    Camera.getCameraInfo(i2, (Camera.CameraInfo) list2.get(i2));
                }
            }
            int i3 = 0;
            while (true) {
                List list3 = y;
                if (i3 < list3.size()) {
                    if (((Camera.CameraInfo) list3.get(i3)).facing == i) {
                        return i3;
                    }
                    i3++;
                } else {
                    if (list3.isEmpty()) {
                        ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "chooseCameraIndexForFacingCached", 437, "CameraManager.java")).q("getNumberOfCameras returned 0 and cache was empty!");
                    }
                    return 0;
                }
            }
        }
    }

    private final void q() {
        Looper looper = this.u;
        if (looper != null && looper != Looper.myLooper()) {
            xyl.c("Expected to be on the camera thread");
        }
    }

    public final int b() {
        Context context;
        aavb aavbVar = this.g;
        if (aavbVar != null) {
            context = aavbVar.getContext();
        } else {
            context = this.C;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }

    public final void c() {
        if (!this.f) {
            return;
        }
        this.f = false;
        this.g = null;
        h();
        MediaActionSound mediaActionSound = this.j;
        if (mediaActionSound != null) {
            this.B.execute(akto.j(new aaqk(mediaActionSound, 9)));
            this.j = null;
        }
        qjb.a(new aaqk(this, 10), this.s);
    }

    public final void d(Consumer consumer) {
        qjb.a(new aanh(this, consumer, 7), this.s);
    }

    public final void e() {
        q();
        if (this.i == null) {
            return;
        }
        xyl.f(this.q.isDone());
        alvw n = a.n();
        n.X(aawh.a, Integer.valueOf(this.e));
        ((alwl) n.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "internalCloseCamera", 632, "CameraManager.java")).q("Releasing camera");
        Camera camera = this.i;
        if (camera != null) {
            camera.release();
        }
        this.i = null;
        this.p.getClass();
        qjb.a(new zth(3), this.t);
    }

    public final void f(int i) {
        q();
        if (this.i == null && i == this.e) {
            boolean z = true;
            this.r.set(true);
            try {
                alwo alwoVar = a;
                alvw n = alwoVar.n();
                alvz alvzVar = aawh.a;
                Integer valueOf = Integer.valueOf(i);
                n.X(alvzVar, valueOf);
                ((alwl) n.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "internalOpenCamera", 563, "CameraManager.java")).q("Opening camera");
                Camera open = Camera.open(i);
                this.i = open;
                j(open);
                alvw n2 = alwoVar.n();
                n2.X(aawh.a, valueOf);
                alwl alwlVar = (alwl) n2.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "internalOpenCamera", 570, "CameraManager.java");
                if (this.i == null) {
                    z = false;
                }
                alwlVar.t("Opened camera %s", Boolean.valueOf(z));
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final void g(aavb aavbVar, boolean z) {
        int i = 1;
        if (z) {
            this.E.add(aavbVar);
            if (aavbVar.b() && aavbVar != this.g) {
                this.l.cancel(false);
                xyl.k(aavbVar.b());
                aavbVar.setOnTouchListener(new iiy(this, 2, null));
                this.g = aavbVar;
                d(new aauv(this, i));
            }
        } else {
            this.E.remove(aavbVar);
        }
        if (!this.E.isEmpty()) {
            if (this.f) {
                return;
            }
            this.r.set(true);
            this.f = true;
            if (this.e == -1) {
                int a2 = a(0);
                this.e = a2;
                Camera.getCameraInfo(a2, this.d);
            }
            qjb.a(new aaqk(this, 11), this.s);
            if (((Boolean) ((utz) x.get()).e()).booleanValue()) {
                MediaActionSound mediaActionSound = new MediaActionSound();
                this.j = mediaActionSound;
                this.A = aktp.ai(new aakf(this, mediaActionSound, 5), this.B);
                return;
            } else {
                this.j = new MediaActionSound();
                this.A = aktp.ai(new ytr(this, 20), this.B);
                return;
            }
        }
        c();
    }

    public final void h() {
        this.l.cancel(false);
        this.l = aktp.ae();
        this.q.cancel(false);
        this.q = SettableFuture.create();
        akul akulVar = this.A;
        if (akulVar != null) {
            akulVar.cancel(false);
        }
        this.z.cancel(false);
        this.z = aktp.ae();
    }

    public final void i() {
        if (!this.f) {
            return;
        }
        d(new aauv(this, 1));
    }

    public final void j(Camera camera) {
        int i;
        Object obj;
        List<String> supportedFocusModes;
        q();
        aavb aavbVar = this.g;
        if (aavbVar == null) {
            aauz aauzVar = this.h;
            if (aauzVar != null) {
                aauzVar.disable();
                this.h = null;
            }
            this.p.getClass();
            qjb.a(new zth(4), this.t);
            return;
        }
        try {
            camera.stopPreview();
            camera.setPreviewTexture(null);
            m(camera, this.m);
            Camera.Parameters parameters = camera.getParameters();
            Camera.Size p = aajv.p(((CameraTextureView) aavbVar).h, parameters.getSupportedPictureSizes());
            Camera.Size p2 = aajv.p(p.width / p.height, parameters.getSupportedPreviewSizes());
            parameters.setPreviewSize(p2.width, p2.height);
            parameters.setPictureSize(p.width, p.height);
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(aawh.b, Integer.valueOf(p2.width));
            alwlVar.X(aawh.c, Integer.valueOf(p2.height));
            alwlVar.X(aawh.e, Float.valueOf(p2.width / p2.height));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "tryShowPreview", 1125, "CameraManager.java")).q("Setting preview size");
            boolean z = false;
            qjb.a(new aauq((Object) this, (Object) aavbVar, (Object) p, (int) (false ? 1 : 0)), this.t);
            Iterator<String> it = parameters.getSupportedFocusModes().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (TextUtils.equals(next, "continuous-picture")) {
                    parameters.setFocusMode(next);
                    break;
                }
            }
            camera.enableShutterSound(false);
            camera.setParameters(parameters);
            int i2 = p2.width;
            int i3 = p2.height;
            if (((CameraTextureView) aavbVar).b) {
                obj = ((CameraTextureView) aavbVar).getSurfaceTexture();
            } else {
                int height = ((CameraTextureView) aavbVar).getHeight();
                int width = ((CameraTextureView) aavbVar).getWidth();
                agqc agqcVar = ((CameraTextureView) aavbVar).g;
                if (height <= width) {
                    i = i2;
                } else {
                    i = i3;
                }
                if (height <= width) {
                    i2 = i3;
                }
                Object obj2 = agqcVar.d;
                if (obj2 != null) {
                    ((aqrk) agqcVar.c).c((SurfaceTexture) obj2, i, i2);
                    obj = agqcVar.d;
                } else {
                    EGLSurface l = ((asmg) agqcVar.e).l();
                    ((asmg) agqcVar.e).h(l, l);
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    ((asmg) agqcVar.e).i();
                    ((asmg) agqcVar.e).k(l);
                    agqcVar.d = new SurfaceTexture(iArr[0]);
                    ((SurfaceTexture) agqcVar.d).setDefaultBufferSize(i, i2);
                    agqcVar.c = new aqrk((EGLContext) ((asmg) agqcVar.e).c);
                    ((aqrk) agqcVar.c).c((SurfaceTexture) agqcVar.d, i, i2);
                    Object obj3 = agqcVar.c;
                    Object obj4 = agqcVar.a;
                    Object obj5 = ((aqrk) obj3).b;
                    synchronized (((aoxj) obj5).b) {
                        ((aoxj) obj5).b.clear();
                        ((aoxj) obj5).b.add(obj4);
                    }
                    obj = agqcVar.d;
                }
            }
            camera.setPreviewTexture((SurfaceTexture) obj);
            camera.setOneShotPreviewCallback(new Camera.PreviewCallback() { // from class: aaus
                @Override // android.hardware.Camera.PreviewCallback
                public final void onPreviewFrame(byte[] bArr, Camera camera2) {
                    final aava aavaVar = aava.this;
                    final SettableFuture settableFuture = aavaVar.q;
                    xzw.b(new Runnable() { // from class: aaux
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettableFuture settableFuture2 = settableFuture;
                            if (settableFuture2 == aava.this.q) {
                                settableFuture2.set(null);
                            }
                        }
                    }, 150L);
                }
            });
            camera.startPreview();
            camera.setAutoFocusMoveCallback(new Camera.AutoFocusMoveCallback() { // from class: aaur
                @Override // android.hardware.Camera.AutoFocusMoveCallback
                public final void onAutoFocusMoving(boolean z2, Camera camera2) {
                    qjb.a(new zth(5), aava.this.t);
                }
            });
            ((mgv) this.D.b()).f(mgv.B);
            if (parameters != null) {
                if (parameters.getMaxNumFocusAreas() > 0 && (supportedFocusModes = parameters.getSupportedFocusModes()) != null) {
                    supportedFocusModes.contains("auto");
                }
                parameters.getMaxNumMeteringAreas();
                if (!"true".equals(parameters.get("auto-exposure-lock-supported"))) {
                    "true".equals(parameters.get("auto-whitebalance-lock-supported"));
                }
            }
            aavu aavuVar = this.p;
            if (this.d.facing == 0) {
                z = true;
            }
            aavuVar.c = z;
            aavuVar.a();
            if (this.h == null) {
                aauz aauzVar2 = new aauz(this, this.C);
                this.h = aauzVar2;
                aauzVar2.enable();
            }
        } catch (IOException | RuntimeException e) {
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "tryShowPreview", (char) 1165, "CameraManager.java")).q("Error in CameraManager.tryShowPreview");
        }
    }

    public final void k(aavb aavbVar) {
        this.E.remove(aavbVar);
        if (this.E.isEmpty()) {
            c();
        }
    }

    public final void l(Camera camera) {
        q();
        try {
            Camera.Parameters parameters = camera.getParameters();
            p();
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains("off")) {
                parameters.setFlashMode("off");
            }
            camera.setParameters(parameters);
        } catch (RuntimeException e) {
            ((alwl) ((alwl) ((alwl) a.h()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "updateCameraFlashMode", (char) 1081, "CameraManager.java")).q("RuntimeException in CameraManager.updateCameraOrientation");
        }
    }

    public final void m(Camera camera, int i) {
        int i2;
        q();
        xyl.a(0, i % 90);
        if (this.g != null && !o()) {
            p();
            this.n = b();
            this.m = i;
            this.o = true;
            if (this.d.facing == 1) {
                this.k = (this.d.orientation + this.m) % 360;
                i2 = (720 - (this.d.orientation + this.n)) % 360;
            } else {
                i2 = ((this.d.orientation - this.n) + 360) % 360;
                this.k = ((this.d.orientation - this.m) + 360) % 360;
            }
            p();
            try {
                camera.setDisplayOrientation(i2);
                Camera.Parameters parameters = camera.getParameters();
                if (parameters != null) {
                    parameters.setRotation(this.k);
                    camera.setParameters(parameters);
                }
            } catch (RuntimeException e) {
                ((alwl) ((alwl) ((alwl) a.h()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "updateCameraOrientation", (char) 1051, "CameraManager.java")).q("RuntimeException in CameraManager.updateCameraOrientation");
            }
        }
    }

    public final boolean n() {
        if (this.d.facing == 1) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (!this.l.isDone()) {
            return true;
        }
        return false;
    }

    public final void p() {
        if (!this.z.isDone()) {
            this.z.isCancelled();
        }
    }
}
