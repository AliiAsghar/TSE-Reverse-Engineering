package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class uig {
    public static final xze a = xze.g("BugleResizing", "ResizingJob");
    protected final Uri b;
    protected final Uri c;
    protected final long d;
    protected String e;
    public boolean f;
    private tql g;
    private final uih h;
    private final rgm i;

    public uig(MessagePartCoreData messagePartCoreData, uih uihVar, rgm rgmVar) {
        this.b = messagePartCoreData.w();
        this.c = messagePartCoreData.t();
        this.d = messagePartCoreData.p();
        this.e = messagePartCoreData.U();
        this.h = uihVar;
        this.i = rgmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a();

    protected abstract boolean b();

    public final void c() {
        xyl.h();
        this.g = tql.FAILED;
        try {
            try {
                try {
                    try {
                        xyo a2 = a.a();
                        a2.H("Starting");
                        a2.H(getClass().getName());
                        a2.z("contentUri", this.c);
                        a2.z("outputUri", this.b);
                        a2.y("maxFileSize", this.d);
                        a2.q();
                        if (b()) {
                            this.g = tql.SUCCEEDED;
                        }
                    } catch (Exception e) {
                        xyo e2 = a.e();
                        e2.H("Exception while transcoding.");
                        e2.z("contentUri", this.c);
                        e2.r(e);
                        if (e instanceof xys) {
                            this.g = tql.TOO_LARGE;
                        }
                    }
                } finally {
                    xyo a3 = a.a();
                    a3.H(getClass().getName());
                    a3.z("status", this.g);
                    a3.z("contentUri", this.c);
                    a3.z("outputUri", this.b);
                    a3.q();
                    this.f = true;
                    akrh e3 = aktp.e("ResizingJob::onFinished");
                    this.h.c(this.b);
                    e3.close();
                    if (this.c != null) {
                        akrh e4 = aktp.e("ResizingJob::startUAARA");
                        this.i.a(this.c.toString(), this.b.toString(), this.e, this.g).z();
                        e4.close();
                    }
                }
            } catch (Throwable th) {
                try {
                    "ResizingJob::onFinished".close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                "ResizingJob::startUAARA".close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
