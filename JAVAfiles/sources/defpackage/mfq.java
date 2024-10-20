package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfq implements mfd {
    public final arpi a;
    private final armf b;
    private final qvv c;
    private final qvr d;
    private final armf e;
    private final msk f;
    private final omd g;
    private final ojm h;
    private final arwe i;

    public mfq(armf armfVar, qvv qvvVar, qvr qvrVar, armf armfVar2, msk mskVar, omd omdVar, ojm ojmVar, arwe arweVar, arpi arpiVar) {
        armfVar.getClass();
        qvvVar.getClass();
        qvrVar.getClass();
        armfVar2.getClass();
        mskVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        this.b = armfVar;
        this.c = qvvVar;
        this.d = qvrVar;
        this.e = armfVar2;
        this.f = mskVar;
        this.g = omdVar;
        this.h = ojmVar;
        this.i = arweVar;
        this.a = arpiVar;
    }

    private final void c(aozy aozyVar) {
        mar a = ((mbb) this.b.b()).a();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.PARTICIPANTS_TABLE_VALIDATION_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amwp amwpVar = (amwp) aozyVar.s();
        amwpVar.getClass();
        amfrVar2.bA = amwpVar;
        amfrVar2.h |= 4096;
        a.a(amfqVar, mbt.LOG_SPEC_MY_IDENTITY_EVENTS);
    }

    @Override // defpackage.mfd
    public final void a() {
        if (((ansy) ((nsr) this.g).a.b()).e("bugle.enable_participants_table_shadow_launch")) {
            qjh.l(this.i, null, new jks(this, (arpe) null, 12), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r1v6, types: [msh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfq.b(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, arpe):java.lang.Object");
    }
}
