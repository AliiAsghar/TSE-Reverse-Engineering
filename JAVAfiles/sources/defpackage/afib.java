package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class afib extends arrm implements arqv {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afib(Object obj, int i, byte[] bArr) {
        super(2, obj, abhh.class, "onSatelliteSessionStateChanged", "onSatelliteSessionStateChanged(Lcom/google/android/apps/stargate/proto/OnSatelliteSessionStateChangedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    List list = (List) obj;
                    afnr afnrVar = (afnr) obj2;
                    list.getClass();
                    afnrVar.getClass();
                    ((aflh) this.e).b(list, afnrVar);
                    return arnb.a;
                }
                List list2 = (List) obj;
                afnr afnrVar2 = (afnr) obj2;
                list2.getClass();
                afnrVar2.getClass();
                ((aflh) this.e).c(list2, afnrVar2);
                return arnb.a;
            }
            return ((abhh) this.e).c((abgw) obj, (arpe) obj2);
        }
        fzi fziVar = ((afij) this.e).c;
        fziVar.h.incrementAndGet();
        Object e = fziVar.g.e((gpx) obj, (arpe) obj2);
        arpl arplVar = arpl.a;
        if (e != arplVar) {
            e = arnb.a;
        }
        if (e == arplVar) {
            return e;
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afib(Object obj, int i) {
        super(2, obj, afij.class, "submitData", "submitData(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afib(Object obj, int i, char[] cArr) {
        super(2, obj, aflh.class, "onEmojiRemoved", "onEmojiRemoved(Ljava/util/List;Lcom/google/android/libraries/compose/emoji/data/usage/EmojiUsage;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afib(Object obj, int i, short[] sArr) {
        super(2, obj, aflh.class, "onEmojiAdded", "onEmojiAdded(Ljava/util/List;Lcom/google/android/libraries/compose/emoji/data/usage/EmojiUsage;)V", 0);
        this.a = i;
    }
}
