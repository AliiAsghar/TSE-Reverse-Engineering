package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.gms.wearable.Asset;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvy {
    private static final alwo b = alwo.o("BugleWearable");
    public final armf a;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final vid j;
    private final wfh k;

    public yvy(vid vidVar, armf armfVar, armf armfVar2, wfh wfhVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        this.j = vidVar;
        this.a = armfVar;
        this.c = armfVar2;
        this.k = wfhVar;
        this.d = armfVar3;
        this.e = armfVar4;
        this.g = armfVar5;
        this.f = armfVar6;
        this.h = armfVar7;
        this.i = armfVar8;
    }

    private final List f(ConversationIdType conversationIdType, int i) {
        akrh e = aktp.e("WearableConversationBuilder#getMessageInfos");
        try {
            sbd sbdVar = (sbd) ((ibi) this.e.b()).n(conversationIdType, 21, i).b().n();
            try {
                ArrayList arrayList = new ArrayList();
                while (sbdVar.moveToNext()) {
                    arrayList.add(this.j.c(sbdVar));
                }
                sbdVar.close();
                e.close();
                return arrayList;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final yvw a(rry rryVar, List list, Context context) {
        String ag;
        String uri;
        akrh e = aktp.e("WearableConversationBuilder#getMessageDataFromConversationMessageData");
        try {
            aozy createBuilder = yvw.a.createBuilder();
            String a = rryVar.u().a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            yvw yvwVar = (yvw) createBuilder.b;
            a.getClass();
            yvwVar.c = a;
            String a2 = rryVar.t().a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            yvw yvwVar2 = (yvw) createBuilder.b;
            a2.getClass();
            yvwVar2.d = a2;
            boolean aU = rryVar.aU();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yvw) createBuilder.b).g = aU;
            apct b2 = apds.b(rryVar.i());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            yvw yvwVar3 = (yvw) createBuilder.b;
            b2.getClass();
            yvwVar3.m = b2;
            yvwVar3.b |= 2;
            int f = rryVar.f();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yvw) createBuilder.b).h = f;
            int c = rryVar.c();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yvw) createBuilder.b).i = c;
            int e2 = rryVar.e();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yvw) createBuilder.b).j = e2;
            String ag2 = albo.ag(rryVar.O());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yvw) createBuilder.b).k = ag2;
            int d = rryVar.d();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yvw) createBuilder.b).o = d;
            String ag3 = albo.ag(rryVar.Q(context));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yvw) createBuilder.b).e = ag3;
            String ag4 = albo.ag(rryVar.E());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yvw) createBuilder.b).f = ag4;
            aozy createBuilder2 = ywd.a.createBuilder();
            if (!rryVar.au()) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((ywd) createBuilder2.b).c = "profile";
            } else {
                ParticipantColor participantColor = rryVar.i;
                aozy createBuilder3 = rts.a.createBuilder();
                int i = participantColor.a;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar = createBuilder3.b;
                ((rts) apagVar).c = i;
                int i2 = participantColor.b;
                if (!apagVar.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar2 = createBuilder3.b;
                rts rtsVar = (rts) apagVar2;
                rtsVar.b |= 1;
                rtsVar.d = i2;
                int i3 = participantColor.c;
                if (!apagVar2.isMutable()) {
                    createBuilder3.u();
                }
                ((rts) createBuilder3.b).e = i3;
                rts rtsVar2 = (rts) createBuilder3.s();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ywd ywdVar = (ywd) createBuilder2.b;
                rtsVar2.getClass();
                ywdVar.e = rtsVar2;
                ywdVar.b |= 2;
                if (((Boolean) new msu(3).get()).booleanValue()) {
                    ag = rryVar.r().k();
                    ag.getClass();
                } else {
                    ag = albo.ag(rryVar.N());
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((ywd) createBuilder2.b).c = ag;
                String ag5 = albo.ag(rryVar.K(true));
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((ywd) createBuilder2.b).f = ag5;
                String ag6 = albo.ag(rryVar.M());
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ywd ywdVar2 = (ywd) createBuilder2.b;
                ywdVar2.b |= 1;
                ywdVar2.d = ag6;
            }
            ywd ywdVar3 = (ywd) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            yvw yvwVar4 = (yvw) createBuilder.b;
            ywdVar3.getClass();
            yvwVar4.l = ywdVar3;
            yvwVar4.b |= 1;
            ArrayList arrayList = new ArrayList();
            for (MessagePartCoreData messagePartCoreData : rryVar.T()) {
                if (list != null && messagePartCoreData.t() != null && (messagePartCoreData.bk() || messagePartCoreData.aW())) {
                    list.add(messagePartCoreData);
                }
                Uri t = messagePartCoreData.t();
                aozy createBuilder4 = ywb.a.createBuilder();
                String Z = messagePartCoreData.Z();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ywb ywbVar = (ywb) createBuilder4.b;
                Z.getClass();
                ywbVar.c = Z;
                String ag7 = albo.ag(messagePartCoreData.U());
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ((ywb) createBuilder4.b).d = ag7;
                if (t == null) {
                    uri = "";
                } else {
                    uri = t.toString();
                }
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ywb ywbVar2 = (ywb) createBuilder4.b;
                uri.getClass();
                ywbVar2.e = uri;
                int c2 = messagePartCoreData.c();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ((ywb) createBuilder4.b).g = c2;
                int b3 = messagePartCoreData.b();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ((ywb) createBuilder4.b).f = b3;
                aozn c3 = apdp.c(messagePartCoreData.k());
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ywb ywbVar3 = (ywb) createBuilder4.b;
                c3.getClass();
                ywbVar3.h = c3;
                ywbVar3.b |= 1;
                arrayList.add((ywb) createBuilder4.s());
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            yvw yvwVar5 = (yvw) createBuilder.b;
            apax apaxVar = yvwVar5.n;
            if (!apaxVar.c()) {
                yvwVar5.n = apag.mutableCopy(apaxVar);
            }
            aoyj.addAll(arrayList, yvwVar5.n);
            wks wksVar = rryVar.p;
            if (wksVar != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                yvw yvwVar6 = (yvw) createBuilder.b;
                yvwVar6.p = wksVar;
                yvwVar6.b |= 4;
            }
            yvw yvwVar7 = (yvw) createBuilder.s();
            e.close();
            return yvwVar7;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final yvx b(ackf ackfVar, ackf ackfVar2, List list, Context context, rru rruVar) {
        yvx yvxVar;
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        int i3;
        List<ParticipantsTable.BindData> K;
        yvx yvxVar2 = new yvx(ackfVar);
        ConversationIdType L = rruVar.L();
        yvxVar2.c(L);
        boolean S = rruVar.S();
        if (ackfVar2 == null) {
            yvxVar = null;
        } else {
            yvxVar = new yvx(ackfVar2);
        }
        yvxVar2.a.k("6", c(yvxVar2, yvxVar, list, 0, context));
        yvxVar2.a.m("13", rruVar.I());
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar = rruVar.d;
            sacVar.ao(50, "read");
            z = sacVar.Y;
        } else {
            san sanVar = rruVar.c;
            sanVar.ao(50, "read");
            z = sanVar.Y;
        }
        yvxVar2.a.h("3", z);
        yvxVar2.a.h("43", rruVar.T());
        yvxVar2.a.h("5", S);
        yvxVar2.a.n("7", rruVar.r());
        yvxVar2.a.n("10", rruVar.v());
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar2 = rruVar.d;
            sacVar2.ao(12, "draft_preview_content_type");
            str = sacVar2.m;
        } else {
            san sanVar2 = rruVar.c;
            sanVar2.ao(12, "draft_preview_content_type");
            str = sanVar2.m;
        }
        if (str != null) {
            yvxVar2.a.n("21", str);
        }
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar3 = rruVar.d;
            sacVar3.ao(9, "draft_snippet_text");
            str2 = sacVar3.j;
        } else {
            san sanVar3 = rruVar.c;
            sanVar3.ao(9, "draft_snippet_text");
            str2 = sanVar3.j;
        }
        if (str2 != null) {
            yvxVar2.a.n("20", str2);
        }
        yvxVar2.a.h("19", rruVar.A());
        yvxVar2.a.n("22", rruVar.s());
        if (rruVar.n().isPresent()) {
            msh mshVar = (msh) rruVar.n().get();
            if (((Boolean) new msu(3).get()).booleanValue()) {
                yvxVar2.a.n("41", mshVar.n());
            }
            String o = mshVar.o(((Boolean) new mss(0).get()).booleanValue());
            if (o != null) {
                yvxVar2.a.n("24", o);
            }
        }
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar4 = rruVar.d;
            sacVar4.ao(52, "raw_status");
            i = sacVar4.aa;
        } else {
            san sanVar4 = rruVar.c;
            sanVar4.ao(52, "raw_status");
            i = sanVar4.aa;
        }
        yvxVar2.a.l("33", i);
        yvxVar2.a.l("11", rruVar.b());
        yvxVar2.a.h("34", rtp.b(rruVar.b()));
        yvxVar2.a.h("35", rruVar.C());
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar5 = rruVar.d;
            sacVar5.ao(53, "sms_error_code");
            i2 = sacVar5.ab;
        } else {
            san sanVar5 = rruVar.c;
            sanVar5.ao(53, "sms_error_code");
            i2 = sanVar5.ab;
        }
        yvxVar2.a.l("37", i2);
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar6 = rruVar.d;
            sacVar6.ao(54, "sms_error_desc_map_name");
            str3 = sacVar6.ac;
        } else {
            san sanVar6 = rruVar.c;
            sanVar6.ao(54, "sms_error_desc_map_name");
            str3 = sanVar6.ac;
        }
        yvxVar2.a.n("38", str3);
        if (((okf) this.f.b()).a()) {
            sac sacVar7 = rruVar.d;
            sacVar7.ao(48, "message_protocol");
            i3 = sacVar7.W;
        } else {
            san sanVar7 = rruVar.c;
            sanVar7.ao(48, "message_protocol");
            i3 = sanVar7.W;
        }
        yvxVar2.a.l("36", i3);
        aiut.b();
        if (((okf) this.f.b()).a()) {
            K = ((rur) this.h.b()).f(L);
        } else {
            K = ((rtz) this.c.b()).K(L);
        }
        ArrayList arrayList = new ArrayList();
        for (ParticipantsTable.BindData bindData : K) {
            arbj arbjVar = new arbj(null, null, null, null);
            String P = bindData.P();
            if (P != null) {
                if (((Boolean) new msu(3).get()).booleanValue()) {
                    P = ((msk) this.g.b()).s(bindData).n();
                }
                arbjVar.a = P;
            }
            arbjVar.c = bindData.L();
            arbjVar.ag(lru.g(bindData));
            if (((Optional) arbjVar.b).isPresent()) {
                arbjVar.ag(new ParticipantColor((ParticipantColor) ((Optional) arbjVar.b).get()));
            }
            Object obj = arbjVar.a;
            if (obj != null) {
                arrayList.add(new ywc((String) obj, (String) arbjVar.c, (Optional) arbjVar.b).a());
            } else {
                throw new IllegalStateException("Missing required properties: phoneNumber");
            }
        }
        yvxVar2.a.k("31", arrayList);
        return yvxVar2;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    public final ArrayList c(yvx yvxVar, yvx yvxVar2, List list, int i, Context context) {
        String C;
        String N;
        yvy yvyVar = this;
        List<rry> f = yvyVar.f(ruy.b(yyb.g(yvxVar.a, "1")), i);
        ArrayList arrayList = new ArrayList();
        for (rry rryVar : f) {
            ((rtb) yvyVar.k.a.b()).getClass();
            ywa ywaVar = new ywa();
            String str = "4";
            ywaVar.a.n("4", rryVar.u().a());
            if (rryVar.am()) {
                String Q = rryVar.Q(context);
                if (Q != null) {
                    ywaVar.b(Q);
                }
            } else if ((((Boolean) yvyVar.i.b()).booleanValue() || ((Boolean) ((utz) yig.al.get()).e()).booleanValue()) && (C = rryVar.C()) != null) {
                ywaVar.b(C);
            }
            ywaVar.a.n("44", rryVar.E());
            ywaVar.a.h("45", rryVar.aU());
            ywaVar.a.m("17", rryVar.i());
            ywaVar.a.m("16", rryVar.k());
            ywaVar.a.l("11", rryVar.f());
            ywaVar.a.l("36", rryVar.c());
            ywaVar.a.n("15", rryVar.M());
            ywaVar.a.n("14", rryVar.K(true));
            ywaVar.a.l("33", rryVar.d());
            if (!rryVar.au()) {
                ywaVar.a("profile");
            } else {
                ParticipantColor participantColor = rryVar.i;
                ywaVar.a.n("25", participantColor.a + ":" + participantColor.b + ":" + participantColor.c);
                if (((Boolean) new msu(3).get()).booleanValue()) {
                    N = rryVar.r().k();
                    N.getClass();
                } else {
                    N = rryVar.N();
                }
                ywaVar.a(N);
            }
            ywaVar.a.l("37", rryVar.e());
            ywaVar.a.n("38", rryVar.O());
            List T = rryVar.T();
            if (!T.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(T.size());
                for (Iterator it = T.iterator(); it.hasNext(); it = it) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                    ackf ackfVar = new ackf();
                    ackfVar.n(str, messagePartCoreData.Z());
                    Uri t = messagePartCoreData.t();
                    if (t != null) {
                        ackfVar.n("30", t.toString());
                    }
                    String U = messagePartCoreData.U();
                    if (U != null) {
                        ackfVar.n("26", U);
                    }
                    ackfVar.l("28", messagePartCoreData.b());
                    ackfVar.l("29", messagePartCoreData.c());
                    ackfVar.m("42", messagePartCoreData.k());
                    arrayList2.add(ackfVar);
                    str = str;
                }
                ywaVar.a.k("27", arrayList2);
            }
            if (list != null) {
                for (MessagePartCoreData messagePartCoreData2 : rryVar.T()) {
                    if (messagePartCoreData2.bk() || messagePartCoreData2.aW()) {
                        if (yvxVar2 != null) {
                            Asset b2 = yvxVar2.a.b("27".concat(String.valueOf(messagePartCoreData2.Z())));
                            if (b2 != null) {
                                yvxVar.a(messagePartCoreData2.Z(), b2);
                            }
                        }
                        if (messagePartCoreData2.t() != null) {
                            list.add(messagePartCoreData2);
                        }
                    }
                }
            }
            wks wksVar = rryVar.p;
            if (wksVar == null) {
                ywaVar.a.a.remove("40");
            } else {
                ywaVar.a.j("40", wksVar.toByteArray());
            }
            arrayList.add(ywaVar.a);
            yvyVar = this;
        }
        return arrayList;
    }

    public final void d(Context context, yvx yvxVar, List list) {
        boolean z;
        akrh e = aktp.e("WearableConversationBuilder#loadNewDataParts");
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                if (!messagePartCoreData.bk()) {
                    if (messagePartCoreData.aW()) {
                        if (messagePartCoreData.t() == null) {
                            alwl alwlVar = (alwl) b.i();
                            alwlVar.X(ydl.M, "WearableConversationBuilder");
                            alwlVar.X(ydl.o, messagePartCoreData.z().toString());
                            alwlVar.X(ydl.a, messagePartCoreData.A().a());
                            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadAudio", 316, "WearableConversationBuilder.java")).q("Not syncing audio with empty uri.");
                        } else {
                            String Z = messagePartCoreData.Z();
                            Uri t = messagePartCoreData.t();
                            t.getClass();
                            yvxVar.a(Z, new Asset(null, null, null, t));
                        }
                    }
                } else {
                    boolean z2 = true;
                    if (messagePartCoreData.c() != -1 && messagePartCoreData.c() <= 0) {
                        z = false;
                        if (messagePartCoreData.b() != -1 && messagePartCoreData.b() <= 0) {
                            z2 = false;
                        }
                        if (!z && z2) {
                            ufu ufuVar = (ufu) ((uga) this.d.b()).a(new ueq(messagePartCoreData).d(context, 0));
                            if (ufuVar != null) {
                                try {
                                    try {
                                        byte[] j = ufuVar.j();
                                        if (j != null) {
                                            yvxVar.a(messagePartCoreData.Z(), new Asset(j, null, null, null));
                                        } else {
                                            alwl alwlVar2 = (alwl) b.i();
                                            alwlVar2.X(ydl.M, "WearableConversationBuilder");
                                            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 294, "WearableConversationBuilder.java")).q("Null bytes from image.");
                                        }
                                    } catch (uft e2) {
                                        alwl alwlVar3 = (alwl) ((alwl) b.i()).g(e2);
                                        alwlVar3.X(ydl.M, "WearableConversationBuilder");
                                        ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 301, "WearableConversationBuilder.java")).q("Could not get bytes from image type for setting attachment for wearable.");
                                    }
                                } finally {
                                }
                            }
                        } else {
                            alwl alwlVar4 = (alwl) b.i();
                            alwlVar4.X(ydl.M, "WearableConversationBuilder");
                            alwlVar4.X(ydl.o, messagePartCoreData.z().toString());
                            alwlVar4.X(ydl.a, messagePartCoreData.A().a());
                            alwlVar4.X(ywv.b, Integer.valueOf(messagePartCoreData.c()));
                            alwlVar4.X(ywv.a, Integer.valueOf(messagePartCoreData.b()));
                            ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 272, "WearableConversationBuilder.java")).q("Not syncing image with invalid dimensions.");
                        }
                    }
                    z = true;
                    if (messagePartCoreData.b() != -1) {
                        z2 = false;
                    }
                    if (!z) {
                    }
                    alwl alwlVar42 = (alwl) b.i();
                    alwlVar42.X(ydl.M, "WearableConversationBuilder");
                    alwlVar42.X(ydl.o, messagePartCoreData.z().toString());
                    alwlVar42.X(ydl.a, messagePartCoreData.A().a());
                    alwlVar42.X(ywv.b, Integer.valueOf(messagePartCoreData.c()));
                    alwlVar42.X(ywv.a, Integer.valueOf(messagePartCoreData.b()));
                    ((alwl) alwlVar42.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 272, "WearableConversationBuilder.java")).q("Not syncing image with invalid dimensions.");
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List e(ConversationIdType conversationIdType, List list, Context context) {
        akrh e = aktp.e("WearableConversationBuilder#getMessageDataPayload");
        try {
            List f = f(conversationIdType, 0);
            ArrayList arrayList = new ArrayList();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                arrayList.add(a((rry) it.next(), list, context));
            }
            e.close();
            return arrayList;
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
