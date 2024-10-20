package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbz {
    public static final bbz a = new bbz(null, null);
    public final cti b;
    public final diy c;

    public bbz(cti ctiVar, diy diyVar) {
        this.b = ctiVar;
        this.c = diyVar;
    }

    public static /* synthetic */ bbz a(bbz bbzVar, cti ctiVar, diy diyVar, int i) {
        if ((i & 1) != 0) {
            ctiVar = bbzVar.b;
        }
        if ((i & 2) != 0) {
            diyVar = bbzVar.c;
        }
        return new bbz(ctiVar, diyVar);
    }
}
