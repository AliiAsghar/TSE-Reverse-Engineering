package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uij extends uig {
    private final Context g;
    private final mce h;
    private final yhf i;

    public uij(Context context, mce mceVar, yhf yhfVar, rgm rgmVar, MessagePartCoreData messagePartCoreData, uih uihVar) {
        super(messagePartCoreData, uihVar, rgmVar);
        this.g = context;
        this.h = mceVar;
        this.i = yhfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.uig
    public final void a() {
        this.i.j = true;
    }

    @Override // defpackage.uig
    protected final boolean b() {
        akrh e = aktp.e("VideoResizingJob#runInBackground");
        try {
            boolean z = false;
            if (this.c == null) {
                xzb.n("Bugle", "Cannot resize video with null contentUri");
            } else {
                mbm b = this.h.b("Bugle.Media.Attachment.Resize.Video.Duration");
                try {
                    File i = uhl.i(this.b, this.g);
                    yhf yhfVar = this.i;
                    yhc a = yhd.a();
                    a.g(this.c);
                    a.e(i);
                    a.f(this.d);
                    a.a = this.e;
                    a.c(((Boolean) uif.a.e()).booleanValue());
                    a.d(((Double) uif.b.e()).doubleValue());
                    if (yhfVar.d(a.a())) {
                        b.c();
                        z = true;
                    } else {
                        long j = this.i.k;
                        if (j > 0) {
                            i.delete();
                            yhf yhfVar2 = this.i;
                            yhc a2 = yhd.a();
                            a2.g(this.c);
                            a2.e(i);
                            a2.f(this.d);
                            a2.a = this.e;
                            a2.b((this.d / j) * 0.7200000286102295d);
                            a2.c(((Boolean) uif.a.e()).booleanValue());
                            a2.d(((Double) uif.b.e()).doubleValue());
                            z = yhfVar2.d(a2.a());
                        }
                    }
                } finally {
                    b.c();
                }
            }
            e.close();
            return z;
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
