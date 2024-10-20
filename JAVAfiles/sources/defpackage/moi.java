package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class moi extends unp {
    public final armf a;
    private final agnq b;

    public moi(agnq agnqVar, armf armfVar) {
        this.b = agnqVar;
        this.a = armfVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("CreateOrUpdateLighterConversationHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        final mof mofVar = (mof) apbtVar;
        if (((Boolean) this.a.b()).booleanValue()) {
            int i = mofVar.b;
            if ((i & 2) == 0 || (i & 1) == 0 || (i & 1024) == 0) {
                throw new IllegalStateException("Cannot create or update a conversation without LighterConversationId, BusinessId, SyncTimestamp.");
            }
        }
        this.b.e("LighterConversationManager#createConversation", new Runnable() { // from class: mog
            @Override // java.lang.Runnable
            public final void run() {
                Object apply;
                agnw d;
                agnw d2;
                tqc tqcVar;
                tqc tqcVar2;
                Integer valueOf;
                Integer valueOf2;
                mof mofVar2 = mofVar;
                moi.D.l("Updating Lighter conversation with business_id:".concat(String.valueOf(mofVar2.c)));
                String str = mofVar2.c;
                srw a = srz.a();
                a.w("CreateOrUpdateLighterConversationHandler#getExistingConversation");
                a.d(new moh(str, 1));
                apply = new mmv(13).apply(srz.e);
                int i2 = 0;
                a.c((srs) apply);
                sru sruVar = (sru) a.b().m((agmh) srz.e.d);
                try {
                    alob alobVar = new alob();
                    while (sruVar.moveToNext()) {
                        sruVar.g();
                        alobVar.h(sruVar.g());
                    }
                    alog g = alobVar.g();
                    moi moiVar = moi.this;
                    sruVar.close();
                    ConversationIdType conversationIdType = (ConversationIdType) Collection.EL.stream(g).findFirst().orElse(ruy.a);
                    int i3 = 2;
                    if (!conversationIdType.b()) {
                        if (((Boolean) moiVar.a.b()).booleanValue()) {
                            srx srxVar = new srx();
                            srxVar.ag();
                            srxVar.aj("CreateOrUpdateLighterConversationHandler#updateConversation1");
                            srxVar.f(new moh(mofVar2, i2));
                            long j = mofVar2.m;
                            valueOf = Integer.valueOf(a.bp().c());
                            int intValue = valueOf.intValue();
                            valueOf2 = Integer.valueOf(a.bp().c());
                            int intValue2 = valueOf2.intValue();
                            if (intValue2 < 59100) {
                                agnc.t("sync_timestamp_ms", intValue2);
                            }
                            if (intValue >= 59100) {
                                srxVar.a.put("sync_timestamp_ms", Long.valueOf(j));
                            }
                            srxVar.d(mofVar2.d);
                            if ((mofVar2.b & 64) != 0) {
                                srxVar.e(mofVar2.i);
                            }
                            if ((mofVar2.b & 128) != 0) {
                                srxVar.c(mofVar2.j);
                            }
                            if (srxVar.a().e() <= 0) {
                                return;
                            }
                        }
                        sng sngVar = new sng();
                        sngVar.aj("CreateOrUpdateLighterConversationHandler#updateConversation2");
                        sngVar.ab();
                        sngVar.X(new moh(conversationIdType, i3));
                        if ((mofVar2.b & 4) != 0) {
                            sngVar.x(mofVar2.e);
                        }
                        if ((mofVar2.b & 8) != 0) {
                            sngVar.S(mofVar2.f);
                        }
                        if ((mofVar2.b & 16) != 0) {
                            sngVar.u(albo.af(mofVar2.g));
                        }
                        if ((mofVar2.b & 32) != 0) {
                            sngVar.T(mofVar2.h);
                        }
                        if ((mofVar2.b & 256) != 0) {
                            if (mofVar2.k) {
                                tqcVar2 = tqc.BLOCKED_FOLDER;
                            } else {
                                tqcVar2 = tqc.UNARCHIVED;
                            }
                            sngVar.h(tqcVar2);
                        }
                        sngVar.a().e();
                        if (!((Boolean) moiVar.a.b()).booleanValue()) {
                            srx srxVar2 = new srx();
                            srxVar2.aj("CreateOrUpdateLighterConversationHandler#updateConversation3");
                            srxVar2.f(new moh(mofVar2, 3));
                            int i4 = mofVar2.b;
                            if ((i4 & 64) != 0) {
                                srxVar2.e(mofVar2.i);
                            } else if ((i4 & 2) == 0 && (i4 & 128) == 0) {
                                return;
                            }
                            if ((mofVar2.b & 2) != 0) {
                                srxVar2.d(mofVar2.d);
                            }
                            if ((mofVar2.b & 128) != 0) {
                                srxVar2.c(mofVar2.j);
                            }
                            srxVar2.a().e();
                            return;
                        }
                        return;
                    }
                    if (!((Boolean) moiVar.a.b()).booleanValue()) {
                        int i5 = mofVar2.b;
                        if ((i5 & 2) == 0 || (i5 & 1) == 0) {
                            throw new IllegalStateException("Cannot create a conversation without LighterConversationId or BusinessId.");
                        }
                    }
                    smt c = sni.c();
                    c.ar(new xhv());
                    c.Y(1);
                    c.au(4);
                    c.c(tqc.UNARCHIVED);
                    c.i(0);
                    if ((mofVar2.b & 4) != 0) {
                        c.M(mofVar2.e);
                    }
                    if ((mofVar2.b & 8) != 0) {
                        c.as(mofVar2.f);
                    }
                    if ((mofVar2.b & 16) != 0) {
                        c.A(albo.af(mofVar2.g));
                    }
                    int i6 = mofVar2.b;
                    if ((i6 & 32) != 0) {
                        c.at(mofVar2.h);
                    } else if ((i6 & 512) != 0) {
                        c.at(mofVar2.l);
                    }
                    if ((mofVar2.b & 256) != 0) {
                        if (mofVar2.k) {
                            tqcVar = tqc.BLOCKED_FOLDER;
                        } else {
                            tqcVar = tqc.UNARCHIVED;
                        }
                        c.c(tqcVar);
                    }
                    ConversationIdType y = c.a().y();
                    int i7 = spk.a;
                    srq srqVar = new srq();
                    srqVar.c(y);
                    if (((Boolean) moiVar.a.b()).booleanValue()) {
                        srqVar.b(mofVar2.c);
                        srqVar.e(mofVar2.d);
                        srqVar.g(mofVar2.m);
                    } else {
                        if ((mofVar2.b & 1) != 0) {
                            srqVar.b(mofVar2.c);
                        }
                        if ((mofVar2.b & 2) != 0) {
                            srqVar.e(mofVar2.d);
                        }
                    }
                    if ((mofVar2.b & 64) != 0) {
                        srqVar.f(mofVar2.i);
                    }
                    if ((mofVar2.b & 128) != 0) {
                        srqVar.d(mofVar2.j);
                    }
                    srp a2 = srqVar.a();
                    d = agnc.d("$primary");
                    d2 = agnc.d("$primary");
                    agnc.a(d2, "lighter_conversations_table", a2, new spl(d, 4), new smq(a2, 4));
                } catch (Throwable th) {
                    try {
                        sruVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        return aktp.ag(upm.b());
    }

    @Override // defpackage.unx
    public final apca e() {
        return mof.a.getParserForType();
    }
}
