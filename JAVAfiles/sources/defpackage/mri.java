package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mri implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mri(armf armfVar, armf armfVar2, ParticipantsTable.BindData bindData, int i) {
        this.d = i;
        this.b = armfVar;
        this.c = armfVar2;
        this.a = bindData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [ykb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v101, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v138, types: [qpj] */
    /* JADX WARN: Type inference failed for: r1v15, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v58, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v88, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v98, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [alhr] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v80, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v84, types: [qpj] */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r3v1, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        Object apply;
        agnw d;
        agnw d2;
        agnw d3;
        agnw d4;
        int i = 2;
        int i2 = 3;
        boolean z = false;
        switch (this.d) {
            case 0:
                ?? r1 = this.b;
                int ordinal = ((msy) r1.get()).ordinal();
                ?? r3 = this.c;
                switch (ordinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 11:
                    case 12:
                    case 15:
                        return new msf((String) r3.get());
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 13:
                    case 14:
                        return new msf(((yjr) ((mrk) this.a).g.b()).j((String) r3.get()));
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((msy) r1.get()).name())));
                }
            case 1:
                return mrp.b(this.a, this.b, this.c);
            case 2:
                uuf uufVar = mrk.a;
                if (((Boolean) this.a.get()).booleanValue()) {
                    return (msy) this.b.get();
                }
                return (msy) this.c.get();
            case 3:
                return mrp.a(this.a, this.b, this.c);
            case 4:
                uuf uufVar2 = mrq.a;
                boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
                Object obj = this.c;
                Object obj2 = this.b;
                ?? r2 = obj;
                if (true == booleanValue) {
                    r2 = obj2;
                }
                return (mrp) r2.get();
            case 5:
                return mrp.a(this.a, this.b, this.c);
            case 6:
                return mrp.b(this.a, this.b, this.c);
            case 7:
                ?? r12 = this.b;
                int ordinal2 = ((mrp) r12.get()).a.ordinal();
                ?? r32 = this.c;
                switch (ordinal2) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 11:
                    case 12:
                    case 15:
                        return new msf((String) r32.get());
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 13:
                    case 14:
                        return new msf(((yjr) ((mrq) this.a).g.b()).j((String) r32.get()));
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((mrp) r12.get()).a.name())));
                }
            case 8:
                ?? r13 = this.b;
                switch (((mru) r13.get()).ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return Optional.empty();
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        mrv mrvVar = (mrv) this.c.get();
                        if (mrvVar == null) {
                            return Optional.empty();
                        }
                        boolean v = ((mrw) this.a).v(mrvVar);
                        aodz aodzVar = mrvVar.b;
                        if (v) {
                            if (mrw.A(aodzVar)) {
                                return Optional.of(new yjt(aodzVar.c()));
                            }
                            return Optional.empty();
                        }
                        if (aodzVar.f()) {
                            return Optional.of(new yjt(aodzVar.c()));
                        }
                        return Optional.empty();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((mru) r13.get()).name())));
                }
            case 9:
                ?? r14 = this.b;
                if (((Optional) r14.get()).isEmpty()) {
                    return Optional.empty();
                }
                mrv mrvVar2 = (mrv) this.c.get();
                if (mrvVar2 == null) {
                    return Optional.empty();
                }
                mrw mrwVar = (mrw) this.a;
                String h = ((anhn) mrwVar.c.b()).h(mrvVar2.b);
                if (albo.ah(h)) {
                    h = ((anhn) mrwVar.c.b()).b(((yjt) ((Optional) r14.get()).get()).a);
                }
                if (albo.ah(h)) {
                    return Optional.empty();
                }
                return Optional.of(h);
            case 10:
                return ((msb) this.a).c.b().g(this.b, this.c);
            case 11:
                return ((msb) this.a).c.b().h(this.b, (String) this.c);
            case 12:
                return ((msb) this.a).c.b().c((String) this.c, this.b);
            case 13:
                alwo alwoVar = nfq.a;
                return ((lfl) this.b.b()).z(((yjy) this.c.b()).h(((ParticipantsTable.BindData) this.a).p()));
            case 14:
                jat jatVar = (jat) this.a;
                wfh wfhVar = (wfh) jatVar.d.b();
                wfhVar.getClass();
                anen anenVar = (anen) jatVar.a.b();
                anenVar.getClass();
                ?? b = jatVar.b.b();
                b.getClass();
                ?? r9 = jatVar.f;
                return new nga(jatVar.c, jatVar.e, wfhVar, anenVar, jatVar.g, b, r9, (Optional) this.c, this.b);
            case 15:
                ptw ptwVar = new ptw();
                ptwVar.aj("writeRcsCapabilitiesIfFresher");
                ?? r4 = this.c;
                String str = (String) r4;
                ptwVar.d(str);
                ptz ptzVar = (ptz) this.a;
                ptwVar.e(ptzVar);
                Object obj3 = this.b;
                Instant instant = (Instant) obj3;
                ptwVar.c(instant);
                apply = new mut(r4, obj3, 7).apply(new ptx());
                ptwVar.Z(new agpw((ptx) apply));
                if (ptwVar.a().e() > 0) {
                    return true;
                }
                tmc d5 = pty.d();
                d5.o(str);
                d5.p(ptzVar);
                d5.n(instant);
                ptp m = d5.m();
                d = agnc.d("$primary");
                d2 = agnc.d("$primary");
                long a = agnc.a(d2, "rcs_remote_capabilities_cache", m, new ptm(d, i2), new qab(1));
                Long.valueOf(a).getClass();
                if (a != -1) {
                    return true;
                }
                ((alvg) ((alvg) ptn.a.g()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations", "writeRcsCapabilitiesIfFresher", 282, "RcsCapabilitiesDatabaseOperations.java")).t("RCS capabilities were not inserted or updated in the database for MessagingIdentity %s", yyb.bh(r4));
                return false;
            case 16:
                ptw ptwVar2 = new ptw();
                Object obj4 = this.a;
                ptp ptpVar = (ptp) obj4;
                ptwVar2.d(ptpVar.h());
                ptwVar2.c(ptpVar.e());
                ptwVar2.e(ptpVar.d());
                ptwVar2.ag();
                ptwVar2.Z((agpw) this.c);
                ptwVar2.ai(new agni("rcs_remote_capabilities_cache", "-updateOrInsert-update"));
                if (ptwVar2.a().e() != 0) {
                    return true;
                }
                Object obj5 = this.b;
                d3 = agnc.d("$primary");
                if (agnc.a(d3, "rcs_remote_capabilities_cache", (aglz) obj4, new ptm(obj5, i), new ldx(20)) != -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                qaj qajVar = new qaj();
                Object obj6 = this.a;
                aglz aglzVar = (aglz) obj6;
                aglzVar.ao(0, "processing_id");
                qac qacVar = (qac) obj6;
                pyz pyzVar = qacVar.a;
                if (pyzVar != null && !pyzVar.equals(null)) {
                    qajVar.a.put("processing_id", pyz.a(pyzVar));
                } else {
                    qajVar.a.putNull("processing_id");
                }
                qam d6 = qacVar.d();
                if (d6 == null) {
                    qajVar.a.putNull("file_type");
                } else {
                    qajVar.a.put("file_type", Integer.valueOf(d6.ordinal()));
                }
                aglzVar.ao(2, "file_uri");
                Uri uri = qacVar.c;
                if (uri == null) {
                    qajVar.a.putNull("file_uri");
                } else {
                    qajVar.a.put("file_uri", uri.toString());
                }
                aglzVar.ao(3, "content_type");
                qel qelVar = qacVar.d;
                if (qelVar == null) {
                    qajVar.a.putNull("content_type");
                } else {
                    qajVar.a.put("content_type", qelVar.toByteArray());
                }
                aglzVar.ao(4, "encryption_metadata");
                apwj apwjVar = qacVar.e;
                if (apwjVar == null) {
                    qajVar.a.putNull("encryption_metadata");
                } else {
                    qajVar.a.put("encryption_metadata", apwjVar.toByteArray());
                }
                aglzVar.ao(5, "transfer_handle");
                agnc.r(qajVar.a, "transfer_handle", qacVar.f);
                qep e = qacVar.e();
                if (e == null) {
                    qajVar.a.putNull("upload_result");
                } else {
                    qajVar.a.put("upload_result", e.toByteArray());
                }
                Object obj7 = this.c;
                qajVar.ag();
                qajVar.Z((agpw) obj7);
                qajVar.ai(new agni("file_processing", "-updateOrInsert-update"));
                if (qajVar.a().e() != 0) {
                    return true;
                }
                Object obj8 = this.b;
                d4 = agnc.d("$primary");
                if (agnc.a(d4, "file_processing", aglzVar, new ptm(obj8, 9), new qab(0)) != -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                ?? r15 = (qpj) ((qpn) this.a).e.b();
                ?? r22 = this.c;
                alog alogVar = (alog) this.b;
                smr d7 = r15.d(alogVar, r22);
                qpn.s(alogVar, Optional.of(d7));
                return d7;
            case 19:
                qpn qpnVar = (qpn) this.a;
                ?? r23 = (qpj) qpnVar.e.b();
                Object obj9 = this.b;
                ?? r42 = this.c;
                String str2 = (String) obj9;
                smr b2 = r23.b(str2, r42);
                qpn.r(str2, Optional.of(b2));
                if (((nhz) qpnVar.f.b()).a()) {
                    Stream filter = Collection.EL.stream(((ruv) r42.b()).f).map(new qcq(19)).filter(new nfp(18));
                    int i3 = alog.d;
                    alog alogVar2 = (alog) filter.collect(alls.a);
                    if (!alogVar2.isEmpty() && !str2.equals(alogVar2.get(0))) {
                        qpn.s(alogVar2, Optional.of(b2));
                    }
                    if (alogVar2.size() != 1) {
                        xyo e2 = qpn.a.e();
                        e2.H("BCM: Normalized destination size is not 1 for 1:1 conversation");
                        e2.z("destination", obj9);
                        e2.z("Normalized destination", alogVar2.toString());
                        e2.q();
                    }
                }
                return b2;
            default:
                return ((qqw) this.a).w((alog) this.b, ((Integer) this.c).intValue());
        }
    }

    public /* synthetic */ mri(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ mri(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ mri(String str, ptz ptzVar, Instant instant, int i) {
        this.d = i;
        this.c = str;
        this.a = ptzVar;
        this.b = instant;
    }
}
