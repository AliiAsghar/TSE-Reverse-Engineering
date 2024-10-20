package com.google.android.apps.messaging.wearable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import com.google.android.apps.messaging.wearable.action.RequestMoreMessagesAction;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ChannelClient$Channel;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.aagg;
import defpackage.aald;
import defpackage.aand;
import defpackage.aauq;
import defpackage.abdk;
import defpackage.abdo;
import defpackage.abhg;
import defpackage.abrc;
import defpackage.abrg;
import defpackage.abxi;
import defpackage.abxk;
import defpackage.acir;
import defpackage.acit;
import defpackage.acke;
import defpackage.ackf;
import defpackage.acks;
import defpackage.acle;
import defpackage.actx;
import defpackage.agkx;
import defpackage.agnq;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akto;
import defpackage.aktp;
import defpackage.akul;
import defpackage.algk;
import defpackage.alhp;
import defpackage.alls;
import defpackage.alog;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.amfe;
import defpackage.ancs;
import defpackage.anen;
import defpackage.aozy;
import defpackage.armf;
import defpackage.arsd;
import defpackage.atda;
import defpackage.d;
import defpackage.ibi;
import defpackage.mbl;
import defpackage.msk;
import defpackage.mss;
import defpackage.nds;
import defpackage.nzq;
import defpackage.qiu;
import defpackage.qoq;
import defpackage.qox;
import defpackage.qoy;
import defpackage.qoz;
import defpackage.rgc;
import defpackage.rix;
import defpackage.riz;
import defpackage.rja;
import defpackage.rrb;
import defpackage.rsv;
import defpackage.rtb;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.rxn;
import defpackage.ryg;
import defpackage.tqx;
import defpackage.und;
import defpackage.uof;
import defpackage.upk;
import defpackage.vl;
import defpackage.wpp;
import defpackage.wyt;
import defpackage.xnv;
import defpackage.ydl;
import defpackage.yjf;
import defpackage.ytt;
import defpackage.ywh;
import defpackage.ywp;
import defpackage.yyb;
import defpackage.zcd;
import defpackage.zfj;
import defpackage.zms;
import j$.io.FileRetargetClass;
import j$.nio.file.Path;
import j$.time.Duration;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearableBindService extends abdk {
    public static final alwo a = alwo.o("BugleWearable");
    public armf A;
    public armf B;
    public armf C;
    public armf D;
    public armf E;
    public vl b;
    public armf c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;
    public armf h;
    public armf i;
    public armf j;
    public armf k;
    public armf l;
    public armf m;
    public armf n;
    public armf o;
    public armf p;
    public armf q;
    public armf r;
    public armf s;
    public armf t;
    public armf u;
    public armf v;
    public armf w;
    public armf x;
    public armf y;
    public armf z;

    public static acir c() {
        aozy createBuilder = ywp.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((ywp) createBuilder.b).d = a.aq(4);
        return actx.s(((ywp) createBuilder.s()).toByteArray());
    }

    private final akul q() {
        return ((aagg) this.C.b()).a().h(new zms(18), (Executor) this.u.b());
    }

    private final void r(ChannelClient$Channel channelClient$Channel, Uri uri) {
        aktp.ah(new aauq(this, channelClient$Channel, uri, 6), (Executor) this.v.b()).k(qiu.b(), (Executor) this.u.b());
    }

    public final acir b(akul akulVar) {
        acit acitVar = new acit();
        akulVar.h(new aald(acitVar, 11), (Executor) this.u.b()).k(qiu.b(), (Executor) this.u.b());
        return (acir) acitVar.a;
    }

    @Override // defpackage.acko
    public final acir d(final String str, final String str2, final byte[] bArr) {
        akrc b = ((aksr) this.q.b()).b("WearableBindService#onRequest");
        try {
            acir g = agkx.g(q().i(new ancs() { // from class: abdm
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj) {
                    acir e;
                    ywm ywmVar;
                    String str3;
                    String concat;
                    ywm ywmVar2;
                    ywn ywnVar;
                    akul c;
                    alhp b2 = alhp.b(alfb.a);
                    String str4 = str;
                    WearableBindService wearableBindService = WearableBindService.this;
                    byte[] bArr2 = bArr;
                    String str5 = str2;
                    if (str5.startsWith("/bugle/rpc/proto/v1/")) {
                        alwl alwlVar = (alwl) WearableBindService.a.g();
                        alwlVar.X(ydl.M, "WearableBindService");
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "handleProtoRpcPath", 452, "WearableBindService.java")).D("#onRequest nodeId: %s, path: %s", str4, str5);
                        ((ywf) wearableBindService.r.b()).a(str5);
                        try {
                            ywu ywuVar = (ywu) apag.parseFrom(ywu.a, bArr2, aozs.a());
                            String str6 = ywuVar.d;
                            ywuVar.getClass();
                            str5.getClass();
                            if (ywt.a(ywuVar.b).ordinal() != 0) {
                                concat = str5;
                            } else {
                                if (ywuVar.b == 2) {
                                    ywmVar = (ywm) ywuVar.c;
                                } else {
                                    ywmVar = ywm.a;
                                }
                                int T = a.T(ywmVar.e);
                                if (T != 0) {
                                    if (T != 2) {
                                        if (T != 3) {
                                            if (T != 4) {
                                                if (T != 5) {
                                                    if (T == 6) {
                                                        str3 = "LOAD_TYPE_LATEST";
                                                    }
                                                } else {
                                                    str3 = "LOAD_TYPE_AROUND";
                                                }
                                            } else {
                                                str3 = "LOAD_TYPE_NEXT";
                                            }
                                        } else {
                                            str3 = "LOAD_TYPE_PREVIOUS";
                                        }
                                    } else {
                                        str3 = "UNKNOWN_LOAD_TYPE";
                                    }
                                    concat = str5.concat(str3);
                                }
                                str3 = "UNRECOGNIZED";
                                concat = str5.concat(str3);
                            }
                            try {
                                int ordinal = ywt.a(ywuVar.b).ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal == 2) {
                                        }
                                        alwl alwlVar2 = (alwl) WearableBindService.a.i();
                                        alwlVar2.X(ydl.M, "WearableBindService");
                                        ((alwl) alwlVar2.h("com/google/android/apps/messaging/wearable/WearableBindService", "processProtoRequest", 574, "WearableBindService.java")).t("Unsupported Request Payload: %s", ywt.a(ywuVar.b));
                                        e = WearableBindService.c();
                                    } else {
                                        abei abeiVar = (abei) wearableBindService.A.b();
                                        if (ywuVar.b == 3) {
                                            ywnVar = (ywn) ywuVar.c;
                                        } else {
                                            ywnVar = ywn.a;
                                        }
                                        ywnVar.getClass();
                                        c = qjh.c(abeiVar.d, arpj.a, arwf.a, new zez(abeiVar, ywnVar, (arpe) null, 16));
                                        e = wearableBindService.b(c);
                                    }
                                } else {
                                    abdx abdxVar = (abdx) wearableBindService.z.b();
                                    if (ywuVar.b == 2) {
                                        ywmVar2 = (ywm) ywuVar.c;
                                    } else {
                                        ywmVar2 = ywm.a;
                                    }
                                    e = wearableBindService.b(abdxVar.a(ywmVar2, str4));
                                }
                                wearableBindService.g(e, concat, str6, b2);
                            } catch (RuntimeException e2) {
                                b2.f();
                                wearableBindService.h("Exception while handling RPC for path", e2, concat, str6, b2.c());
                                throw e2;
                            }
                        } catch (apba e3) {
                            b2.f();
                            wearableBindService.h("Unable to parse WearableSyncRequest from watch to the phone", e3, str5, "", b2.c());
                            aozy createBuilder = ywp.a.createBuilder();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            ((ywp) createBuilder.b).d = a.aq(7);
                            e = actx.s(((ywp) createBuilder.s()).toByteArray());
                        }
                        alwl alwlVar3 = (alwl) WearableBindService.a.g();
                        alwlVar3.X(ydl.M, "WearableBindService");
                        ((alwl) alwlVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "onRequestInner", 382, "WearableBindService.java")).t("RPC proto onRequest complete. Path: %s", str5);
                    } else {
                        alwl alwlVar4 = (alwl) WearableBindService.a.g();
                        alwlVar4.X(ydl.M, "WearableBindService");
                        ((alwl) alwlVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "handleDataMapRpcPath", 502, "WearableBindService.java")).D("#onRequest nodeId: %s, path: %s", str4, str5);
                        ((ywf) wearableBindService.r.b()).a(str5);
                        ackf c2 = ackf.c(bArr2);
                        String h = yyb.h(c2, "39");
                        try {
                            e = wearableBindService.e(str5, c2, str4);
                            wearableBindService.g(e, str5, h, b2);
                            alwl alwlVar5 = (alwl) WearableBindService.a.g();
                            alwlVar5.X(ydl.M, "WearableBindService");
                            ((alwl) alwlVar5.h("com/google/android/apps/messaging/wearable/WearableBindService", "onRequestInner", 390, "WearableBindService.java")).t("Message client onRequest complete. Path: %s", str5);
                        } catch (RuntimeException e4) {
                            b2.f();
                            wearableBindService.h("Exception while handling RPC for path", e4, str5, h, b2.c());
                            throw e4;
                        }
                    }
                    return agkx.f(e);
                }
            }, (Executor) this.u.b()));
            b.close();
            return g;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v26, types: [armf, java.lang.Object] */
    public final acir e(String str, ackf ackfVar, String str2) {
        char c;
        if (!((yjf) this.j.b()).h()) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(ydl.M, "WearableBindService");
            ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "performActionForRpc", 842, "WearableBindService.java")).q("#performActionForRpc: Insufficient permissions.");
        }
        switch (str.hashCode()) {
            case -1880220590:
                if (str.equals("/bugle/rpc/open_conversation/")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1399332381:
                if (str.equals("/bugle/rpc/mark_as_read/")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -470962684:
                if (str.equals("/bugle/rpc/download_message/")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -398236043:
                if (str.equals("/bugle/rpc/call_contact/")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -197273462:
                if (str.equals("/bugle/rpc/update_data/")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 128641265:
                if (str.equals("/bugle/rpc/resend_message/")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 163286401:
                if (str.equals("/bugle/rpc/delete_message/")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 471377826:
                if (str.equals("/bugle/rpc/ping/")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 711558340:
                if (str.equals("/bugle/rpc/create_conversation/")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1124666163:
                if (str.equals("/bugle/rpc/delete_conversation/")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1261709220:
                if (str.equals("/bugle/rpc/request_more_messages/")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2097144196:
                if (str.equals("/bugle/rpc/send_message/")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String[] strArr = null;
        switch (c) {
            case 0:
                Intent intent = new Intent("android.intent.action.CALL", Uri.parse(yyb.g(ackfVar, "32")));
                intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                try {
                    akto.n((Context) this.c.b(), intent);
                    break;
                } catch (SecurityException unused) {
                    alwl alwlVar2 = (alwl) a.g();
                    alwlVar2.X(ydl.M, "WearableBindService");
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/wearable/WearableBindService", "performActionForRpc", 858, "WearableBindService.java")).q("Messages app has no direct permissions to make phone calls. Opening populated dialpad.");
                    intent.setAction("android.intent.action.DIAL");
                    akto.n((Context) this.c.b(), intent);
                    break;
                }
            case 1:
                ((uof) ((zfj) this.o.b()).a.b()).b(upk.a("sync_data_to_wearable_app", und.a));
                break;
            case 2:
                ConversationIdType b = ruy.b(yyb.g(ackfVar, "1"));
                String h = yyb.h(ackfVar, "android.intent.extra.TEXT");
                rgc rgcVar = (rgc) ((ibi) this.m.b()).a;
                ryg rygVar = (ryg) rgcVar.a.b();
                rygVar.getClass();
                wyt wytVar = (wyt) rgcVar.e.b();
                wytVar.getClass();
                xnv xnvVar = (xnv) rgcVar.f.b();
                xnvVar.getClass();
                tqx tqxVar = (tqx) rgcVar.g.b();
                tqxVar.getClass();
                agnq agnqVar = (agnq) rgcVar.h.b();
                agnqVar.getClass();
                rsv rsvVar = (rsv) rgcVar.i.b();
                rsvVar.getClass();
                rtb rtbVar = (rtb) rgcVar.j.b();
                rtbVar.getClass();
                anen anenVar = (anen) rgcVar.k.b();
                anenVar.getClass();
                anen anenVar2 = (anen) rgcVar.l.b();
                anenVar2.getClass();
                armf armfVar = rgcVar.o;
                armf armfVar2 = rgcVar.n;
                new SendMessageToConversationOrParticipantsAction(rygVar, rgcVar.b, rgcVar.c, rgcVar.d, wytVar, xnvVar, tqxVar, agnqVar, rsvVar, rtbVar, anenVar, anenVar2, rgcVar.m, armfVar2, armfVar, b, h).z();
                break;
            case 3:
                Object obj = ackfVar.a.get("23");
                if (obj != null) {
                    try {
                        strArr = (String[]) obj;
                    } catch (ClassCastException e) {
                        ackf.q("23", obj, "String[]", e);
                    }
                }
                strArr.getClass();
                String h2 = yyb.h(ackfVar, "android.intent.extra.TEXT");
                ArrayList arrayList = new ArrayList();
                for (String str3 : strArr) {
                    String trim = str3.trim();
                    if (!TextUtils.isEmpty(trim)) {
                        if (((Boolean) new mss(14).get()).booleanValue()) {
                            arrayList.add(((nds) this.y.b()).a(((msk) this.x.b()).n(trim)));
                        } else {
                            arrayList.add(rxn.b(trim));
                        }
                    } else {
                        alwl alwlVar3 = (alwl) a.i();
                        alwlVar3.X(ydl.M, "WearableBindService");
                        ((alwl) alwlVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMessageToRecipients", 599, "WearableBindService.java")).q("SendMessageToParticipantsAction hit empty recipient.");
                    }
                }
                rgc rgcVar2 = (rgc) ((ibi) this.m.b()).a;
                ryg rygVar2 = (ryg) rgcVar2.a.b();
                rygVar2.getClass();
                wyt wytVar2 = (wyt) rgcVar2.e.b();
                wytVar2.getClass();
                xnv xnvVar2 = (xnv) rgcVar2.f.b();
                xnvVar2.getClass();
                tqx tqxVar2 = (tqx) rgcVar2.g.b();
                tqxVar2.getClass();
                agnq agnqVar2 = (agnq) rgcVar2.h.b();
                agnqVar2.getClass();
                rsv rsvVar2 = (rsv) rgcVar2.i.b();
                rsvVar2.getClass();
                rtb rtbVar2 = (rtb) rgcVar2.j.b();
                rtbVar2.getClass();
                anen anenVar3 = (anen) rgcVar2.k.b();
                anenVar3.getClass();
                anen anenVar4 = (anen) rgcVar2.l.b();
                anenVar4.getClass();
                armf armfVar3 = rgcVar2.o;
                armf armfVar4 = rgcVar2.n;
                new SendMessageToConversationOrParticipantsAction(rygVar2, rgcVar2.b, rgcVar2.c, rgcVar2.d, wytVar2, xnvVar2, tqxVar2, agnqVar2, rsvVar2, rtbVar2, anenVar3, anenVar4, rgcVar2.m, armfVar4, armfVar3, arrayList, h2).z();
                break;
            case 4:
                ((rix) this.n.b()).e(ruy.b(yyb.g(ackfVar, "1")));
                break;
            case 5:
                ((qoq) this.k.b()).r((Context) this.c.b(), new BugleConversationId(ruy.b(yyb.g(ackfVar, "1"))));
                break;
            case 6:
                ((rja) this.f.b()).b(rvc.b(yyb.g(ackfVar, "4")), null).z();
                break;
            case 7:
                String g = yyb.g(ackfVar, "4");
                if (((nzq) this.B.b()).a()) {
                    ((wpp) this.h.b()).Y(rvc.b(g), 4);
                    break;
                } else {
                    ((wpp) this.h.b()).V(rvc.b(g));
                    break;
                }
            case '\b':
                ConversationIdType b2 = ruy.b(yyb.g(ackfVar, "1"));
                ((mbl) this.t.b()).c("Bugle.UI.DeleteConversation");
                qoz qozVar = (qoz) this.i.b();
                qox a2 = qoy.a();
                a2.b(b2);
                a2.f(amfe.CONVERSATION_FROM_WEARABLE_ACTION);
                a2.c(((xnv) this.p.b()).f().toEpochMilli());
                qiu.h(qozVar.a(a2.a()));
                break;
            case '\t':
                new RequestMoreMessagesAction(str2, ruy.b(yyb.g(ackfVar, "1")), ackfVar.p("8")).z();
                break;
            case '\n':
                ((riz) this.g.b()).a(rvc.b(yyb.g(ackfVar, "4")));
                break;
            case 11:
                break;
            default:
                alwl alwlVar4 = (alwl) a.i();
                alwlVar4.X(ydl.M, "WearableBindService");
                ((alwl) alwlVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "performActionForRpc", 966, "WearableBindService.java")).t("Unsupported RPC path called: %s", str);
                return c();
        }
        aozy createBuilder = ywp.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((ywp) createBuilder.b).d = a.aq(3);
        return actx.s(((ywp) createBuilder.s()).toByteArray());
    }

    public final akul f(ChannelClient$Channel channelClient$Channel) {
        abrc abrcVar = (abrc) this.d.b();
        d.aC(channelClient$Channel, "channel must not be null");
        abrg abrgVar = abrcVar.i;
        acks acksVar = new acks((ChannelImpl) channelClient$Channel, abrgVar);
        abrgVar.b(acksVar);
        return akul.g(agkx.f(abhg.n(acksVar, new acle(1))));
    }

    public final void g(acir acirVar, String str, String str2, alhp alhpVar) {
        acirVar.s(aktp.S(new abxk(this, alhpVar, str, str2, 1)));
        acirVar.r(aktp.R(new abxi(this, alhpVar, str, str2, 1)));
    }

    public final void h(String str, Throwable th, String str2, String str3, Duration duration) {
        alwl alwlVar = (alwl) a.i();
        alwlVar.X(ydl.M, "WearableBindService");
        ((alwl) ((alwl) alwlVar.g(th)).h("com/google/android/apps/messaging/wearable/WearableBindService", "logRequestReceiveFailure", 978, "WearableBindService.java")).D("%s: %s", str, str2);
        ywh ywhVar = (ywh) this.s.b();
        str2.getClass();
        str3.getClass();
        duration.getClass();
        if (!ywhVar.b()) {
            return;
        }
        ywhVar.c(9, str2, str3, duration, ywhVar.a(th));
    }

    @Override // defpackage.acko
    public final void i(ChannelClient$Channel channelClient$Channel) {
        akrc b = ((aksr) this.q.b()).b("WearableBindService#onChannelOpened");
        try {
            String a2 = channelClient$Channel.a();
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(ydl.M, "WearableBindService");
            ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "onChannelOpened", 631, "WearableBindService.java")).t("#onChannelOpened path: %s", a2);
            if (!arsd.O(a2, "#")) {
                r(channelClient$Channel, Uri.parse(a2));
            } else {
                String a3 = channelClient$Channel.a();
                String substring = a3.substring(arsd.ai(a3, "#") + 1);
                substring.getClass();
                int parseInt = Integer.parseInt(substring);
                String substring2 = a3.substring(0, arsd.ai(a3, "#"));
                substring2.getClass();
                Uri parse = Uri.parse(substring2);
                parse.getClass();
                if (parseInt != 0) {
                    if (parseInt == 2) {
                        f(channelClient$Channel).k(qiu.c(new zcd(this, parse, 20, null)), (Executor) this.v.b());
                    } else {
                        throw new IllegalArgumentException(a.bV(parseInt, "Unsupported content type: "));
                    }
                } else {
                    r(channelClient$Channel, parse);
                }
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acko
    public final void j(MessageEventParcelable messageEventParcelable) {
        akrc b = ((aksr) this.q.b()).b("WearableBindService#onMessageReceived");
        try {
            qiu.h(q().h(new abdo(this, messageEventParcelable, 0), (Executor) this.u.b()));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acko
    public final void k(ChannelClient$Channel channelClient$Channel) {
        akrc b = ((aksr) this.q.b()).b("WearableBindService#onChannelClosed");
        try {
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(ydl.M, "WearableBindService");
            ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "onChannelClosed", 814, "WearableBindService.java")).t("#onChannelClosed path: %s", channelClient$Channel.a());
            rrb rrbVar = (rrb) this.b.remove(channelClient$Channel);
            if (rrbVar != null && rrbVar.g()) {
                rrbVar.f();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acko
    public final void l(acke ackeVar) {
        akrc b = ((aksr) this.q.b()).b("WearableBindService#onDataChanged");
        try {
            Stream map = StreamSupport.stream(Spliterators.spliteratorUnknownSize(new atda(ackeVar, 1), 16), false).filter(new ytt(19)).map(new aand(13));
            int i = alog.d;
            final alog alogVar = (alog) map.collect(alls.a);
            ackeVar.b();
            if (!alogVar.isEmpty()) {
                qiu.h(q().h(new algk() { // from class: abdp
                    @Override // defpackage.algk
                    public final Object apply(Object obj) {
                        String str;
                        alog alogVar2 = alogVar;
                        int size = alogVar2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ackb ackbVar = (ackb) alogVar2.get(i2);
                            ackc b2 = ackbVar.b();
                            String path = b2.a().getPath();
                            if ("/bugle/watch_version/".equals(path)) {
                                CheckWearableAppVersionAction.h();
                            } else if (ackbVar.a() == 1 && "/bugle/attachments/".equals(path)) {
                                WearableBindService wearableBindService = WearableBindService.this;
                                ackf ackfVar = (ackf) adae.h(b2).a;
                                String h = yyb.h(ackfVar, "39");
                                ywh ywhVar = (ywh) wearableBindService.s.b();
                                path.getClass();
                                if (ywhVar.b()) {
                                    ywhVar.c(5, path, h, null, ywhVar.a(new abra(new Status(0))));
                                }
                                ConversationIdType b3 = ruy.b(yyb.g(ackfVar, "1"));
                                String g = yyb.g(ackfVar, "26");
                                if (gh.e(g)) {
                                    Asset b4 = ackfVar.b("27");
                                    if (b4 == null) {
                                        alwl alwlVar = (alwl) WearableBindService.a.i();
                                        alwlVar.X(ydl.M, "WearableBindService");
                                        ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendAudioAttachment", 293, "WearableBindService.java")).q("Asset is null, sending voice message stopped.");
                                    } else {
                                        if (true != ((Boolean) nhr.a.e()).booleanValue()) {
                                            str = "amr";
                                        } else {
                                            str = "m4a";
                                        }
                                        Uri d = uhl.d(str, (Context) wearableBindService.c.b());
                                        if (d == null) {
                                            alwl alwlVar2 = (alwl) WearableBindService.a.i();
                                            alwlVar2.X(ydl.M, "WearableBindService");
                                            ((alwl) alwlVar2.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendAudioAttachment", 304, "WearableBindService.java")).q("Creating Uri failed, sending voice message stopped.");
                                        } else {
                                            File i3 = uhl.i(d, (Context) wearableBindService.c.b());
                                            if (i3 == null) {
                                                alwl alwlVar3 = (alwl) WearableBindService.a.i();
                                                alwlVar3.X(ydl.M, "WearableBindService");
                                                ((alwl) alwlVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendAudioAttachment", 314, "WearableBindService.java")).q("Unable to create the scratch file, sending voice message stopped.");
                                            } else {
                                                Path path2 = FileRetargetClass.toPath(i3);
                                                abrc abrcVar = (abrc) wearableBindService.e.b();
                                                if (b4.b != null) {
                                                    if (b4.a == null) {
                                                        abrg abrgVar = abrcVar.i;
                                                        aclb aclbVar = new aclb(abrgVar, b4);
                                                        abrgVar.b(aclbVar);
                                                        qiu.h(akul.g(agkx.f(abhg.n(aclbVar, new acle(2)))).h(new abdo(wearableBindService, path2, 2), (Executor) wearableBindService.v.b()).h(new wua(wearableBindService, ackfVar, b3, d, 8), (Executor) wearableBindService.u.b()));
                                                    } else {
                                                        throw new IllegalArgumentException("invalid asset");
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("invalid asset");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    alwl alwlVar4 = (alwl) WearableBindService.a.i();
                                    alwlVar4.X(ydl.M, "WearableBindService");
                                    ((alwl) alwlVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "onDataChangedInner", 281, "WearableBindService.java")).t("Invalid attachment type: %s", g);
                                }
                            }
                        }
                        return null;
                    }
                }, (Executor) this.w.b()));
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abdk, defpackage.acko, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new vl();
    }
}
