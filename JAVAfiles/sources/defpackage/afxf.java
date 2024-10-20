package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxf extends arpw implements arqw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxf(afxh afxhVar, RecyclerView recyclerView, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.e = i;
        this.c = afxhVar;
        this.d = recyclerView;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.e != 0) {
            Object obj4 = this.c;
            mlt mltVar = (mlt) obj4;
            afxf afxfVar = new afxf(mltVar, (lgd) this.d, (arpe) obj3, 1);
            afxfVar.a = (lge) obj;
            afxfVar.b = (lhy) obj2;
            return afxfVar.b(arnb.a);
        }
        Object obj5 = this.c;
        afxh afxhVar = (afxh) obj5;
        afxf afxfVar2 = new afxf(afxhVar, (RecyclerView) this.d, (arpe) obj3, 0);
        afxfVar2.a = (Size) obj;
        afxfVar2.b = (afxe) obj2;
        return afxfVar2.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        lhw lhwVar;
        Iterator it;
        String str;
        boolean z;
        String z2;
        if (this.e != 0) {
            aqil.P(obj);
            Object obj2 = this.a;
            lhy lhyVar = (lhy) this.b;
            alog alogVar = lhyVar.a;
            if (alogVar.isEmpty()) {
                return new lib(lhyVar.b, 3);
            }
            ArrayList arrayList = new ArrayList();
            Object obj3 = this.c;
            Object obj4 = this.d;
            mlt mltVar = (mlt) obj3;
            String string = ((Context) mltVar.n).getString(R.string.multi_share_recent_conversations_header);
            string.getClass();
            arrayList.add(new lhx("recent_conversation_header", new aesl(string)));
            Iterator it2 = alogVar.iterator();
            int i = 0;
            while (it2.hasNext()) {
                int i2 = i + 1;
                mmj mmjVar = (mmj) it2.next();
                String b = mmjVar.a.b();
                b.getClass();
                mmjVar.getClass();
                Uri uri = mmjVar.e;
                if (uri == null) {
                    it = it2;
                    str = b;
                    uri = ((xvc) mltVar.c.b()).w(mmjVar.e, mmjVar.b, ((msk) mltVar.b.b()).f(), null);
                } else {
                    it = it2;
                    str = b;
                }
                Uri uri2 = uri;
                uri2.getClass();
                if (mmjVar.d <= 1) {
                    z = true;
                } else {
                    z = false;
                }
                aewg aewgVar = new aewg(new aevv(uri2, Boolean.valueOf(z), null, null, null, 28), null, 0, null, null, 62);
                if (qta.r()) {
                    z2 = wfh.x(mmjVar.b);
                } else {
                    z2 = ((wfh) mltVar.h).z(mmjVar.b);
                }
                String str2 = z2;
                str2.getClass();
                String str3 = mmjVar.c;
                str3.getClass();
                ConversationId conversationId = mmjVar.a;
                conversationId.getClass();
                arrayList.add(new lhx(str, new aesn(aewgVar, str2, str3, ((lge) obj2).a(conversationId), new akkc((ahmn) mltVar.a.b(), "ConversationEntry.onToggle", new lhz(mltVar, i, (lgd) obj4, mmjVar, 0), 2))));
                i = i2;
                it2 = it;
                obj2 = obj2;
            }
            Object obj5 = this.c;
            boolean z3 = lhyVar.d;
            if (!lhyVar.c) {
                lhwVar = null;
            } else if (z3) {
                mlt mltVar2 = (mlt) obj5;
                String string2 = ((Context) mltVar2.n).getString(R.string.multi_share_more_recent_conversations);
                string2.getClass();
                lhwVar = new lhw(string2, new akkc((ahmn) mltVar2.a.b(), "LoadMore.onClick", new lhb(obj5, 8), 2));
            } else {
                mlt mltVar3 = (mlt) obj5;
                String string3 = ((Context) mltVar3.n).getString(R.string.multi_share_less_recent_conversations);
                string3.getClass();
                lhwVar = new lhw(string3, new akkc((ahmn) mltVar3.a.b(), "LoadLess.onClick", new lhb(obj5, 7), 2));
            }
            return new lib(lhwVar, arrayList, true);
        }
        aqil.P(obj);
        Object obj6 = this.a;
        Object obj7 = this.b;
        obj7.getClass();
        ((afxh) this.c).aZ((RecyclerView) this.d, (Size) obj6, (afxe) obj7);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxf(mlt mltVar, lgd lgdVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.e = i;
        this.c = mltVar;
        this.d = lgdVar;
    }
}
