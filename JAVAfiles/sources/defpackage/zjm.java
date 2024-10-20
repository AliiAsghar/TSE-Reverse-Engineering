package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjm {
    public final Object a;

    public zjm(Object obj) {
        this.a = obj;
    }

    public static int b(ConversationMessageView conversationMessageView, int i, int i2, int i3, int i4) {
        int i5;
        int[] iArr = new int[2];
        conversationMessageView.getLocationInWindow(iArr);
        int i6 = i + i4;
        int i7 = iArr[1] + i6;
        aack aackVar = conversationMessageView.s;
        if (aackVar != null) {
            i5 = ((ixd) ((itb) aackVar).an).D;
        } else {
            i5 = 0;
        }
        int max = i6 + Math.max(i5 - i7, 0);
        if (max + i3 > i2) {
            return i2 - i3;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map, java.lang.Object] */
    public final void a(RecyclerView recyclerView) {
        nw nwVar = recyclerView.m;
        albo.T(nwVar instanceof LinearLayoutManager);
        nwVar.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) nwVar;
        int N = linearLayoutManager.N();
        ArrayList<rry> arrayList = new ArrayList();
        for (int L = linearLayoutManager.L(); L <= N; L++) {
            oo i = recyclerView.i(L, false);
            if (i != null) {
                View view = i.a;
                if (view instanceof ConversationMessageView) {
                    arrayList.add(((ConversationMessageView) view).e);
                }
            }
        }
        Object obj = this.a;
        recyclerView.getContext();
        aagk aagkVar = (aagk) obj;
        long epochMilli = ((xnv) aagkVar.f).f().toEpochMilli();
        ArrayList arrayList2 = new ArrayList();
        HashSet<MessageIdType> hashSet = new HashSet(aagkVar.d.keySet());
        ((ReentrantLock) aagkVar.g).lock();
        try {
            for (rry rryVar : arrayList) {
                if (!hashSet.remove(rryVar.u())) {
                    ((aagk) obj).d.put(rryVar.u(), new xyw(rryVar.P(), epochMilli));
                    if (!((aagk) obj).c) {
                        ((aagk) obj).c = true;
                        ((aagk) obj).d();
                    }
                }
            }
            for (MessageIdType messageIdType : hashSet) {
                xyw xywVar = (xyw) ((aagk) obj).d.get(messageIdType);
                if (xywVar != null && xywVar.b == 2) {
                    arrayList2.add(xywVar);
                }
                ((aagk) obj).d.remove(messageIdType);
            }
            ((ReentrantLock) aagkVar.g).unlock();
            aagkVar.c(arrayList2);
        } catch (Throwable th) {
            ((ReentrantLock) aagkVar.g).unlock();
            throw th;
        }
    }
}
