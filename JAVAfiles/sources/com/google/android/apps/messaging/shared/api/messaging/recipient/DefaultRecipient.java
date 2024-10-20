package com.google.android.apps.messaging.shared.api.messaging.recipient;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alog;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.alzz;
import defpackage.anen;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apxx;
import defpackage.aqjn;
import defpackage.armd;
import defpackage.armf;
import defpackage.aron;
import defpackage.arpe;
import defpackage.arpi;
import defpackage.arpj;
import defpackage.arsd;
import defpackage.arwe;
import defpackage.arwf;
import defpackage.d;
import defpackage.hgi;
import defpackage.hij;
import defpackage.kjp;
import defpackage.lga;
import defpackage.lqn;
import defpackage.ltv;
import defpackage.mds;
import defpackage.mlg;
import defpackage.mme;
import defpackage.msh;
import defpackage.msp;
import defpackage.mta;
import defpackage.mzn;
import defpackage.ncq;
import defpackage.ndb;
import defpackage.ndq;
import defpackage.ndr;
import defpackage.neh;
import defpackage.nei;
import defpackage.nej;
import defpackage.nek;
import defpackage.neu;
import defpackage.nfa;
import defpackage.opy;
import defpackage.psw;
import defpackage.psz;
import defpackage.qjh;
import defpackage.qrl;
import defpackage.qya;
import defpackage.rxn;
import defpackage.ryg;
import defpackage.sjd;
import defpackage.tde;
import defpackage.vnq;
import defpackage.vom;
import defpackage.voo;
import defpackage.vop;
import defpackage.voq;
import defpackage.vor;
import defpackage.vos;
import defpackage.vot;
import defpackage.vox;
import defpackage.xgj;
import defpackage.xnv;
import defpackage.xva;
import defpackage.xvc;
import defpackage.yce;
import defpackage.ydl;
import defpackage.yfp;
import defpackage.yyb;
import defpackage.zap;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DefaultRecipient implements ResolvedRecipient, ndr {
    public final ParticipantsTable.BindData b;
    public final msh c;
    public final anen d;
    private ProfilesTable.BindData e;
    private sjd f;
    private final ndq g;
    private final Context h;
    private final anen i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final alhr n;
    private final armf o;
    private final armf p;
    private final alhr q;
    private final alhr r;
    private final psw s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final nei x;
    public static final alwo a = alwo.o("BugleRecipients");
    public static final Parcelable.Creator<Recipient> CREATOR = new ltv(13);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        tde PU();

        lqn QE();
    }

    public DefaultRecipient(Context context, anen anenVar, anen anenVar2, armf<psz> armfVar, armf<yce> armfVar2, armf<qya> armfVar3, armf<neu> armfVar4, armf<kjp> armfVar5, armf<nfa> armfVar6, armf<lga> armfVar7, armf<lga> armfVar8, armf<lga> armfVar9, psw pswVar, armf<Boolean> armfVar10, armf<opy> armfVar11, armf<xgj> armfVar12, armf<zap> armfVar13, armf<xvc> armfVar14, nej nejVar, armf<neh> armfVar15, ParticipantsTable.BindData bindData, msh mshVar) {
        this.h = context;
        this.i = anenVar;
        this.d = anenVar2;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = armfVar3;
        this.m = armfVar4;
        byte[] bArr = null;
        this.n = albo.D(new msp(armfVar5, mshVar, 15, bArr));
        this.o = armfVar6;
        this.p = armfVar7;
        this.s = pswVar;
        this.q = albo.D(new msp(armfVar8, bindData, 16, bArr));
        this.r = albo.D(new msp(armfVar9, bindData, 17, bArr));
        this.w = armfVar10;
        if (((Boolean) armfVar10.b()).booleanValue() && bindData.as("profiles_table_join_tag")) {
            this.e = (ProfilesTable.BindData) bindData.al("profiles_table_join_tag", ProfilesTable.BindData.class);
        }
        if (bindData.as("contacts_table_join_tag")) {
            this.f = (sjd) bindData.av(sjd.class);
        }
        d.s(!ryg.l(bindData));
        this.b = bindData;
        this.g = new ndq(bindData.M());
        this.c = mshVar;
        this.t = armfVar12;
        this.u = armfVar13;
        this.v = armfVar15;
        this.x = nejVar.a(bindData, this.f, this.e);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final vop A() {
        boolean z;
        ProfilesTable.BindData bindData;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ProfilesTable.BindData bindData2;
        Uri k;
        zap zapVar = (zap) this.u.b();
        ?? r1 = zapVar.c;
        ProfilesTable.BindData bindData3 = this.e;
        anen anenVar = (anen) r1.b();
        anenVar.getClass();
        ?? r12 = zapVar.b;
        Optional optional = (Optional) ((apxx) zapVar.d).a;
        arwe arweVar = (arwe) zapVar.a.b();
        arweVar.getClass();
        ?? r10 = zapVar.e;
        ?? r11 = zapVar.f;
        boolean z2 = false;
        vox voxVar = null;
        if (bindData3 != null) {
            if (bindData3.l() == null && bindData3.m() == null && bindData3.n() == null) {
                z = false;
                bindData = bindData3;
            } else {
                bindData = bindData3;
                z = true;
            }
        } else {
            z = false;
            bindData = null;
        }
        if (bindData != null) {
            str = bindData.m();
        } else {
            str = null;
        }
        if (bindData != null) {
            str2 = bindData.n();
        } else {
            str2 = null;
        }
        if (bindData != null) {
            str3 = bindData.l();
        } else {
            str3 = null;
        }
        voq voqVar = new voq(str, str2, str3, null, z, 8);
        if (bindData3 == null || (k = bindData3.k()) == null || (str4 = k.toString()) == null) {
            str4 = vop.a;
        }
        Uri parse = Uri.parse(str4);
        if (str4.length() > 0) {
            z2 = true;
        }
        vor vorVar = new vor(parse, voxVar, z2, 2);
        if (bindData3 != null) {
            bindData3.ao(2, "person_id");
            str5 = bindData3.c;
            bindData2 = bindData3;
        } else {
            str5 = null;
            bindData2 = null;
        }
        Object b = r12.b();
        b.getClass();
        return new vop(voqVar, vorVar, str5, this, bindData2, anenVar, ((Boolean) b).booleanValue(), optional, arweVar, r10, r11);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.nfo B() {
        /*
            r9 = this;
            armf r0 = r9.p
            java.lang.Object r0 = r0.b()
            lga r0 = (defpackage.lga) r0
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r0 = r9.b
            int r0 = r0.r()
            r1 = 10
            r2 = 0
            r3 = 4
            r4 = 1
            r5 = 8
            if (r0 == r5) goto L1f
            if (r0 == r1) goto L1f
            if (r0 != r3) goto L1d
            r0 = r3
            goto L1f
        L1d:
            r6 = r2
            goto L20
        L1f:
            r6 = r4
        L20:
            r7 = 7
            r8 = 12
            if (r0 == r7) goto L3e
            r7 = 11
            if (r0 == r7) goto L3e
            if (r0 == r8) goto L3e
            r7 = 9
            if (r0 == r7) goto L3e
            if (r0 == r3) goto L3e
            r3 = 5
            if (r0 == r3) goto L3e
            if (r0 == r5) goto L3e
            if (r0 == r1) goto L3e
            r1 = 3
            if (r0 != r1) goto L3c
            goto L3e
        L3c:
            r1 = r2
            goto L3f
        L3e:
            r1 = r4
        L3f:
            if (r0 != r8) goto L42
            r2 = r4
        L42:
            nfo r3 = new nfo
            r3.<init>(r1, r6, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient.B():nfo");
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final akul C() {
        akul h;
        akul h2;
        if (!qrl.a() && !this.s.a()) {
            byte[] bArr = null;
            if (this.c.e().isEmpty()) {
                alwl alwlVar = (alwl) a.g();
                alwlVar.X(ydl.C, q());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient", "getRcsCapabilitiesLegacy", 674, "DefaultRecipient.java")).q("RCS Disabled: No RCS Identifier.");
                h2 = aktp.ag(null);
            } else {
                h2 = aktp.ai(new mzn(this, (psz) this.j.b(), 6, bArr), this.i).h(new mme(11), this.d);
            }
            h = h2.h(new mme(13), this.d);
        } else {
            h = x(2).b().h(new mme(12), this.d);
        }
        return h.h(new mds(this, 20), this.d);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final hgi D() {
        return (hgi) this.q.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final hgi E() {
        return (hgi) this.r.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final long a() {
        return this.b.s();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    @Deprecated
    public final Uri b() {
        return ((qya) this.l.b()).a(this.b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final Uri c(xva xvaVar) {
        vox voxVar;
        Uri uri;
        Uri h;
        xvaVar.getClass();
        nei neiVar = this.x;
        if (xvaVar == xva.b) {
            if (((Boolean) neiVar.e.b()).booleanValue()) {
                voxVar = j();
            } else {
                voxVar = vox.PROFILE_UNSPECIFIED_SOURCE;
            }
            if (voxVar == vox.PROFILE_CONTACT_SOURCE || voxVar == vox.PROFILE_UNSPECIFIED_SOURCE) {
                Object obj = neiVar.b;
                if (obj != null) {
                    uri = ((sjd) obj).h();
                } else {
                    uri = null;
                }
                if (uri != null) {
                    h = ((sjd) neiVar.b).h();
                    voxVar.getClass();
                    return neiVar.a(this, h);
                }
            }
            h = ((ParticipantsTable.BindData) neiVar.a).v();
            voxVar.getClass();
            return neiVar.a(this, h);
        }
        Uri a2 = ((qya) neiVar.f.b()).a((ParticipantsTable.BindData) neiVar.a);
        a2.getClass();
        return a2;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final Uri d() {
        if (this.b.N() != null) {
            ParticipantsTable.BindData bindData = this.b;
            return ContactsContract.Contacts.getLookupUri(bindData.s(), bindData.N());
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final hij e() {
        yce yceVar = (yce) this.k.b();
        String r = r(true);
        String str = this.c.F().a;
        ParticipantsTable.BindData bindData = this.b;
        bindData.s();
        String N = bindData.N();
        long t = bindData.t();
        bindData.s();
        bindData.v();
        msh mshVar = this.c;
        mshVar.getClass();
        return new hij(r, mshVar, Long.valueOf(t), N);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultRecipient)) {
            return false;
        }
        return this.c.equals(((DefaultRecipient) obj).c);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final msh f() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final mta g() {
        return this.b.w();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final ncq h() {
        return (ncq) this.n.get();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.ndr
    public final ParticipantsTable.BindData i() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final vox j() {
        vox C = ((ParticipantsTable.BindData) this.x.a).C();
        C.getClass();
        return C;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final vox k() {
        return this.b.B();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final akul l() {
        akul c;
        neh nehVar = (neh) this.v.b();
        msh mshVar = this.c;
        mshVar.getClass();
        Object b = nehVar.b.b();
        b.getClass();
        c = qjh.c((arwe) b, arpj.a, arwf.a, new mlg(nehVar, mshVar, (arpe) null, 7));
        return c.h(new mme(10), this.d);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final akul m() {
        return ((nfa) this.o.b()).a(this.c);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final alog n() {
        Uri h;
        Uri u;
        Uri uri = null;
        aron aronVar = new aron((byte[]) null);
        nei neiVar = this.x;
        Object obj = neiVar.c;
        if (obj != null) {
            uri = ((ProfilesTable.BindData) obj).k();
        }
        if (uri != null) {
            aronVar.add(new nek(neiVar.a(this, uri), uri, vox.PROFILE_PEOPLE_SHARING_SOURCE));
        }
        Object obj2 = neiVar.b;
        if (obj2 != null && (h = ((sjd) obj2).h()) != null) {
            Uri a2 = neiVar.a(this, h);
            sjd sjdVar = this.f;
            if (sjdVar != null) {
                sjdVar.ao(8, "thumbnail");
                u = sjdVar.i;
            } else {
                u = this.b.u();
            }
            aronVar.add(new nek(a2, u, vox.PROFILE_CONTACT_SOURCE));
        }
        if (aronVar.isEmpty()) {
            aronVar.add(new nek(c(xva.b), c(xva.a), vox.PROFILE_UNSPECIFIED_SOURCE));
        }
        return alzz.aZ(aqjn.x(aronVar));
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final String o() {
        return this.b.K();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final String p() {
        return this.b.L();
    }

    public final String q() {
        return yyb.bi(this.c).toString();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final String r(boolean z) {
        ParticipantsTable.BindData bindData = this.b;
        String L = bindData.L();
        String K = bindData.K();
        if (z) {
            if (!TextUtils.isEmpty(L)) {
                return L;
            }
            if (!TextUtils.isEmpty(K)) {
                return K;
            }
        } else {
            if (!TextUtils.isEmpty(K)) {
                return K;
            }
            if (!TextUtils.isEmpty(L)) {
                return L;
            }
        }
        String J = this.b.J();
        if (!TextUtils.isEmpty(J)) {
            return J;
        }
        return this.h.getResources().getString(R.string.unknown_sender);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient
    public final String s() {
        ProfilesTable.BindData bindData;
        ParticipantsTable.BindData bindData2 = this.b;
        String L = bindData2.L();
        if (TextUtils.isEmpty(bindData2.K()) && TextUtils.isEmpty(L) && (bindData = this.e) != null) {
            return bindData.l();
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean t() {
        return this.b.R();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean u() {
        if (this.b.N() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean v() {
        return rxn.p(this.b);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean w() {
        if (this.b.n() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("participant", this.b);
        bundle.putParcelable("identity", lqn.n(this.c));
        if (((Boolean) this.w.b()).booleanValue()) {
            bundle.putParcelable("profile", this.e);
        }
        parcel.writeBundle(bundle);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final ncq x(int i) {
        return ((neu) this.m.b()).a(this.c, i);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final voo y() {
        String str;
        Long v;
        if (this.e == null) {
            return null;
        }
        xgj xgjVar = (xgj) this.t.b();
        ProfilesTable.BindData bindData = this.e;
        bindData.getClass();
        msh mshVar = this.c;
        mshVar.getClass();
        ?? r8 = xgjVar.h;
        yfp yfpVar = (yfp) xgjVar.a.b();
        yfpVar.getClass();
        arpi arpiVar = (arpi) xgjVar.d.b();
        arpiVar.getClass();
        Long l = (Long) xgjVar.f.b();
        l.getClass();
        ?? r1 = xgjVar.g;
        long longValue = l.longValue();
        Long l2 = (Long) r1.b();
        l2.getClass();
        long longValue2 = l2.longValue();
        String l3 = bindData.l();
        if (l3 == null) {
            l3 = "";
        }
        String m = bindData.m();
        if (m == null) {
            m = "";
        }
        String n = bindData.n();
        if (n == null) {
            n = "";
        }
        aozy createBuilder = vos.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        vos vosVar = (vos) apagVar;
        vosVar.b |= 4;
        vosVar.e = l3;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        vos vosVar2 = (vos) apagVar2;
        vosVar2.b |= 1;
        vosVar2.c = m;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        vos vosVar3 = (vos) apagVar3;
        vosVar3.b |= 2;
        vosVar3.d = n;
        vox voxVar = vox.PROFILE_PEOPLE_SHARING_SOURCE;
        voxVar.getClass();
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        ((vos) createBuilder.b).f = voxVar.a();
        apag s = createBuilder.s();
        s.getClass();
        voq d = vom.d((vos) s);
        aozy createBuilder2 = vot.a.createBuilder();
        createBuilder2.getClass();
        Uri k = bindData.k();
        if (k == null || (str = k.toString()) == null) {
            str = "";
        }
        str.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar4 = createBuilder2.b;
        vot votVar = (vot) apagVar4;
        votVar.b |= 1;
        votVar.c = str;
        vox voxVar2 = vox.PROFILE_PEOPLE_SHARING_SOURCE;
        voxVar2.getClass();
        if (!apagVar4.isMutable()) {
            createBuilder2.u();
        }
        ((vot) createBuilder2.b).d = voxVar2.a();
        apag s2 = createBuilder2.s();
        s2.getClass();
        vor e = vom.e((vot) s2);
        bindData.ao(10, "sender_last_updated_time");
        String str2 = bindData.k;
        if (str2 != null && (v = arsd.v(str2)) != null) {
            Instant.ofEpochMilli(v.longValue());
        }
        return new voo(d, e, armd.a(new vnq(mshVar, 2)), r8, yfpVar, arpiVar, longValue, longValue2);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient
    public final ndq z() {
        return this.g;
    }

    public DefaultRecipient(Context context, anen anenVar, anen anenVar2, armf<psz> armfVar, armf<yce> armfVar2, armf<qya> armfVar3, armf<neu> armfVar4, armf<kjp> armfVar5, armf<nfa> armfVar6, armf<lga> armfVar7, armf<lga> armfVar8, armf<lga> armfVar9, psw pswVar, armf<Boolean> armfVar10, armf<xnv> armfVar11, armf<xgj> armfVar12, armf<zap> armfVar13, armf<xvc> armfVar14, armf<opy> armfVar15, nej nejVar, armf<neh> armfVar16, ParticipantsTable.BindData bindData, ProfilesTable.BindData bindData2, msh mshVar) {
        this.h = context;
        this.i = anenVar;
        this.d = anenVar2;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = armfVar3;
        this.m = armfVar4;
        this.n = albo.D(new ndb(armfVar5, mshVar, 1));
        this.o = armfVar6;
        this.p = armfVar7;
        this.s = pswVar;
        this.q = albo.D(new ndb(armfVar8, bindData, 0));
        this.r = albo.D(new ndb(armfVar9, bindData, 2));
        this.w = armfVar10;
        if (((Boolean) armfVar10.b()).booleanValue() && bindData.as("profiles_table_join_tag")) {
            this.e = (ProfilesTable.BindData) bindData.al("profiles_table_join_tag", ProfilesTable.BindData.class);
        } else {
            this.e = bindData2;
        }
        if (bindData.as("contacts_table_join_tag")) {
            this.f = (sjd) bindData.av(sjd.class);
        }
        d.s(!ryg.l(bindData));
        this.b = bindData;
        this.t = armfVar12;
        this.u = armfVar13;
        this.g = new ndq(bindData.M());
        this.c = mshVar;
        this.v = armfVar16;
        this.x = nejVar.a(bindData, this.f, bindData2);
    }

    public DefaultRecipient(Context context, anen anenVar, anen anenVar2, armf<psz> armfVar, armf<yce> armfVar2, armf<qya> armfVar3, armf<neu> armfVar4, armf<kjp> armfVar5, armf<nfa> armfVar6, armf<lga> armfVar7, armf<lga> armfVar8, armf<lga> armfVar9, psw pswVar, armf<Boolean> armfVar10, armf<opy> armfVar11, armf<xnv> armfVar12, armf<xgj> armfVar13, armf<zap> armfVar14, armf<xvc> armfVar15, nej nejVar, armf<neh> armfVar16, ParticipantsTable.BindData bindData, ProfilesTable.BindData bindData2, sjd sjdVar, msh mshVar) {
        this.h = context;
        this.i = anenVar;
        this.d = anenVar2;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = armfVar3;
        this.m = armfVar4;
        byte[] bArr = null;
        this.n = albo.D(new msp(armfVar5, mshVar, 18, bArr));
        this.o = armfVar6;
        this.p = armfVar7;
        this.s = pswVar;
        this.q = albo.D(new msp(armfVar8, bindData, 19, bArr));
        this.r = albo.D(new msp(armfVar9, bindData, 20, bArr));
        this.w = armfVar10;
        if (((Boolean) armfVar10.b()).booleanValue() && bindData.as("profiles_table_join_tag")) {
            this.e = (ProfilesTable.BindData) bindData.al("profiles_table_join_tag", ProfilesTable.BindData.class);
        } else {
            this.e = bindData2;
        }
        this.f = sjdVar;
        d.s(!ryg.l(bindData));
        this.b = bindData;
        this.t = armfVar13;
        this.u = armfVar14;
        this.g = new ndq(bindData.M());
        this.c = mshVar;
        this.v = armfVar16;
        this.x = nejVar.a(bindData, sjdVar, bindData2);
    }
}
