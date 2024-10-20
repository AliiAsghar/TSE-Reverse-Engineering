package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcw extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcw(arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            jcw jcwVar = new jcw((arpe) obj3, 5, (boolean[]) null);
                            jcwVar.c = (asaj) obj;
                            jcwVar.b = (Throwable) obj2;
                            return jcwVar.b(arnb.a);
                        }
                        jcw jcwVar2 = new jcw((arpe) obj3, 4, (int[]) null);
                        jcwVar2.c = (asaj) obj;
                        jcwVar2.b = (Throwable) obj2;
                        return jcwVar2.b(arnb.a);
                    }
                    jcw jcwVar3 = new jcw((arpe) obj3, 3, (short[]) null);
                    jcwVar3.c = (asaj) obj;
                    jcwVar3.b = obj2;
                    return jcwVar3.b(arnb.a);
                }
                jcw jcwVar4 = new jcw((arpe) obj3, 2, (char[]) null);
                jcwVar4.c = (asaj) obj;
                jcwVar4.b = obj2;
                return jcwVar4.b(arnb.a);
            }
            jcw jcwVar5 = new jcw((arpe) obj3, 1, (byte[]) null);
            jcwVar5.c = (kkc) obj;
            jcwVar5.b = (kkc) obj2;
            return jcwVar5.b(arnb.a);
        }
        jcw jcwVar6 = new jcw((arpe) obj3, 0);
        jcwVar6.c = (asaj) obj;
        jcwVar6.b = (Object[]) obj2;
        return jcwVar6.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, arxm] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        asai aghwVar;
        ncq h;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Object obj2 = null;
                    if (i != 3) {
                        if (i != 4) {
                            arpl arplVar = arpl.a;
                            int i2 = this.a;
                            aqil.P(obj);
                            if (i2 == 0) {
                                ?? r9 = this.c;
                                Object obj3 = this.b;
                                if (obj3 == null) {
                                    ((alvg) kfs.a.i().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$oldestUnreadMessageIdFlow$2", "invokeSuspend", 69, "MessageListPagingDataProviderImpl.kt")).q("oldestUnreadMessageId flow did not emit after timeout. Emitting null to avoid empty message list.");
                                } else {
                                    ((alvg) ((alvg) kfs.a.i()).g((Throwable) obj3).h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$oldestUnreadMessageIdFlow$2", "invokeSuspend", 76, "MessageListPagingDataProviderImpl.kt")).q("oldestUnreadMessageId flow did not emit due to cancellation or timeout. Emitting null to avoid empty message list.");
                                }
                                this.c = null;
                                this.a = 1;
                                if (r9.fv(null, this) == arplVar) {
                                    return arplVar;
                                }
                            }
                            return arnb.a;
                        }
                        arpl arplVar2 = arpl.a;
                        if (this.a != 0) {
                            aqil.P(obj);
                        } else {
                            aqil.P(obj);
                            ?? r92 = this.c;
                            Object obj4 = this.b;
                            if (obj4 == null) {
                                ((alvg) kfs.a.i().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$latestReadMessageFlow$2", "invokeSuspend", 91, "MessageListPagingDataProviderImpl.kt")).q("latestReadMessage flow did not emit after timeout. Emitting null to avoid empty message list.");
                            } else {
                                ((alvg) ((alvg) kfs.a.i()).g((Throwable) obj4).h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$latestReadMessageFlow$2", "invokeSuspend", 98, "MessageListPagingDataProviderImpl.kt")).q("latestReadMessage flow did not emit due to cancellation or timeout. Emitting null to avoid empty message list.");
                            }
                            this.c = null;
                            this.a = 1;
                            if (r92.fv(null, this) == arplVar2) {
                                return arplVar2;
                            }
                        }
                        return arnb.a;
                    }
                    arpl arplVar3 = arpl.a;
                    if (this.a != 0) {
                        aqil.P(obj);
                    } else {
                        aqil.P(obj);
                        ?? r93 = this.c;
                        Iterator<E> it = ((alog) this.b).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((ResolvedRecipient) next).f().A()) {
                                obj2 = next;
                                break;
                            }
                        }
                        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj2;
                        if (resolvedRecipient != null && (h = resolvedRecipient.h()) != null) {
                            aghwVar = lga.as(h);
                        } else {
                            aghwVar = new aghw(Optional.empty(), 9);
                        }
                        this.a = 1;
                        if (armd.r(r93, aghwVar, this) == arplVar3) {
                            return arplVar3;
                        }
                    }
                    return arnb.a;
                }
                arpl arplVar4 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    ?? r94 = this.c;
                    asai asaiVar = (asai) this.b;
                    this.a = 1;
                    if (armd.r(r94, asaiVar, this) == arplVar4) {
                        return arplVar4;
                    }
                }
                return arnb.a;
            }
            arpl arplVar5 = arpl.a;
            if (this.a != 0) {
                Object obj5 = this.c;
                aqil.P(obj);
                return obj5;
            }
            aqil.P(obj);
            Object obj6 = this.c;
            Object obj7 = this.b;
            this.c = obj7;
            this.a = 1;
            ((gqg) ((kkc) obj6).c).e.v(null);
            if (arnb.a != arplVar5) {
                return obj7;
            }
            return arplVar5;
        }
        arpl arplVar6 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            ?? r95 = this.c;
            List o = aqil.o((aehz[]) this.b);
            ArrayList arrayList = new ArrayList();
            for (Object obj8 : o) {
                if (((aehz) obj8).e) {
                    arrayList.add(obj8);
                }
            }
            this.a = 1;
            if (r95.fv(arrayList, this) == arplVar6) {
                return arplVar6;
            }
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcw(arpe arpeVar, int i, byte[] bArr) {
        super(3, arpeVar);
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcw(arpe arpeVar, int i, char[] cArr) {
        super(3, arpeVar);
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcw(arpe arpeVar, int i, int[] iArr) {
        super(3, arpeVar);
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcw(arpe arpeVar, int i, short[] sArr) {
        super(3, arpeVar);
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcw(arpe arpeVar, int i, boolean[] zArr) {
        super(3, arpeVar);
        this.d = i;
    }
}
