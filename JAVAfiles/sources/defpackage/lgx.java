package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgx extends arpw implements arqw {
    /* synthetic */ int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgx(lex lexVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = lexVar;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                int intValue = ((Number) obj2).intValue();
                lgx lgxVar = new lgx((mgu) this.c, (arpe) obj3, 2);
                lgxVar.b = (String) obj;
                lgxVar.a = intValue;
                return lgxVar.b(arnb.a);
            }
            int intValue2 = ((Number) obj2).intValue();
            lgx lgxVar2 = new lgx((lex) this.c, (arpe) obj3, 1);
            lgxVar2.b = (gqz) obj;
            lgxVar2.a = intValue2;
            return lgxVar2.b(arnb.a);
        }
        int intValue3 = ((Number) obj).intValue();
        lgx lgxVar3 = new lgx((lgg) this.c, (arpe) obj3, 0);
        lgxVar3.a = intValue3;
        lgxVar3.b = (jhc) obj2;
        return lgxVar3.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [ovg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ovm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        float a;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                aqil.P(obj);
                mgu mguVar = (mgu) this.c;
                Object obj2 = mguVar.b;
                ?? r3 = this.b;
                int i2 = this.a;
                String string = ((Context) obj2).getString(R.string.multi_share_bottom_compose_row_text_placeholder);
                string.getClass();
                Integer num = new Integer(i2);
                mgu mguVar2 = (mgu) this.c;
                return new aeno((afzk) mguVar.a, (CharSequence) r3, string, num, true, new aenn(mguVar2.h.a(), mguVar2.g.a(), false, 4), 32);
            }
            aqil.P(obj);
            List list = ((gqz) this.b).a;
            int i3 = this.a;
            ArrayList<gqt> arrayList = new ArrayList();
            for (Object obj3 : list) {
                gqt gqtVar = (gqt) obj3;
                if ((gqtVar instanceof gqt) && d.F(gqtVar.b(), gqq.a)) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
            for (gqt gqtVar2 : arrayList) {
                gqtVar2.getClass();
                arrayList2.add(gqtVar2);
            }
            if (((gqt) aqjn.Z(arrayList2)) != null) {
                a = r11.a().left / i3;
            } else {
                a = ean.a(((lex) this.c).b.getResources(), R.dimen.split_view_leftside_width_percent);
            }
            return new Float(a);
        }
        aqil.P(obj);
        int i4 = this.a;
        jhc jhcVar = (jhc) this.b;
        String str = jhcVar.a;
        List list2 = jhcVar.b;
        if ((str == null || str.length() == 0) && list2.isEmpty()) {
            return new lgu((String) ((lgg) this.c).b);
        }
        if (str != null && str.length() != 0 && str.length() > i4) {
            return new lgu((String) ((lgg) this.c).a);
        }
        return new lgv(jhcVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgx(lgg lggVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = lggVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgx(mgu mguVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = mguVar;
    }
}
