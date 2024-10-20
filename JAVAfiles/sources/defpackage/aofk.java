package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.mediapipe.framework.GlSyncToken;
import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aofk implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aofk(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        byte[] bf;
        Object obj2;
        int i;
        int i2;
        List list;
        List list2;
        aoxi aoxiVar;
        switch (this.c) {
            case 0:
                int i3 = aofp.c;
                try {
                    this.a.run();
                    return;
                } catch (Exception e) {
                    ((asqc) this.b).d(e);
                    return;
                }
            case 1:
                aofj aofjVar = (aofj) this.b;
                Process.setThreadPriority(aofjVar.a);
                StrictMode.ThreadPolicy threadPolicy = aofjVar.b;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                this.a.run();
                return;
            case 2:
                int i4 = aofp.c;
                Object obj3 = this.b;
                try {
                    ((asqc) obj3).c(this.a.call());
                    return;
                } catch (Exception e2) {
                    ((asqc) obj3).d(e2);
                    return;
                }
            case 3:
                int i5 = aofp.c;
                try {
                    this.a.run();
                    return;
                } catch (Exception e3) {
                    ((asqc) this.b).d(e3);
                    throw e3;
                }
            case 4:
                int i6 = aofp.c;
                Object obj4 = this.b;
                try {
                    this.a.run();
                    ((asqc) obj4).c(null);
                    return;
                } catch (Exception e4) {
                    ((asqc) obj4).d(e4);
                    return;
                }
            case 5:
                Object obj5 = this.b;
                try {
                    boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
                    Object obj6 = this.a;
                    if (isLoggable) {
                        Log.i("FirebaseMessaging", "Starting download of: ".concat(((aoin) obj6).a.toString()));
                    }
                    URLConnection openConnection = ((aoin) obj6).a.openConnection();
                    if (openConnection.getContentLength() <= 1048576) {
                        InputStream inputStream = openConnection.getInputStream();
                        try {
                            aoib aoibVar = new aoib(inputStream, 0);
                            ArrayDeque arrayDeque = new ArrayDeque(20);
                            int highestOneBit = Integer.highestOneBit(0);
                            int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
                            int i7 = 0;
                            while (true) {
                                if (i7 < 2147483639) {
                                    int min2 = Math.min(min, 2147483639 - i7);
                                    byte[] bArr = new byte[min2];
                                    arrayDeque.add(bArr);
                                    int i8 = 0;
                                    while (i8 < min2) {
                                        int read = aoibVar.read(bArr, i8, min2 - i8);
                                        if (read == -1) {
                                            bf = aetn.bf(arrayDeque, i7);
                                            obj = obj6;
                                        } else {
                                            i8 += read;
                                            i7 += read;
                                        }
                                    }
                                    long j = min;
                                    if (min < 4096) {
                                        obj2 = obj6;
                                        i = 4;
                                    } else {
                                        obj2 = obj6;
                                        i = 2;
                                    }
                                    long j2 = j * i;
                                    if (j2 > 2147483647L) {
                                        i2 = Integer.MAX_VALUE;
                                    } else if (j2 < -2147483648L) {
                                        i2 = Integer.MIN_VALUE;
                                    } else {
                                        i2 = (int) j2;
                                    }
                                    obj6 = obj2;
                                    min = i2;
                                } else {
                                    obj = obj6;
                                    if (aoibVar.read() == -1) {
                                        bf = aetn.bf(arrayDeque, 2147483639);
                                    } else {
                                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                                    }
                                }
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (Log.isLoggable("FirebaseMessaging", 2)) {
                                Log.v("FirebaseMessaging", "Downloaded " + bf.length + " bytes from " + ((aoin) obj).a.toString());
                            }
                            int length = bf.length;
                            if (length <= 1048576) {
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bf, 0, length);
                                if (decodeByteArray != null) {
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(((aoin) obj).a.toString()));
                                    }
                                    ((acit) obj5).b(decodeByteArray);
                                    return;
                                }
                                throw new IOException("Failed to decode image: ".concat(((aoin) obj).a.toString()));
                            }
                            throw new IOException("Image exceeds max size of 1048576");
                        } finally {
                        }
                    } else {
                        throw new IOException("Content-Length exceeds max size of 1048576");
                    }
                } catch (Exception e5) {
                    ((acit) obj5).a(e5);
                    return;
                }
            case 6:
                Object obj7 = this.b;
                Object obj8 = this.a;
                synchronized (((aokl) obj8).d) {
                    ((aokl) obj8).d.remove(obj7);
                }
                return;
            case 7:
                ((aokz) this.b).b().f(this.a);
                return;
            case 8:
                aold aoldVar = (aold) this.b;
                if (!aoldVar.c) {
                    ?? r0 = this.a;
                    if (aoldVar.b != null) {
                        try {
                            r0.run();
                            return;
                        } catch (Throwable th) {
                            aoldVar.d.a(Status.c(th), new aqut());
                            return;
                        }
                    }
                    aoldVar.a.add(r0);
                    return;
                }
                return;
            case 9:
                ((aold) this.b).b.f(this.a);
                return;
            case 10:
                ((aoln) this.a).b.remove(this.b);
                return;
            case 11:
                ((aoln) this.b).h((aqut) this.a);
                return;
            case 12:
                Object obj9 = this.a;
                aoln aolnVar = (aoln) this.b;
                aolnVar.c.add(new aolk(aolnVar, obj9));
                aolnVar.g();
                return;
            case 13:
                ((aoln) this.a).j((atii) this.b);
                return;
            case 14:
                try {
                    this.a.run();
                    return;
                } catch (Throwable th2) {
                    aoln aolnVar2 = (aoln) this.b;
                    aolnVar2.h = true;
                    apsd apsdVar = aolnVar2.j;
                    if (apsdVar != null) {
                        apsdVar.a(Status.c(th2), new aqut());
                        aqru aqruVar = aolnVar2.i;
                        if (aqruVar != null && aolnVar2.e.e == 4) {
                            aqruVar.c(null, th2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 15:
                ((aoln) this.a).j((atii) this.b);
                return;
            case 16:
                aolj aoljVar = (aolj) this.b;
                if (!aoljVar.a) {
                    aoljVar.c.c((aqut) this.a);
                    return;
                }
                return;
            case 17:
                aolj aoljVar2 = (aolj) this.b;
                if (!aoljVar2.a) {
                    aoljVar2.c.d(this.a);
                    return;
                }
                return;
            case 18:
                ((aolr) this.b).a.c((aqut) this.a);
                return;
            case 19:
                ((aolr) this.b).a.d(this.a);
                return;
            default:
                Object obj10 = this.a;
                aoxj aoxjVar = (aoxj) obj10;
                if (this.b != aoxjVar.a) {
                    return;
                }
                aoxjVar.c = true;
                List list3 = ((aoxj) obj10).b;
                synchronized (list3) {
                    try {
                        boolean z = false;
                        for (aoxl aoxlVar : ((aoxj) obj10).b) {
                            synchronized (obj10) {
                                try {
                                    aoxiVar = (aoxi) ((aoxj) obj10).d.poll();
                                    ((aoxj) obj10).e++;
                                } finally {
                                    th = th;
                                    list = list3;
                                    while (true) {
                                        try {
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            }
                            if (aoxiVar == null) {
                                aoxiVar = ((aoxj) obj10).a();
                            } else {
                                if (aoxiVar.c == ((aoxj) obj10).k && aoxiVar.d == ((aoxj) obj10).l) {
                                    aoxj.g(aoxiVar);
                                }
                                aoxj.g(aoxiVar);
                                aoxj.f(aoxiVar);
                                aoxiVar = ((aoxj) obj10).a();
                            }
                            ((aoxr) obj10).h(aoxiVar.b, ((aoxj) obj10).k, ((aoxj) obj10).l);
                            aoxq aoxqVar = ((aoxj) obj10).f;
                            SurfaceTexture surfaceTexture = ((aoxj) obj10).a;
                            GLES20.glClear(16384);
                            GLES20.glActiveTexture(33984);
                            aoxt.c("glActiveTexture");
                            surfaceTexture.updateTexImage();
                            surfaceTexture.getTransformMatrix(aoxqVar.f);
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            aoxt.c("glTexParameteri");
                            GLES20.glUseProgram(aoxqVar.c);
                            aoxt.c("glUseProgram");
                            GLES20.glUniform1i(aoxqVar.d, 0);
                            aoxt.c("glUniform1i");
                            GLES20.glUniformMatrix4fv(aoxqVar.e, 1, false, aoxqVar.f, 0);
                            aoxt.c("glUniformMatrix4fv");
                            GLES20.glEnableVertexAttribArray(1);
                            GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (Buffer) aoxq.b);
                            GLES20.glEnableVertexAttribArray(2);
                            GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, (Buffer) aoxq.a);
                            aoxt.c("program setup");
                            GLES20.glDrawArrays(5, 0, 4);
                            aoxt.c("glDrawArrays");
                            GLES20.glBindTexture(36197, 0);
                            aoxt.c("glBindTexture");
                            boolean z2 = aoxqVar.g;
                            GLES20.glFinish();
                            long timestamp = ((aoxj) obj10).a.getTimestamp() / 1000;
                            if (((aoxj) obj10).g && ((aoxj) obj10).j) {
                                long j3 = ((aoxj) obj10).h + timestamp;
                                list2 = list3;
                                try {
                                    long j4 = ((aoxj) obj10).i;
                                    if (j3 <= j4) {
                                        ((aoxj) obj10).h = (j4 + 1) - timestamp;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    throw th;
                                }
                            }
                            long j5 = timestamp + ((aoxj) obj10).h;
                            aoxiVar.e = j5;
                            ((aoxj) obj10).i = j5;
                            ((aoxj) obj10).j = true;
                            if (aoxlVar != null) {
                                if (Log.isLoggable("ExternalTextureConv", 2)) {
                                    Log.v("ExternalTextureConv", String.format("Locking tex: %d width: %d height: %d", Integer.valueOf(aoxiVar.b), Integer.valueOf(aoxiVar.c), Integer.valueOf(aoxiVar.d)));
                                }
                                synchronized (aoxiVar) {
                                    GlSyncToken glSyncToken = aoxiVar.g;
                                    if (glSyncToken != null) {
                                        glSyncToken.release();
                                        aoxiVar.g = null;
                                    }
                                    aoxiVar.f = true;
                                }
                                aoxlVar.a(aoxiVar);
                            }
                            z = true;
                            list3 = list2;
                        }
                        if (!z) {
                            ((aoxj) obj10).a.updateTexImage();
                        }
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                break;
        }
    }

    public /* synthetic */ aofk(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
