package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xmj implements xmk {
    private final Set a;
    private final int b;
    private final UUID c;
    private final UUID d;

    public xmj(Set set, int i, UUID uuid, UUID uuid2) {
        uuid2.getClass();
        this.a = set;
        this.b = i;
        this.c = uuid;
        this.d = uuid2;
    }

    @Override // defpackage.xmk
    public final int a() {
        return this.b;
    }

    @Override // defpackage.xmk
    public final UUID b() {
        return this.d;
    }

    @Override // defpackage.xmk
    public final UUID c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    @Override // defpackage.xmk
    public final xiu d(aiqj aiqjVar) {
        Context context = (Context) aiqjVar.a.b();
        context.getClass();
        mce mceVar = (mce) aiqjVar.b.b();
        mceVar.getClass();
        mbl mblVar = (mbl) aiqjVar.e.b();
        mblVar.getClass();
        ((mbl) aiqjVar.f.b()).getClass();
        yyt yytVar = (yyt) aiqjVar.g.b();
        yytVar.getClass();
        wzs wzsVar = (wzs) aiqjVar.c.b();
        wzsVar.getClass();
        ((ogo) aiqjVar.h.b()).getClass();
        ((ogm) aiqjVar.i.b()).getClass();
        ogq ogqVar = (ogq) aiqjVar.d.b();
        ogqVar.getClass();
        return new xiu(context, mceVar, mblVar, yytVar, wzsVar, aiqjVar.j, ogqVar, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmj)) {
            return false;
        }
        xmj xmjVar = (xmj) obj;
        if (d.F(this.a, xmjVar.a) && this.b == xmjVar.b && d.F(this.c, xmjVar.c) && d.F(this.d, xmjVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "UriBasedSyncBatch(messageUris=" + this.a + ", targetMessagesToUpdate=" + this.b + ", syncId=" + this.c + ", batchId=" + this.d + ")";
    }
}
