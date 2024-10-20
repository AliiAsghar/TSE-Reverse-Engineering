package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tyb implements uaq {
    public static final xze a = xze.g("BugleEtouffee", "E2eeInfoDataService");
    public final armf b;
    public final armf c;
    public final ansy d;
    private final arwe f;
    private final armf g;

    public tyb(arwe arweVar, armf armfVar, armf armfVar2, ansy ansyVar, armf armfVar3) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        ansyVar.getClass();
        armfVar3.getClass();
        this.f = arweVar;
        this.b = armfVar;
        this.g = armfVar2;
        this.d = ansyVar;
        this.c = armfVar3;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    @Override // defpackage.uaq
    public final akfb a(DetailsPageE2eeInfoRequest detailsPageE2eeInfoRequest) {
        uqu uquVar = (uqu) this.g.b();
        arwe arweVar = (arwe) uquVar.a.b();
        arweVar.getClass();
        arpi arpiVar = (arpi) uquVar.d.b();
        arpiVar.getClass();
        arpi arpiVar2 = (arpi) uquVar.b.b();
        arpiVar2.getClass();
        ?? r7 = uquVar.j;
        ?? r8 = uquVar.f;
        ?? r9 = uquVar.g;
        ?? r10 = uquVar.c;
        xnv xnvVar = (xnv) uquVar.h.b();
        xnvVar.getClass();
        return new txw(arweVar, arpiVar, arpiVar2, r7, r8, r9, r10, xnvVar, uquVar.i, uquVar.e, detailsPageE2eeInfoRequest);
    }

    @Override // defpackage.uaq
    public final akul b(uav uavVar) {
        akul c;
        uavVar.getClass();
        c = qjh.c(this.f, arpj.a, arwf.a, new tyi(this, uavVar, (arpe) null, 1));
        return c;
    }

    @Override // defpackage.uaq
    public final akul c(Iterable iterable) {
        akul c;
        iterable.getClass();
        c = qjh.c(this.f, arpj.a, arwf.a, new jog(iterable, this, (arpe) null, 3));
        return c;
    }
}
