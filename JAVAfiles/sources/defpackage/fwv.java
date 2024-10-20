package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwv implements fvd {
    public final fvc a;
    public final boolean b;
    public final ScheduledExecutorService c;
    public volatile int d;
    private final Context e;
    private final fvz f;
    private final eth g;
    private fxa h;
    private int i;

    public fwv(Context context, fvz fvzVar, fvc fvcVar, eth ethVar, boolean z) {
        boolean z2;
        if (fvzVar.e != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        dzg.d(z2);
        int i = fvzVar.f;
        dzg.d(false);
        this.e = context;
        this.f = fvzVar;
        this.a = fvcVar;
        this.g = ethVar;
        this.b = z;
        this.c = Executors.newSingleThreadScheduledExecutor();
        this.i = 0;
    }

    public static String a(Context context, ere ereVar) {
        erb erbVar = ereVar.b;
        if (erbVar == null) {
            return null;
        }
        String str = erbVar.b;
        if (str == null) {
            if (Objects.equals(erbVar.a.getScheme(), "content")) {
                return context.getContentResolver().getType(erbVar.a);
            }
            String path = erbVar.a.getPath();
            if (path == null) {
                return null;
            }
            int lastIndexOf = path.lastIndexOf(".");
            if (lastIndexOf >= 0) {
                char c = 65535;
                if (lastIndexOf < path.length() - 1) {
                    String ap = albo.ap(path.substring(lastIndexOf + 1));
                    switch (ap.hashCode()) {
                        case 96870:
                            if (ap.equals("arw")) {
                                c = 16;
                                break;
                            }
                            break;
                        case 97669:
                            if (ap.equals("bmp")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 98723:
                            if (ap.equals("cr2")) {
                                c = 17;
                                break;
                            }
                            break;
                        case 99453:
                            if (ap.equals("dib")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 102340:
                            if (ap.equals("gif")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case 104085:
                            if (ap.equals("ico")) {
                                c = 21;
                                break;
                            }
                            break;
                        case 104430:
                            if (ap.equals("k25")) {
                                c = 18;
                                break;
                            }
                            break;
                        case 105133:
                            if (ap.equals("jfi")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 105223:
                            if (ap.equals("jif")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 105439:
                            if (ap.equals("jpe")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 105441:
                            if (ap.equals("jpg")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 111145:
                            if (ap.equals("png")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case 112680:
                            if (ap.equals("raw")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 114276:
                            if (ap.equals("svg")) {
                                c = 19;
                                break;
                            }
                            break;
                        case 114833:
                            if (ap.equals("tif")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 3006482:
                            if (ap.equals("avif")) {
                                c = 22;
                                break;
                            }
                            break;
                        case 3198679:
                            if (ap.equals("heic")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 3198682:
                            if (ap.equals("heif")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3259225:
                            if (ap.equals("jfif")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case 3268712:
                            if (ap.equals("jpeg")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 3542678:
                            if (ap.equals("svgz")) {
                                c = 20;
                                break;
                            }
                            break;
                        case 3559925:
                            if (ap.equals("tiff")) {
                                c = '\r';
                                break;
                            }
                            break;
                        case 3645340:
                            if (ap.equals("webp")) {
                                c = 11;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                            return "image/bmp";
                        case 2:
                            return "image/heif";
                        case 3:
                            return "image/heic";
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                            return "image/jpeg";
                        case '\n':
                            return "image/png";
                        case 11:
                            return "image/webp";
                        case '\f':
                            return "image/gif";
                        case '\r':
                        case 14:
                            return "image/tiff";
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            return "image/raw";
                        case 19:
                        case 20:
                            return "image/svg+xml";
                        case 21:
                            return "image/x-icon";
                        case 22:
                            return "image/avif";
                        default:
                            return null;
                    }
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public final void b(Bitmap bitmap, eqn eqnVar) {
        try {
            fxa fxaVar = this.h;
            if (fxaVar == null) {
                this.h = ((fxf) this.a).i(eqnVar);
                this.c.schedule(new faq((Object) this, bitmap, eqnVar, 6), 10L, TimeUnit.MILLISECONDS);
                return;
            }
            fvz fvzVar = this.f;
            long j = fvzVar.e;
            int i = fvzVar.f;
            if (((fxe) fxaVar).a.h(bitmap, new etl(new etl(j).a)) != 1) {
                this.c.schedule(new faq((Object) this, bitmap, eqnVar, 7), 10L, TimeUnit.MILLISECONDS);
            } else {
                this.d = 100;
                this.h.f();
            }
        } catch (fwo e) {
            this.a.b(e);
        } catch (RuntimeException e2) {
            this.a.b(new fwo("Asset loader error", e2, 1000));
        }
    }

    @Override // defpackage.fvd
    public final alor e() {
        return altc.a;
    }

    @Override // defpackage.fvd
    public final void f() {
        this.i = 0;
        this.c.shutdownNow();
    }

    @Override // defpackage.fvd
    public final void g() {
        ListenableFuture bH;
        this.i = 2;
        this.a.a(this.f.e);
        int i = 1;
        this.a.c(1);
        String a = a(this.e, this.f.a);
        byte[] bArr = null;
        if (a != null && eul.V(a)) {
            eth ethVar = this.g;
            erb erbVar = this.f.a.b;
            dzg.g(erbVar);
            bH = ((evh) ethVar).a.submit(new haw(ethVar, erbVar.a, i, bArr));
        } else {
            bH = albo.bH(new erm("Attempted to load a Bitmap from unsupported MIME type: ".concat(String.valueOf(a)), null, false, 1));
        }
        albo.bR(bH, new isn(this, 1), this.c);
    }

    @Override // defpackage.fvd
    public final int h(arjs arjsVar) {
        if (this.i == 2) {
            arjsVar.a = this.d;
        }
        return this.i;
    }
}
