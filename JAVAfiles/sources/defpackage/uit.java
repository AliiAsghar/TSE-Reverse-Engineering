package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uit extends uim {
    private static final alvi h = alvi.m("com/google/android/apps/messaging/shared/datamodel/resizing/v2/VideoResizingJob");
    private final Context i;
    private final mce j;
    private final yhf k;
    private final armf l;

    public uit(Context context, mce mceVar, yhf yhfVar, armf armfVar, anen anenVar, uip uipVar, String str) {
        super(context, uipVar, str, anenVar);
        this.i = context;
        this.j = mceVar;
        this.k = yhfVar;
        this.l = armfVar;
    }

    @Override // defpackage.uim
    protected final akul a() {
        akul ag;
        akul akulVar;
        akrh e = aktp.e("VideoResizingJob#runInBackground");
        try {
            if (this.c == null) {
                alvw i = h.i();
                i.X(alwp.a, "BugleResizing");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/VideoResizingJob", "runInBackgroundInTrace", 78, "VideoResizingJob.java")).q("Cannot resize video with null contentUri");
                akulVar = aktp.ag(false);
            } else {
                mbm b = this.j.b("Bugle.Media.Attachment.Resize.Video.Duration");
                try {
                    File i2 = uhl.i(this.b, this.i);
                    if (this.d >= ((Long) uif.n.e()).longValue()) {
                        yhp yhpVar = (yhp) this.l.b();
                        yhc a = yhd.a();
                        a.g(this.c);
                        a.e(i2);
                        a.a = this.e;
                        a.f((long) (this.d * ((Double) uif.c.e()).doubleValue()));
                        a.c(((Boolean) uif.a.e()).booleanValue());
                        a.d(((Double) uif.c.e()).doubleValue());
                        yhd a2 = a.a();
                        akrh e2 = aktp.e("Transformer.transcode");
                        try {
                            ag = akul.g(arro.I(yhpVar.c, new xgk(yhpVar, a2, (arpe) null, 15)));
                            e2.b(ag);
                            armd.i(e2, null);
                            ag.getClass();
                        } finally {
                        }
                    } else {
                        yhf yhfVar = this.k;
                        yhc a3 = yhd.a();
                        a3.g(this.c);
                        a3.e(i2);
                        a3.a = this.e;
                        a3.f(this.d);
                        a3.c(((Boolean) uif.a.e()).booleanValue());
                        a3.d(((Double) uif.b.e()).doubleValue());
                        if (yhfVar.d(a3.a())) {
                            ag = aktp.ag(true);
                        } else {
                            long j = this.k.k;
                            if (j > 0) {
                                i2.delete();
                                yhf yhfVar2 = this.k;
                                yhc a4 = yhd.a();
                                a4.g(this.c);
                                a4.e(i2);
                                a4.a = this.e;
                                a4.f(this.d);
                                a4.b((this.d / j) * 0.7200000286102295d);
                                a4.c(((Boolean) uif.a.e()).booleanValue());
                                a4.d(((Double) uif.b.e()).doubleValue());
                                ag = aktp.ag(Boolean.valueOf(yhfVar2.d(a4.a())));
                            } else {
                                ag = aktp.ag(false);
                            }
                        }
                    }
                    akulVar = ag;
                } finally {
                    b.c();
                }
            }
            e.close();
            return akulVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
