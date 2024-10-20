package defpackage;

import android.text.InputFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzb extends arsm {
    final /* synthetic */ afzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzb(afzd afzdVar) {
        super(null);
        this.a = afzdVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        InputFilter[] inputFilterArr;
        Integer num = (Integer) obj2;
        if (num != null && num.intValue() != Integer.MAX_VALUE) {
            inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(num.intValue())};
        } else {
            inputFilterArr = new InputFilter[0];
        }
        this.a.setFilters(inputFilterArr);
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
