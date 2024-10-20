package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjz {
    public final ArrayList a;
    public final uj b;
    public final ArrayList c;
    public final ArrayList d;
    public final HashSet e;
    public final HashSet f;
    public final HashSet g;
    public final ArrayList h;

    public xjz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjz)) {
            return false;
        }
        xjz xjzVar = (xjz) obj;
        if (d.F(this.a, xjzVar.a) && d.F(this.b, xjzVar.b) && d.F(this.c, xjzVar.c) && d.F(this.d, xjzVar.d) && d.F(this.e, xjzVar.e) && d.F(this.f, xjzVar.f) && d.F(this.g, xjzVar.g) && d.F(this.h, xjzVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "ScanLists(smsToAdd=" + this.a + ", mmsToAdd=" + this.b + ", mmsToAddInOrder=" + this.c + ", messagesToDelete=" + this.d + ", messagesToMerge=" + this.e + ", splitMessagePairs=" + this.f + ", threadsToMerge=" + this.g + ", scanProblems=" + this.h + ")";
    }

    public /* synthetic */ xjz(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        uj ujVar = new uj((byte[]) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        this.a = arrayList;
        this.b = ujVar;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = hashSet;
        this.f = hashSet2;
        this.g = hashSet3;
        this.h = arrayList4;
    }
}
