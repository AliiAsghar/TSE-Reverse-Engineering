package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwv implements xwt {
    static final utz a = uuh.i(uuh.b, "disable_logging_archive_api_impl", false);
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/archive/ArchiveApiImpl");
    final xze c = xze.g("Bugle", "ArchiveApiImpl");
    public final armf d;
    public final armf e;
    public final armf f;
    public final mho g;
    public final uhj h;
    public final rix i;
    public final armf j;
    public final lzy k;
    public final yma l;
    private final agnq m;

    public xwv(armf armfVar, armf armfVar2, armf armfVar3, mho mhoVar, uhj uhjVar, rix rixVar, agnq agnqVar, armf armfVar4, lzy lzyVar, yma ymaVar) {
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = mhoVar;
        this.h = uhjVar;
        this.i = rixVar;
        this.m = agnqVar;
        this.j = armfVar4;
        this.k = lzyVar;
        this.l = ymaVar;
    }

    private final alog d(final alog alogVar, final tqc tqcVar, final amfe amfeVar, final boolean z, final Optional optional) {
        aiut.b();
        return (alog) this.m.c("ArchiveApiImpl#setStatusOnConversations", new alhr() { // from class: xwu
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v1, types: [agnq, java.lang.Object] */
            @Override // defpackage.alhr
            public final Object get() {
                xwv xwvVar;
                tqc tqcVar2;
                HashMap hashMap = new HashMap();
                alog alogVar2 = alogVar;
                int size = alogVar2.size();
                int i = 0;
                while (true) {
                    xwvVar = xwv.this;
                    if (i >= size) {
                        break;
                    }
                    ConversationIdType conversationIdType = (ConversationIdType) alogVar2.get(i);
                    tqc r = ((rtz) xwvVar.d.b()).r(conversationIdType);
                    if (r != null) {
                        hashMap.put(conversationIdType, r);
                    }
                    i++;
                }
                xyo c = xwvVar.c.c();
                c.H("Previous archive status of conversations");
                c.z("conversationToPreviousArchiveStatus", hashMap);
                c.q();
                lru lruVar = (lru) xwvVar.e.b();
                aiut.b();
                aozy createBuilder = umr.a.createBuilder();
                List list = (List) Collection.EL.stream(alogVar2).map(new ruh(18)).collect(Collectors.toCollection(new roi(9)));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                umr umrVar = (umr) createBuilder.b;
                apax apaxVar = umrVar.c;
                if (!apaxVar.c()) {
                    umrVar.c = apag.mutableCopy(apaxVar);
                }
                tqc tqcVar3 = tqcVar;
                aoyj.addAll(list, umrVar.c);
                int ordinal = tqcVar3.ordinal();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                umr umrVar2 = (umr) createBuilder.b;
                umrVar2.b |= 1;
                umrVar2.d = ordinal;
                alog alogVar3 = (alog) lruVar.a.c("ConversationDatabaseOperationsImpl#setConversationsArchiveStatus", new rka(lruVar, alogVar2, tqcVar3, (umr) createBuilder.s(), 3));
                xyo c2 = xwvVar.c.c();
                c2.H("ArchivedStatus modified for the following conversations.");
                c2.z("ConversationIds", alogVar3);
                c2.z("newArchiveStatus", tqcVar3);
                c2.q();
                int size2 = alogVar3.size();
                int i2 = 0;
                while (i2 < size2) {
                    ConversationIdType conversationIdType2 = (ConversationIdType) alogVar3.get(i2);
                    String a2 = xwvVar.l.a(conversationIdType2);
                    if (tqcVar3.g() && xwvVar.l.b(a2)) {
                        yma ymaVar = xwvVar.l;
                        qjh.l(ymaVar.a, null, new ylz(ymaVar, a2, (arpe) null, 0), 3);
                    }
                    if (tqcVar3.d() && !conversationIdType2.b()) {
                        if (z) {
                            if (uyh.a()) {
                                xwvVar.i.g(conversationIdType2, optional);
                            } else {
                                xwvVar.i.e(conversationIdType2);
                            }
                        } else {
                            alvw g = xwv.b.g();
                            g.X(alwp.a, "BugleNotifications");
                            alvg alvgVar = (alvg) g;
                            alvgVar.X(ydl.o, conversationIdType2.toString());
                            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/archive/ArchiveApiImpl", "setStatusOnConversations", 196, "ArchiveApiImpl.java")).q("Archiving conversation, canceling IM notification");
                            ((wpp) xwvVar.j.b()).H(conversationIdType2);
                        }
                    }
                    if (((Boolean) ((utz) uyh.f.get()).e()).booleanValue() && ((rtz) xwvVar.d.b()).b(conversationIdType2) == 4) {
                        if (((Boolean) ((utz) uyh.f.get()).e()).booleanValue()) {
                            if (tqcVar3 == tqc.ARCHIVED) {
                                ((wpp) xwvVar.f.b()).aa(12, conversationIdType2);
                            } else if (tqcVar3 == tqc.UNARCHIVED) {
                                ((wpp) xwvVar.f.b()).aa(13, conversationIdType2);
                            }
                        }
                    } else if (!((Boolean) xwv.a.e()).booleanValue()) {
                        tqcVar2 = tqcVar3;
                        xwvVar.g.s(xwvVar.k.e(conversationIdType2), conversationIdType2, amfeVar, (tqc) hashMap.get(conversationIdType2), tqcVar3);
                        xwvVar.h.d(conversationIdType2);
                        i2++;
                        tqcVar3 = tqcVar2;
                    }
                    tqcVar2 = tqcVar3;
                    xwvVar.h.d(conversationIdType2);
                    i2++;
                    tqcVar3 = tqcVar2;
                }
                return alogVar3;
            }
        });
    }

    @Override // defpackage.xwt
    public final alog a(alog alogVar, tqc tqcVar, amfe amfeVar, Optional optional) {
        aiut.b();
        return d(alogVar, tqcVar, amfeVar, true, optional);
    }

    @Override // defpackage.xwt
    public final boolean b(ConversationIdType conversationIdType, tqc tqcVar, amfe amfeVar) {
        aiut.b();
        akrh e = aktp.e("ArchiveApiImpl::setStatusOnConversation");
        try {
            boolean c = c(conversationIdType, tqcVar, amfeVar, true);
            e.close();
            return c;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.xwt
    public final boolean c(ConversationIdType conversationIdType, tqc tqcVar, amfe amfeVar, boolean z) {
        aiut.b();
        if (d(alog.r(conversationIdType), tqcVar, amfeVar, z, Optional.empty()).size() == 1) {
            return true;
        }
        return false;
    }
}
