package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.android.vcard.VCardConstants;
import com.google.android.libraries.hats20.SurveyPromptActivity;
import com.google.mediapipe.framework.TextureFrame;
import java.io.File;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agqd implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public agqd(SurveyPromptActivity surveyPromptActivity, int i) {
        this.b = i;
        this.a = surveyPromptActivity;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, agzu] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, agzz] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, agzz] */
    /* JADX WARN: Type inference failed for: r8v0, types: [javax.microedition.khronos.egl.EGL10, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        aiim aiimVar;
        int i = 2;
        TextureFrame textureFrame = null;
        ArrayList arrayList = null;
        int i2 = 1;
        int i3 = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                agqe agqeVar = (agqe) obj;
                synchronized (agqeVar.c) {
                    while (!((agqe) obj).c.isEmpty()) {
                        ((TextureFrame) ((agqe) obj).c.pollFirst()).release();
                    }
                }
                aoxu aoxuVar = agqeVar.k;
                if (aoxuVar != null) {
                    GLES20.glDeleteProgram(aoxuVar.b);
                    agqeVar.k = null;
                }
                asmg asmgVar = agqeVar.l;
                if (asmgVar != null) {
                    asmgVar.i();
                    EGLSurface eGLSurface = agqeVar.j;
                    if (eGLSurface != null) {
                        agqeVar.l.k(eGLSurface);
                        agqeVar.j = null;
                    }
                    Surface surface = agqeVar.f;
                    if (surface != null) {
                        surface.release();
                    }
                    agqeVar.l.j();
                    agqeVar.l = null;
                }
                SurfaceTexture surfaceTexture = agqeVar.e;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    agqeVar.e = null;
                    return;
                }
                return;
            case 1:
                agqe agqeVar2 = (agqe) this.a;
                if (agqeVar2.e != null && agqeVar2.j == null) {
                    agqeVar2.l = new asmg(agqeVar2.b);
                    agqeVar2.f = new Surface(agqeVar2.e);
                    asmg asmgVar2 = agqeVar2.l;
                    Surface surface2 = agqeVar2.f;
                    if (surface2 instanceof Surface) {
                        EGLSurface eglCreateWindowSurface = asmgVar2.b.eglCreateWindowSurface((EGLDisplay) asmgVar2.a, (EGLConfig) asmgVar2.e, surface2, new int[]{12344});
                        asmgVar2.g("eglCreateWindowSurface");
                        if (eglCreateWindowSurface != null) {
                            agqeVar2.j = eglCreateWindowSurface;
                            asmg asmgVar3 = agqeVar2.l;
                            EGLSurface eGLSurface2 = agqeVar2.j;
                            asmgVar3.h(eGLSurface2, eGLSurface2);
                            agqeVar2.k = new aoxu();
                            aoxu aoxuVar2 = agqeVar2.k;
                            HashMap hashMap = new HashMap();
                            hashMap.put("position", 1);
                            hashMap.put("texture_coordinate", 2);
                            int d = aoxt.d("varying mediump vec2 sample_coordinate;\nuniform sampler2D video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", hashMap);
                            aoxuVar2.b = d;
                            aoxuVar2.c = GLES20.glGetUniformLocation(d, "video_frame");
                            aoxuVar2.d = GLES20.glGetUniformLocation(aoxuVar2.b, "texture_transform");
                            aoxt.c("glGetUniformLocation");
                            Matrix.setIdentityM(aoxuVar2.e, 0);
                            agqeVar2.d.set(true);
                            return;
                        }
                        throw new RuntimeException("surface was null");
                    }
                    throw new RuntimeException("invalid surface: ".concat(String.valueOf(String.valueOf(surface2))));
                }
                return;
            case 2:
                Object obj2 = this.a;
                agqe agqeVar3 = (agqe) obj2;
                synchronized (agqeVar3.c) {
                    while (!((agqe) obj2).c.isEmpty()) {
                        if (textureFrame != null) {
                            Log.d(agqe.a, String.format("Dropped frame (tex=%d, ts=%,d) ", Integer.valueOf(textureFrame.getTextureName()), Long.valueOf(textureFrame.getTimestamp())));
                            textureFrame.release();
                        }
                        textureFrame = (TextureFrame) ((agqe) obj2).c.pollFirst();
                    }
                }
                if (textureFrame != null) {
                    if (agqeVar3.e != null) {
                        GLES20.glViewport(0, 0, agqeVar3.g, agqeVar3.h);
                        GLES20.glClear(16384);
                        aoxu aoxuVar3 = agqeVar3.k;
                        int textureName = textureFrame.getTextureName();
                        GLES20.glClear(16384);
                        GLES20.glActiveTexture(33984);
                        aoxt.c("glActiveTexture");
                        GLES20.glBindTexture(3553, textureName);
                        aoxt.c("glBindTexture");
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        aoxt.c("glTexParameteri");
                        GLES20.glUseProgram(aoxuVar3.b);
                        aoxt.c("glUseProgram");
                        GLES20.glUniform1i(aoxuVar3.c, 0);
                        aoxt.c("glUniform1i");
                        GLES20.glUniformMatrix4fv(aoxuVar3.d, 1, false, aoxuVar3.e, 0);
                        aoxt.c("glUniformMatrix4fv");
                        GLES20.glEnableVertexAttribArray(1);
                        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (Buffer) aoxo.a);
                        GLES20.glEnableVertexAttribArray(2);
                        GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, (Buffer) aoxu.a);
                        aoxt.c("program setup");
                        GLES20.glDrawArrays(5, 0, 4);
                        aoxt.c("glDrawArrays");
                        GLES20.glBindTexture(3553, 0);
                        aoxt.c("glBindTexture");
                        GLES20.glFlush();
                        EGL14.eglSwapBuffers(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377));
                    }
                    aoxl aoxlVar = agqeVar3.i;
                    if (aoxlVar != null) {
                        aoxlVar.a(textureFrame);
                        return;
                    } else {
                        textureFrame.release();
                        return;
                    }
                }
                return;
            case 3:
                ((SurveyPromptActivity) this.a).w = true;
                agrn.c().b().a = false;
                ((SurveyPromptActivity) this.a).finish();
                return;
            case 4:
                alvi alviVar = agsv.a;
                try {
                    Class.forName("com.google.android.libraries.inputmethod.cache.module.AutoDirectoryCleanerModule$DirectoryAutoCleanerTaskRunner");
                    ((alvg) ((alvg) agsv.a.d()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "maybeCleanupObsoleteFiles", 189, "AutoCleanableDirectory.java")).q("Clean up task will run on scheduler.");
                    return;
                } catch (ClassNotFoundException unused) {
                    Object obj3 = this.a;
                    ((alvg) ((alvg) agsv.a.d()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "maybeCleanupObsoleteFiles", 193, "AutoCleanableDirectory.java")).q("Clean up task runs immediately.");
                    ((alvg) ((alvg) agsv.a.d()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 309, "AutoCleanableDirectory.java")).t("Cleaning up on %s", Thread.currentThread());
                    ahbi ahbiVar = ahbi.b;
                    Context context = (Context) obj3;
                    File cacheDir = ahbn.a(context).getCacheDir();
                    agst a = agsv.a(context);
                    agsv.e(ahbiVar, context, a, agsv.b(context));
                    agsv.e(ahbiVar, context, a, agsv.c(context));
                    ahbiVar.b(new File(cacheDir, "mozc.data"));
                    ahbiVar.b(new File(cacheDir, "BundledEmojiListLoader"));
                    ahbiVar.b(new File(cacheDir, "kb_def"));
                    ahbiVar.b(new File(cacheDir, "ThemeBuilderActivity_new_image_cache"));
                    ahbiVar.c(cacheDir, new agss(i3));
                    ahbiVar.c(cacheDir, new agss(i));
                    return;
                }
            case 5:
                ((agtg) this.a).a.cancel(false);
                return;
            case 6:
                Object obj4 = this.a;
                agvz agvzVar = (agvz) obj4;
                agvj a2 = agvzVar.a();
                if (a2 == null) {
                    ((alvg) ((alvg) agvz.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "onSwitchRecentCategory", 1053, "EmojiPickerController.java")).q("next emoji provider is not available. ");
                    return;
                } else {
                    agvzVar.i.set(a2);
                    albo.bR(aglo.z(agvzVar.m, (agvj) agvzVar.i.get(), agvzVar.s, agvzVar.e, agvzVar.f, agvzVar.p), new adnx(obj4, 8), agtz.b);
                    return;
                }
            case 7:
                Object obj5 = this.a;
                ((agvz) obj5).k.ifPresent(new aidg(obj5, i2));
                return;
            case 8:
                aluq listIterator = ((alpt) this.a).listIterator();
                while (listIterator.hasNext()) {
                    ((agya) listIterator.next()).a();
                }
                return;
            case 9:
                Object obj6 = this.a;
                if (obj6 instanceof RuntimeException) {
                    throw ((RuntimeException) obj6);
                }
                throw new IllegalStateException((Throwable) obj6);
            case 10:
                ((ahaa) this.a.getKey()).a();
                return;
            case 11:
                Object obj7 = this.a;
                ahab ahabVar = (ahab) obj7;
                Executor executor = ahabVar.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                boolean c = agtj.c(executor);
                while (true) {
                    synchronized (ahabVar.d) {
                        aiimVar = (aiim) ((ahab) obj7).d.pollFirst();
                    }
                    if (aiimVar != null) {
                        ahbe b = agzy.b(String.valueOf(aiimVar.c).concat(".notifyOnExecutor"));
                        try {
                            try {
                                ?? r0 = aiimVar.d;
                                if (r0 == agzy.b) {
                                    aiimVar.a.b((Class) aiimVar.b);
                                } else {
                                    aiimVar.a.c(r0);
                                }
                            } catch (Exception e) {
                                if (!ahaw.a) {
                                    ((alvg) ((alvg) ((alvg) agzy.a.h()).g(e)).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter$NotificationQueue", "notifyOnExecutor", 871, "NotificationCenter.java")).t("Failed to notify %s", aiimVar.c);
                                } else {
                                    throw new AssertionError("Failed to notify " + ((String) aiimVar.c), e);
                                }
                            }
                            if (arrayList == null && c) {
                                arrayList = new ArrayList();
                            }
                            if (arrayList != null) {
                                arrayList.add(aiimVar.c);
                            }
                            b.close();
                        } finally {
                        }
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (arrayList != null && elapsedRealtime2 > 20) {
                            ((alvg) ((alvg) agzy.a.i()).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter$NotificationQueue", "notifyOnExecutor", 883, "NotificationCenter.java")).C("Heavy notify work detected on UI thread: %s takes %sms", arrayList, elapsedRealtime2);
                            return;
                        }
                        return;
                    }
                }
                break;
            case 12:
                ((ahcz) this.a).e();
                return;
            case 13:
                ((ahdj) this.a).a();
                return;
            case 14:
                ((ahdj) this.a).a();
                return;
            case 15:
                ahix ahixVar = (ahix) this.a;
                long j = ahixVar.a.get();
                xyo c2 = uiy.a.c();
                c2.H("Download progress, notifying callback");
                uix uixVar = ahixVar.c;
                Object obj8 = uixVar.c;
                c2.L(VCardConstants.PROPERTY_URL, ((Uri) obj8).toString());
                c2.y("progress", j);
                long j2 = uixVar.a;
                c2.y("expected size", j2);
                c2.q();
                Object obj9 = uixVar.e;
                try {
                    Iterator it = ((ujd) obj9).b.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        ((ujd) obj9).c(new vhq((uji) it.next(), (Uri) obj8, j, j2, 1));
                        it = it2;
                    }
                    return;
                } catch (RuntimeException e2) {
                    xyo b2 = uiy.a.b();
                    b2.H("Download callback onProgress error");
                    b2.r(e2);
                    return;
                }
            case 16:
                ahlt ahltVar = (ahlt) this.a;
                ahka ahkaVar = ahltVar.h;
                ahkaVar.getClass();
                if (ahltVar.b == 0) {
                    ahltVar.c = true;
                    Iterator it3 = ahltVar.g.iterator();
                    while (it3.hasNext()) {
                        ((ahli) it3.next()).k(ahkaVar);
                    }
                }
                ahltVar.h.getClass();
                ahltVar.a();
                return;
            case 17:
                ((ahnc) this.a).a();
                return;
            case 18:
                ((ahnf) this.a).c();
                return;
            case 19:
                ((ahnf) this.a).d();
                return;
            default:
                ((ahnf) this.a).b();
                return;
        }
    }

    public /* synthetic */ agqd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
