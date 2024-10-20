package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyp {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public wyp(aacp aacpVar, rry rryVar, CharSequence charSequence, Optional optional, Optional optional2, xca xcaVar, mho mhoVar) {
        this.c = charSequence;
        this.e = aacpVar;
        this.g = optional;
        this.b = optional2;
        this.f = rryVar;
        this.a = xcaVar;
        this.d = mhoVar;
    }

    public static /* synthetic */ amxm E(wyp wypVar, adiv adivVar) {
        return wypVar.I(adivVar, null, null);
    }

    public static String F(String str) {
        return ebz.a().c(str, ecc.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [armf, java.lang.Object] */
    public final amxm I(adiv adivVar, String str, adjf adjfVar) {
        int i;
        adit aditVar;
        adiw n = adom.n(adivVar);
        wxb wxbVar = (wxb) arsd.k(((wwn) this.d.b()).j(adivVar));
        aozy createBuilder = amxm.a.createBuilder();
        String str2 = n.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        int length = str2.length();
        apag apagVar = createBuilder.b;
        amxm amxmVar = (amxm) apagVar;
        amxmVar.b |= 1;
        amxmVar.c = length;
        if (wxbVar != null) {
            String str3 = wxbVar.p;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            amxm amxmVar2 = (amxm) apagVar2;
            str3.getClass();
            amxmVar2.b = 2 | amxmVar2.b;
            amxmVar2.d = str3;
            int i2 = wxbVar.d;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            amxm amxmVar3 = (amxm) apagVar3;
            amxmVar3.b |= 4;
            amxmVar3.e = i2;
            if (adjfVar != null) {
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                int i3 = adjfVar.c;
                amxm amxmVar4 = (amxm) createBuilder.b;
                amxmVar4.b |= 8;
                amxmVar4.f = i3;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxm amxmVar5 = (amxm) createBuilder.b;
            amxmVar5.g = 1;
            amxmVar5.b |= 16;
        } else if (d.F(((adtn) this.c.b()).l(), n.a)) {
            int b = ((adtn) this.c.b()).b();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar4 = createBuilder.b;
            amxm amxmVar6 = (amxm) apagVar4;
            amxmVar6.b |= 4;
            amxmVar6.e = b;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            amxm amxmVar7 = (amxm) createBuilder.b;
            amxmVar7.g = 2;
            amxmVar7.b |= 16;
        }
        if (str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxm amxmVar8 = (amxm) createBuilder.b;
            amxmVar8.b |= 64;
            amxmVar8.i = str.length();
            String str4 = null;
            if (adjfVar != null && (aditVar = adjfVar.b) != null) {
                str4 = aditVar.a;
            }
            boolean F = d.F(str, str4);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxm amxmVar9 = (amxm) createBuilder.b;
            amxmVar9.b |= 128;
            amxmVar9.j = F;
        }
        if (adjfVar != null) {
            adit aditVar2 = adjfVar.b;
            if (aditVar2 != null) {
                i = aditVar2.a.length();
            } else {
                i = 0;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amxm amxmVar10 = (amxm) createBuilder.b;
            amxmVar10.b |= 32;
            amxmVar10.h = i;
        }
        apag s = createBuilder.s();
        s.getClass();
        return (amxm) s;
    }

    public static String c(wyf wyfVar) {
        String str = wyfVar.f;
        if (str != null && str.length() > 10000) {
            return str.substring(0, 10000);
        }
        return str;
    }

    public static final String r(adit aditVar) {
        String str = aditVar.a;
        if (str.length() <= 4) {
            return str;
        }
        String substring = str.substring(0, 4);
        substring.getClass();
        String substring2 = str.substring(4, str.length());
        substring2.getClass();
        return substring.concat(new arus("[0-9]").a(substring2, "X"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [nfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul A() {
        return this.c.b().b().h(new veg(this, 8), this.d);
    }

    public final alog B(alog alogVar) {
        Stream map = Collection.EL.stream(alogVar).map(new vbk(this, 20));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [armf, java.lang.Object] */
    public final aozy C(String str, String str2, String str3, String str4) {
        aozy createBuilder = ango.a.createBuilder();
        aozy createBuilder2 = angp.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        str.getClass();
        ((angp) apagVar).d = str;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        ((angp) createBuilder2.b).b = a.an(3);
        angp angpVar = (angp) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ango angoVar = (ango) createBuilder.b;
        angpVar.getClass();
        angoVar.c = angpVar;
        angoVar.b |= 1;
        String f = vht.f(((yje) this.a.b()).f(yyb.bz(str2)));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        f.getClass();
        ((ango) apagVar2).f = f;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ((ango) createBuilder.b).m = a.ak(2);
        String ag = albo.ag(str3);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        ((ango) apagVar3).n = ag;
        String ag2 = albo.ag(str4);
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        ((ango) apagVar4).e = ag2;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        ((ango) createBuilder.b).i = true;
        return createBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    public final vel D(String str) {
        znj znjVar = (znj) this.g.b();
        znjVar.getClass();
        ?? b = this.c.b();
        b.getClass();
        anen anenVar = (anen) this.b.b();
        anenVar.getClass();
        str.getClass();
        return new vel(znjVar, b, this.f, this.e, this.d, anenVar, this.a, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void G(int i) {
        ((mbl) this.f.b()).e("Bugle.Spam.Notification.Eligibility.Count", i - 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [arwe, java.lang.Object] */
    public final void H(MessageIdType messageIdType, String str) {
        messageIdType.getClass();
        if (((Set) this.c.b()).isEmpty()) {
            return;
        }
        akrh e = aktp.e("UrlClickSpamProtectionEntrypoint.classifyOnClick");
        try {
            qjh.l(this.d, null, new ypg(this, messageIdType, str, null), 3);
            armd.i(e, null);
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tqx] */
    public final MessageCoreData a(wye wyeVar, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, int i, tqr tqrVar, long j) {
        int i2;
        long j2;
        xyl.l(wyeVar);
        if (i < 100) {
            i2 = wyeVar.t;
        } else {
            i2 = wyeVar.u;
        }
        int i3 = i2;
        ?? r3 = this.f;
        String str2 = wyeVar.a;
        boolean i4 = wyeVar.i();
        String str3 = wyeVar.n;
        String str4 = wyeVar.o;
        int i5 = wyeVar.j;
        String str5 = wyeVar.d;
        boolean z = wyeVar.m;
        boolean z2 = wyeVar.l;
        if (!wyeVar.y) {
            wyeVar.y = true;
            Iterator it = wyeVar.x.iterator();
            long j3 = 0;
            while (it.hasNext()) {
                j3 += ((wyf) it.next()).h;
            }
            if (wyeVar.f <= 0) {
                String str6 = wyeVar.d;
                if (str6 != null) {
                    j2 = str6.getBytes().length;
                } else {
                    j2 = 0;
                }
                wyeVar.f = j2;
                wyeVar.f = j2 + j3;
            }
        }
        MessageCoreData i6 = r3.i(str2, str, selfIdentityId, conversationIdType, i4, i, str3, str4, i5, str5, z, z2, wyeVar.f, i3, wyeVar.p, wyeVar.h, wyeVar.g, wyeVar.v, tqrVar, j);
        d(i6, wyeVar);
        return i6;
    }

    public final wyo b(List list, int i) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((MessagePartCoreData) it.next()).n();
        }
        return new wyo(j, ((xbf) this.b).a(i).d());
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    public final void d(MessageCoreData messageCoreData, wye wyeVar) {
        MessagePartData messagePartData;
        for (wyf wyfVar : wyeVar.x) {
            if (wyfVar.e()) {
                messagePartData = ((rtb) this.e).c(c(wyfVar));
            } else if (wyfVar.c()) {
                Object obj = this.e;
                rtc a = rtd.a();
                a.c = wyfVar.e;
                a.d = wyfVar.a();
                a.m(-1);
                a.e(-1);
                a.k(ameb.UNKNOWN);
                MessagePartData e = ((rtb) obj).e(a.a());
                String str = wyfVar.i;
                if (str != null) {
                    e.aB(Uri.fromFile(new File(str)));
                    if (gh.h(wyfVar.e)) {
                        e.ax(wyfVar.i);
                        e.aF(wyfVar.h);
                    }
                }
                messagePartData = e;
            } else {
                messagePartData = null;
            }
            if (messagePartData != null) {
                ((lgg) this.g.b()).g(new wqw(messagePartData, 4));
                messageCoreData.aH(messagePartData);
            }
        }
        if (!((MessageData) messageCoreData).i.iterator().hasNext()) {
            messageCoreData.aH(((rtb) this.e).c(""));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    public final akul e(final xrz xrzVar, final pzn pznVar, final xoj xojVar, final aozb aozbVar, qei qeiVar, boolean z) {
        long j;
        akul ag;
        akrh e;
        String bD;
        if (z) {
            j = ((znj) this.b).P();
        } else {
            j = 0;
        }
        final long j2 = j;
        int i = 13;
        if (xrzVar.h.isPresent()) {
            e = aktp.e("TachygramFileUploadProvider#uploadThumbnail");
            try {
                if (z) {
                    ag = f(xrzVar, pznVar, aozbVar, qeiVar);
                } else {
                    ag = aktp.ai(new xfb(this, pznVar, i), this.d).i(new qcf(this, pznVar, xrzVar, aozbVar, qeiVar, 12), this.f);
                }
                e.b(ag);
                e.close();
            } finally {
            }
        } else {
            ag = aktp.ag(new xsz(new xsc(qeq.a)));
        }
        e = aktp.e("TachygramFileUploadProvider#uploadFile");
        try {
            final xsl xslVar = (xsl) this.g.b();
            if (xslVar.f.a()) {
                bD = pznVar.c;
            } else {
                yyb yybVar = xslVar.i;
                bD = yyb.bD();
            }
            aozy createBuilder = aqhu.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aqhu) createBuilder.b).b = a.an(4);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            bD.getClass();
            ((aqhu) apagVar).c = bD;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ((aqhu) createBuilder.b).d = a.ap(3);
            final aqhu aqhuVar = (aqhu) createBuilder.s();
            Optional map = ((zxy) xslVar.e.b()).y(Optional.of(qeiVar)).map(new Function() { // from class: xsi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo416andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final String str = (String) obj;
                    final xsl xslVar2 = xsl.this;
                    final aqhu aqhuVar2 = aqhuVar;
                    final pzn pznVar2 = pznVar;
                    final xrz xrzVar2 = xrzVar;
                    final xoj xojVar2 = xojVar;
                    final aozb aozbVar2 = aozbVar;
                    final long j3 = j2;
                    return xslVar2.a(pznVar2, new algk() { // from class: xsh
                        @Override // defpackage.algk
                        public final Object apply(Object obj2) {
                            xtf xtfVar = xsl.this.c;
                            aqhu aqhuVar3 = aqhuVar2;
                            apus apusVar = (apus) obj2;
                            xrz xrzVar3 = xrzVar2;
                            return xtfVar.c(aqhuVar3, apusVar, xrzVar3.c, xrzVar3.e, aozbVar2, str, j3).h(new wua(xtfVar, pznVar2, apusVar, xojVar2, 6), xtfVar.a);
                        }
                    }, xrzVar2, aqhuVar2.c);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            pwq a = pwr.a();
            a.f(xoc.FILE_TRANSFER_FAILURE_REASON_INVALID_RCS_CONFIGURATION);
            a.g(aqhuVar.c);
            akul e2 = ((akul) map.orElse(aktp.ag(new xta(a.a())))).e(CancellationException.class, new xqp(i), this.f);
            e.b(e2);
            e.close();
            return aktp.an(ag, e2).h(new xqt(this, ag, e2, 4, (byte[]) null), this.f);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [oel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    public final akul f(xrz xrzVar, pzn pznVar, aozb aozbVar, qei qeiVar) {
        String bD;
        zap zapVar = (zap) this.c.b();
        if (zapVar.f.a()) {
            bD = pznVar.c;
        } else {
            Object obj = zapVar.b;
            bD = yyb.bD();
        }
        aozy createBuilder = aqhu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aqhu) createBuilder.b).b = a.an(3);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        bD.getClass();
        ((aqhu) apagVar).c = bD;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aqhu) createBuilder.b).d = a.ap(3);
        aqhu aqhuVar = (aqhu) createBuilder.s();
        Optional map = ((zxy) zapVar.d.b()).y(Optional.of(qeiVar)).map(new yuh(zapVar, aqhuVar, xrzVar, aozbVar, 1));
        pwq a = pwr.a();
        a.f(xoc.FILE_TRANSFER_FAILURE_REASON_INVALID_RCS_CONFIGURATION);
        a.g(aqhuVar.c);
        return ((akul) map.orElse(aktp.ag(new xta(a.a())))).h(new xpm(this, pznVar, 9), this.f);
    }

    public final void g(UUID uuid, alog alogVar) {
        ((xjc) this.b).b(uuid, alogVar, amvd.a);
    }

    public final void h(UUID uuid, amvl amvlVar) {
        ((xjc) this.d).b(uuid, alog.r(amvlVar), amvi.a);
    }

    public final void i(UUID uuid, UUID uuid2, int i, boolean z) {
        boolean z2;
        aozb w;
        aozy createBuilder = amvk.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amvk amvkVar = (amvk) apagVar;
        amvkVar.b |= 2;
        amvkVar.d = z;
        if (i == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amvk amvkVar2 = (amvk) apagVar2;
        amvkVar2.b |= 4;
        amvkVar2.e = z2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amvk amvkVar3 = (amvk) createBuilder.b;
        amvkVar3.f = i - 1;
        amvkVar3.b |= 8;
        if (uuid2 != null) {
            w = aozb.w(ByteBuffer.allocate(16).putLong(uuid2.getMostSignificantBits()).putLong(uuid2.getLeastSignificantBits()).array());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amvk amvkVar4 = (amvk) createBuilder.b;
            amvkVar4.b = 1 | amvkVar4.b;
            amvkVar4.c = w;
        }
        Object obj = this.a;
        int i2 = alog.d;
        ((xjc) obj).b(uuid, alsx.a, (amvk) createBuilder.s());
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Set, java.lang.Object] */
    public final int j() {
        return ((ArrayList) this.f).size() + ((ArrayList) this.e).size() + ((ArrayList) this.d).size() + ((ArrayList) this.b).size() + this.a.size() + this.c.size() + this.g.size();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [arpi, java.lang.Object] */
    public final Object k(amlx amlxVar, amlw amlwVar, Integer num, amkr amkrVar, arpe arpeVar) {
        Object q = arro.q(this.d, new lvd(amlxVar, amlwVar, num, amkrVar, this, (arpe) null, 2), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [armf, java.lang.Object] */
    public final void l(amly amlyVar) {
        mar a = ((mbb) this.f.b()).a();
        a.e(amrs.UMA_RCS_PROVISIONING_UI_INTERACTION);
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        aozy createBuilder = amht.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amht amhtVar = (amht) apagVar;
        amhtVar.c = 11;
        amhtVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amht amhtVar2 = (amht) createBuilder.b;
        amhtVar2.j = amlyVar;
        amhtVar2.b |= 256;
        amjd b = advh.b((Context) this.b);
        b.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amht amhtVar3 = (amht) createBuilder.b;
        amhtVar3.h = b;
        amhtVar3.b |= 64;
        String j = ((zxy) this.g.b()).j();
        j.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amht amhtVar4 = (amht) createBuilder.b;
        amhtVar4.b |= 128;
        amhtVar4.i = j;
        apag s = createBuilder.s();
        s.getClass();
        amht amhtVar5 = (amht) s;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.s = amhtVar5;
        amfrVar.b |= 4096;
        a.b(amfqVar, mbt.LOG_SPEC_RCS_PROVISIONING_UI_EVENTS);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arwe, java.lang.Object] */
    public final void m(amlw amlwVar) {
        amlwVar.getClass();
        qjh.l(this.a, null, new vpi(this, amlwVar, (arpe) null, 5), 3);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [arwe, java.lang.Object] */
    public final void n(boolean z, amlw amlwVar, String str) {
        amlwVar.getClass();
        str.getClass();
        qjh.l(this.a, null, new jyo(this, z, amlwVar, str, (arpe) null, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    public final void o(String str, amlw amlwVar) {
        str.getClass();
        amlwVar.getClass();
        qjh.l(this.a, null, new mmz(this, amlwVar, str, (arpe) null, 17), 3);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [arwe, java.lang.Object] */
    public final void p(String str, amlw amlwVar) {
        amlwVar.getClass();
        qjh.l(this.a, null, new mmz(this, amlwVar, str, null, 18, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    public final void q(amxn amxnVar) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.RCS_PROVISIONING_MANAGER_EVENT, amfqVar);
        alzz.o(amxnVar, amfqVar);
        aozy builder = alzz.h(amfqVar).toBuilder();
        builder.getClass();
        ((mbb) this.f.b()).a().a((amfq) builder, mbt.LOG_SPEC_RCS_PROVISIONING_MANAGER_EVENTS);
    }

    public final amxn s(int i, Set set, Map map, Map map2, Map map3) {
        Optional optional;
        aozy createBuilder = amxn.a.createBuilder();
        createBuilder.getClass();
        aktp.aW(i, createBuilder);
        DesugarCollections.unmodifiableList(((amxn) createBuilder.b).e).getClass();
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList(aqjn.J(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(I(new adiw((String) it.next()), null, null));
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxn amxnVar = (amxn) createBuilder.b;
        apax apaxVar = amxnVar.e;
        if (!apaxVar.c()) {
            amxnVar.e = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(arrayList, amxnVar.e);
        DesugarCollections.unmodifiableList(((amxn) createBuilder.b).d).getClass();
        ArrayList arrayList2 = new ArrayList(aqjn.J(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            adiv adivVar = (adiv) it2.next();
            String str = null;
            if (map2 != null && (optional = (Optional) map2.get(adivVar)) != null) {
                str = (String) arsd.k(optional);
            }
            arrayList2.add(I(adivVar, str, (adjf) map3.get(adivVar)));
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxn amxnVar2 = (amxn) createBuilder.b;
        apax apaxVar2 = amxnVar2.d;
        if (!apaxVar2.c()) {
            amxnVar2.d = apag.mutableCopy(apaxVar2);
        }
        aoyj.addAll(arrayList2, amxnVar2.d);
        return aktp.aU(createBuilder);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [arwe, java.lang.Object] */
    public final void t(int i, Integer num, adit aditVar, boolean z) {
        qjh.l(this.a, null, new wfc(this, aditVar, num, z, i, null), 3);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    public final void u(int i, adiv adivVar) {
        qjh.l(this.a, null, new psl(this, i, adivVar, (arpe) null, 5), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [okt, java.lang.Object] */
    public final void v(int i, Set set, Map map) {
        set.getClass();
        alor j = alor.j(((vru) this.e.b()).b);
        j.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = j.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((amwt) entry.getValue()) == amwt.AVAILABLE) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        if (this.b.a()) {
            qjh.l(this.a, null, new lvw(this, i, set, linkedHashMap, map, (arpe) null, 3), 3);
        } else {
            Map map2 = arnw.a;
            q(s(i, set, linkedHashMap, map2, map2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul w(akul akulVar, alpt alptVar) {
        return akulVar.h(new veg(alptVar, 10), this.d);
    }

    public final akul x(ConversationId conversationId) {
        return ((ndi) this.f).c(conversationId).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul y(ConversationId conversationId) {
        conversationId.getClass();
        return aktp.ai(new ulo(this, conversationId, 13, null), this.b).i(new uva(12), this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul z(ConversationId conversationId) {
        return y(conversationId).h(new veg(this, 8), this.d);
    }

    public wyp(Context context, armf armfVar, xbf xbfVar, armf armfVar2, rtb rtbVar, tqx tqxVar, armf armfVar3) {
        this.a = armfVar;
        this.b = xbfVar;
        this.c = armfVar2;
        this.d = context;
        this.e = rtbVar;
        this.f = tqxVar;
        this.g = armfVar3;
    }

    public wyp(Context context, vjs vjsVar, yhu yhuVar, via viaVar, xvc xvcVar, xwx xwxVar, armf armfVar) {
        this.e = context;
        this.c = vjsVar;
        this.g = yhuVar;
        this.f = viaVar;
        this.b = xvcVar;
        this.d = xwxVar;
        this.a = armfVar;
    }

    public wyp(anen anenVar, anen anenVar2, armf armfVar, nfx nfxVar, ndi ndiVar, mlu mluVar, armf armfVar2) {
        this.d = anenVar;
        this.b = anenVar2;
        this.a = armfVar;
        this.c = nfxVar;
        this.f = ndiVar;
        this.e = mluVar;
        this.g = armfVar2;
    }

    public wyp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, apwt apwtVar, anen anenVar) {
        this.g = armfVar;
        this.a = armfVar2;
        this.c = armfVar3;
        this.b = armfVar4;
        this.e = armfVar5;
        this.f = apwtVar;
        this.d = anenVar;
    }

    public wyp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.f = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
        armfVar6.getClass();
        this.g = armfVar6;
        armfVar7.getClass();
        this.b = armfVar7;
    }

    public wyp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, arwe arweVar, okt oktVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        arweVar.getClass();
        this.f = armfVar;
        this.d = armfVar2;
        this.c = armfVar3;
        this.e = armfVar4;
        this.g = armfVar5;
        this.a = arweVar;
        this.b = oktVar;
    }

    public wyp(byte[] bArr) {
        this.f = new ArrayList();
        this.e = new ArrayList();
        this.d = new ArrayList();
        this.b = new ArrayList();
        this.a = new HashSet();
        this.c = new HashSet();
        this.g = new HashSet();
    }

    public wyp(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "rbm_business_info_properties._id";
        a.c = new wsy();
        tdp tdpVar = new tdp(a.a());
        this.g = tdpVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.d(true);
        a2.b = new tdb(6);
        a2.a = "rbm_business_info_properties.rbm_bot_id";
        a2.c = new wsy();
        tdp tdpVar2 = new tdp(a2.a());
        this.f = tdpVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.i(true);
        a3.c(true);
        a3.a = "rbm_business_info_properties.type";
        a3.c = new wsy();
        tdp tdpVar3 = new tdp(a3.a());
        this.b = tdpVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "rbm_business_info_properties.header";
        a4.c = new wsy();
        tdp tdpVar4 = new tdp(a4.a());
        this.d = tdpVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "rbm_business_info_properties.subheader";
        a5.c = new wsy();
        tdp tdpVar5 = new tdp(a5.a());
        this.e = tdpVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "rbm_business_info_properties.property_value";
        a6.c = new wsy();
        tdp tdpVar6 = new tdp(a6.a());
        this.a = tdpVar6;
        this.c = new tdp[]{tdpVar, tdpVar2, tdpVar3, tdpVar4, tdpVar5, tdpVar6};
    }

    public wyp(arpi arpiVar, arwe arweVar, armf armfVar, armf armfVar2, Context context, armf armfVar3, armf armfVar4) {
        arpiVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        context.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.d = arpiVar;
        this.a = arweVar;
        this.f = armfVar;
        this.e = armfVar2;
        this.b = context;
        this.g = armfVar3;
        this.c = armfVar4;
    }

    public wyp() {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "scheduled_send._id";
        a.c = new wsy();
        wsz wszVar = new wsz(a.a());
        this.g = wszVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.c(true);
        a2.d(true);
        a2.b = new wso(6);
        a2.a = "scheduled_send.message_id";
        a2.c = new wsy();
        wsz wszVar2 = new wsz(a2.a());
        this.f = wszVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.d(true);
        a3.b = new wso(7);
        a3.a = "scheduled_send.conversation_id";
        a3.c = new wsy();
        wsz wszVar3 = new wsz(a3.a());
        this.d = wszVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "scheduled_send.scheduled_time";
        a4.c = new wsy();
        wsz wszVar4 = new wsz(a4.a());
        this.b = wszVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.c(true);
        a5.a = "scheduled_send.status";
        a5.c = new wsy();
        wsz wszVar5 = new wsz(a5.a());
        this.a = wszVar5;
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.i(true);
        a6.a = "scheduled_send.creation_time";
        a6.c = new wsy();
        wsz wszVar6 = new wsz(a6.a());
        this.e = wszVar6;
        this.c = new wsz[]{wszVar, wszVar2, wszVar3, wszVar4, wszVar5, wszVar6};
    }

    public wyp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, byte[] bArr) {
        armfVar.getClass();
        this.f = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
        armfVar6.getClass();
        this.g = armfVar6;
        armfVar7.getClass();
        this.e = armfVar7;
    }

    public wyp(wyj wyjVar) {
        this.e = wyjVar.e(new vhg(11));
        this.a = wyjVar.e(new vhg(12));
        this.c = wyjVar.e(new vhg(13));
        this.d = wyjVar.e(new vhg(14));
        this.f = wyjVar.e(new vhg(15));
        this.g = wyjVar.e(new vhg(16));
        this.b = wyjVar.e(new vhg(17));
    }

    public wyp(anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3, znj znjVar) {
        this.e = alwo.o("BugleFileTransfer");
        this.f = anenVar;
        this.d = anenVar2;
        this.c = armfVar;
        this.g = armfVar2;
        this.a = armfVar3;
        this.b = znjVar;
    }

    public wyp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.g = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.a = armfVar6;
        armfVar7.getClass();
        this.f = armfVar7;
    }

    public wyp(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "read_reports._id";
        a.c = new wsy();
        teu teuVar = new teu(a.a());
        this.g = teuVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.i(true);
        a2.c(true);
        a2.d(true);
        a2.a = "read_reports.message_id";
        a2.e(true);
        a2.c = new wsy();
        teu teuVar2 = new teu(a2.a());
        this.a = teuVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.i(true);
        a3.c(true);
        a3.d(true);
        a3.a = "read_reports.participant_id";
        a3.e(true);
        a3.c = new wsy();
        teu teuVar3 = new teu(a3.a());
        this.f = teuVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.a = "read_reports.receive_time";
        a4.c = new wsy();
        teu teuVar4 = new teu(a4.a());
        this.b = teuVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "read_reports.read_time";
        a5.c = new wsy();
        teu teuVar5 = new teu(a5.a());
        this.e = teuVar5;
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.a = "read_reports.ftd_time";
        a6.c = new wsy();
        teu teuVar6 = new teu(a6.a());
        this.d = teuVar6;
        this.c = new teu[]{teuVar, teuVar2, teuVar3, teuVar4, teuVar5, teuVar6};
    }

    public wyp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.e = armfVar4;
        this.a = armfVar5;
        this.b = armfVar6;
        this.d = arweVar;
    }

    public wyp(arwe arweVar, arpi arpiVar, armf armfVar, armf armfVar2, armf armfVar3, apwt apwtVar, armf armfVar4) {
        arweVar.getClass();
        arpiVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        apwtVar.getClass();
        armfVar4.getClass();
        this.b = arweVar;
        this.e = arpiVar;
        this.f = armfVar;
        this.a = armfVar2;
        this.g = armfVar3;
        this.d = apwtVar;
        this.c = armfVar4;
    }

    public wyp(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.d = context;
        this.a = (ansy) armfVar.b();
        this.f = (ryg) armfVar2.b();
        this.g = armfVar3;
        this.b = armfVar4;
        this.e = armfVar5;
        this.c = armfVar6;
    }

    public wyp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.f = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
        armfVar6.getClass();
        this.g = armfVar6;
        armfVar7.getClass();
        this.c = armfVar7;
    }

    public wyp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, char[] cArr) {
        armfVar.getClass();
        this.f = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.g = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
        armfVar6.getClass();
        this.b = armfVar6;
        armfVar7.getClass();
        this.d = armfVar7;
    }

    public wyp(arwe arweVar, asai asaiVar, asai asaiVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        arweVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.d = arweVar;
        this.f = asaiVar;
        this.a = asaiVar2;
        this.c = armfVar;
        this.b = armfVar2;
        this.e = armfVar3;
        this.g = armfVar4;
    }

    public wyp(arwe arweVar, asai asaiVar, ConversationId conversationId, asai asaiVar2, asai asaiVar3, armf armfVar, armf armfVar2, wfh wfhVar) {
        arweVar.getClass();
        asaiVar.getClass();
        conversationId.getClass();
        asaiVar2.getClass();
        asaiVar3.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        wfhVar.getClass();
        this.b = arweVar;
        this.d = asaiVar;
        this.f = asaiVar2;
        this.a = asaiVar3;
        this.c = armfVar;
        this.g = armfVar2;
        this.e = wfhVar;
    }

    public wyp(char[] cArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.a = "recent_expressive_stickers.name";
        a.c = new wsy();
        tfj tfjVar = new tfj(a.a());
        this.b = tfjVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.a = "recent_expressive_stickers.content_uri";
        a2.c = new wsy();
        tfj tfjVar2 = new tfj(a2.a());
        this.a = tfjVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.i(true);
        a3.a = "recent_expressive_stickers.content_type";
        a3.c = new wsy();
        tfj tfjVar3 = new tfj(a3.a());
        this.d = tfjVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.i(true);
        a4.a = "recent_expressive_stickers.width";
        a4.c = new wsy();
        tfj tfjVar4 = new tfj(a4.a());
        this.g = tfjVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.i(true);
        a5.a = "recent_expressive_stickers.height";
        a5.c = new wsy();
        tfj tfjVar5 = new tfj(a5.a());
        this.f = tfjVar5;
        agmi a6 = agmk.a();
        a6.d = 1;
        a6.i(true);
        a6.c(true);
        a6.a = "recent_expressive_stickers.last_used_timestamp";
        a6.c = new wsy();
        tfj tfjVar6 = new tfj(a6.a());
        this.e = tfjVar6;
        this.c = new tfj[]{tfjVar, tfjVar2, tfjVar3, tfjVar4, tfjVar5, tfjVar6};
    }

    public wyp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        this.g = armfVar;
        this.c = armfVar2;
        armfVar3.getClass();
        this.f = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
        armfVar6.getClass();
        this.b = armfVar6;
        armfVar7.getClass();
        this.a = armfVar7;
    }
}
