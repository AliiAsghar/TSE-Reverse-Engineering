package defpackage;

import android.content.Context;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adoi {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public adoi(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, armf armfVar38, armf armfVar39, armf armfVar40, armf armfVar41, armf armfVar42, armf armfVar43, armf armfVar44, armf armfVar45, armf armfVar46, armf armfVar47, armf armfVar48, armf armfVar49) {
        this.n = armfVar;
        this.o = armfVar2;
        this.p = armfVar3;
        this.q = armfVar4;
        this.r = armfVar5;
        this.s = armfVar6;
        this.t = armfVar7;
        this.u = armfVar8;
        this.a = armfVar9;
        this.b = armfVar10;
        this.v = armfVar11;
        this.w = armfVar12;
        this.x = armfVar13;
        this.c = armfVar14;
        this.y = armfVar15;
        this.z = armfVar16;
        this.d = armfVar17;
        this.A = armfVar18;
        this.B = armfVar19;
        this.C = armfVar20;
        this.D = armfVar21;
        this.e = armfVar22;
        this.f = armfVar23;
        this.E = armfVar24;
        this.F = armfVar25;
        this.G = armfVar26;
        this.H = armfVar27;
        this.I = armfVar28;
        this.J = armfVar29;
        this.K = armfVar30;
        this.L = armfVar31;
        this.M = armfVar32;
        this.N = armfVar33;
        this.g = armfVar34;
        this.O = armfVar35;
        this.h = armfVar36;
        this.i = armfVar37;
        this.P = armfVar38;
        this.j = armfVar39;
        this.Q = armfVar40;
        this.k = armfVar41;
        this.R = armfVar42;
        this.S = armfVar43;
        this.T = armfVar44;
        this.U = armfVar45;
        this.V = armfVar46;
        this.l = armfVar47;
        this.m = armfVar48;
        this.W = armfVar49;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v55, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v61, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v63, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v65, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v68, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final RcsEngineImpl a(adwl adwlVar, adfb adfbVar, acsu acsuVar, adpx adpxVar) {
        Context context = (Context) this.n.b();
        BusinessInfoDatabase businessInfoDatabase = (BusinessInfoDatabase) this.o.b();
        acqy acqyVar = (acqy) this.p.b();
        acrd acrdVar = (acrd) this.q.b();
        acrdVar.getClass();
        acqi acqiVar = (acqi) this.r.b();
        acqiVar.getClass();
        adps adpsVar = (adps) this.s.b();
        adpsVar.getClass();
        aduu aduuVar = (aduu) this.t.b();
        acrm acrmVar = (acrm) this.u.b();
        adti adtiVar = (adti) this.a.b();
        adtiVar.getClass();
        adsj adsjVar = (adsj) this.b.b();
        FileTransferEngine fileTransferEngine = (FileTransferEngine) this.v.b();
        fileTransferEngine.getClass();
        ChatSessionEngine chatSessionEngine = (ChatSessionEngine) this.w.b();
        chatSessionEngine.getClass();
        LocationSharingEngine locationSharingEngine = (LocationSharingEngine) this.x.b();
        locationSharingEngine.getClass();
        adtn adtnVar = (adtn) this.c.b();
        acyt acytVar = (acyt) this.y.b();
        acnb acnbVar = (acnb) this.z.b();
        adny adnyVar = (adny) this.d.b();
        anen anenVar = (anen) this.A.b();
        aneo aneoVar = (aneo) this.B.b();
        acqk acqkVar = (acqk) this.C.b();
        yjr yjrVar = (yjr) this.D.b();
        adjw adjwVar = (adjw) this.e.b();
        adjwVar.getClass();
        acre acreVar = (acre) this.f.b();
        acts actsVar = (acts) this.E.b();
        adeq adeqVar = (adeq) this.F.b();
        aiim aiimVar = (aiim) this.G.b();
        adih adihVar = (adih) this.H.b();
        adpu adpuVar = (adpu) this.I.b();
        adsb adsbVar = (adsb) this.J.b();
        adnk adnkVar = (adnk) this.K.b();
        adom adomVar = (adom) this.L.b();
        adfd adfdVar = (adfd) this.M.b();
        adov adovVar = (adov) this.N.b();
        adovVar.getClass();
        aikc aikcVar = (aikc) this.g.b();
        aikcVar.getClass();
        aduo aduoVar = (aduo) this.O.b();
        SignupEngine signupEngine = (SignupEngine) this.h.b();
        signupEngine.getClass();
        adeo adeoVar = (adeo) this.i.b();
        ?? r1 = this.P;
        adtg adtgVar = (adtg) this.j.b();
        adtgVar.getClass();
        adxs adxsVar = (adxs) this.Q.b();
        adta adtaVar = (adta) this.k.b();
        adae adaeVar = (adae) this.R.b();
        aegu aeguVar = (aegu) this.S.b();
        adze adzeVar = (adze) this.T.b();
        adfg adfgVar = (adfg) this.U.b();
        adfgVar.getClass();
        acof acofVar = (acof) this.V.b();
        acoi acoiVar = (acoi) this.l.b();
        acoiVar.getClass();
        adfq adfqVar = (adfq) this.m.b();
        adfqVar.getClass();
        msd msdVar = (msd) this.W.b();
        adwlVar.getClass();
        acsuVar.getClass();
        return new RcsEngineImpl(context, businessInfoDatabase, acqyVar, acrdVar, acqiVar, adpsVar, aduuVar, acrmVar, adtiVar, adsjVar, fileTransferEngine, chatSessionEngine, locationSharingEngine, adtnVar, acytVar, acnbVar, adnyVar, anenVar, aneoVar, acqkVar, yjrVar, adjwVar, acreVar, actsVar, adeqVar, aiimVar, adihVar, adpuVar, adsbVar, adnkVar, adomVar, adfdVar, adovVar, aikcVar, aduoVar, signupEngine, adeoVar, r1, adtgVar, adxsVar, adtaVar, adaeVar, aeguVar, adzeVar, adfgVar, acofVar, acoiVar, adfqVar, msdVar, adwlVar, adfbVar, acsuVar, adpxVar);
    }

    public adoi(Context context, acnz acnzVar, adly adlyVar, Optional optional, aday adayVar, adks adksVar, adlx adlxVar, adtl adtlVar, adko adkoVar, adnk adnkVar, adnt adntVar, anen anenVar, yjr yjrVar, Optional optional2, adnv adnvVar, abqa abqaVar, yjy yjyVar, adtl adtlVar2, adkc adkcVar, adih adihVar, adea adeaVar, adaw adawVar, xyt xytVar, Optional optional3, adki adkiVar, adkn adknVar, adih adihVar2, wwn wwnVar, adkd adkdVar, xyt xytVar2, vau vauVar, vjs vjsVar, arwe arweVar, arpi arpiVar, anen anenVar2, acjj acjjVar, aegu aeguVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13) {
        context.getClass();
        acnzVar.getClass();
        adayVar.getClass();
        adksVar.getClass();
        adlxVar.getClass();
        adtlVar.getClass();
        adkoVar.getClass();
        adnkVar.getClass();
        adntVar.getClass();
        anenVar.getClass();
        yjrVar.getClass();
        adnvVar.getClass();
        abqaVar.getClass();
        yjyVar.getClass();
        adtlVar2.getClass();
        adkcVar.getClass();
        adihVar.getClass();
        adawVar.getClass();
        xytVar.getClass();
        adkiVar.getClass();
        adknVar.getClass();
        wwnVar.getClass();
        adkdVar.getClass();
        xytVar2.getClass();
        vauVar.getClass();
        vjsVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        anenVar2.getClass();
        acjjVar.getClass();
        aeguVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        armfVar13.getClass();
        this.D = context;
        this.K = acnzVar;
        this.P = adlyVar;
        this.t = optional;
        this.R = adksVar;
        this.N = adlxVar;
        this.M = adtlVar;
        this.r = adkoVar;
        this.B = adnkVar;
        this.x = adntVar;
        this.Q = anenVar;
        this.F = yjrVar;
        this.J = optional2;
        this.G = adnvVar;
        this.n = abqaVar;
        this.S = yjyVar;
        this.u = adtlVar2;
        this.H = adkcVar;
        this.O = adihVar;
        this.A = adeaVar;
        this.T = adawVar;
        this.I = xytVar;
        this.C = optional3;
        this.p = adkiVar;
        this.q = adknVar;
        this.E = adihVar2;
        this.s = wwnVar;
        this.v = adkdVar;
        this.w = xytVar2;
        this.o = vauVar;
        this.z = vjsVar;
        this.V = arweVar;
        this.L = arpiVar;
        this.y = anenVar2;
        this.W = acjjVar;
        this.U = aeguVar;
        this.b = armfVar;
        this.g = armfVar2;
        this.f = armfVar3;
        this.l = armfVar4;
        this.a = armfVar5;
        this.i = armfVar6;
        this.d = armfVar7;
        this.e = armfVar8;
        this.h = armfVar9;
        this.k = armfVar10;
        this.j = armfVar11;
        this.m = armfVar12;
        this.c = armfVar13;
    }
}
