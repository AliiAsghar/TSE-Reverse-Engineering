package defpackage;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afup extends arrp implements arqv {
    private final /* synthetic */ int v;
    public static final afup u = new afup(20);
    public static final afup t = new afup(19);
    public static final afup s = new afup(18);
    public static final afup r = new afup(17);
    public static final afup q = new afup(16);
    public static final afup p = new afup(15);
    public static final afup o = new afup(14);
    public static final afup n = new afup(13);
    public static final afup m = new afup(12);
    public static final afup l = new afup(11);
    public static final afup k = new afup(10);
    public static final afup j = new afup(9);
    public static final afup i = new afup(8);
    public static final afup h = new afup(7);
    public static final afup g = new afup(6);
    public static final afup f = new afup(5);
    public static final afup e = new afup(4);
    public static final afup d = new afup(3);
    public static final afup c = new afup(2);
    public static final afup b = new afup(1);
    public static final afup a = new afup(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afup(int i2) {
        super(2);
        this.v = i2;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i2;
        Integer num = null;
        byte b2 = 0;
        boolean z = false;
        switch (this.v) {
            case 0:
                afum afumVar = (afum) obj;
                afvf afvfVar = (afvf) obj2;
                afumVar.getClass();
                afvfVar.getClass();
                afwv.d(afumVar, afvfVar);
                return afumVar;
            case 1:
                afqg afqgVar = (afqg) obj;
                afvf afvfVar2 = (afvf) obj2;
                afqgVar.getClass();
                afvfVar2.getClass();
                afwv.f(afqgVar, afvfVar2);
                return afqgVar;
            case 2:
                afun afunVar = (afun) obj;
                afvf afvfVar3 = (afvf) obj2;
                afunVar.getClass();
                afvfVar3.getClass();
                afwv.f(afunVar, afvfVar3);
                return afunVar;
            case 3:
                afuo afuoVar = (afuo) obj;
                afvf afvfVar4 = (afvf) obj2;
                afuoVar.getClass();
                afvfVar4.getClass();
                afwv.f(afuoVar, afvfVar4);
                return afuoVar;
            case 4:
                ViewGroup viewGroup = (ViewGroup) obj;
                ImageView imageView = (ImageView) obj2;
                viewGroup.getClass();
                imageView.getClass();
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.selection_layout, viewGroup, false);
                inflate.getClass();
                TextView textView = (TextView) inflate;
                viewGroup.addView(textView);
                textView.setOutlineProvider(imageView.getOutlineProvider());
                textView.setClipToOutline(true);
                return textView;
            case 5:
                return a.aH(obj, obj2);
            case 6:
                return a.aH(obj, obj2);
            case 7:
                return a.aH(obj, obj2);
            case 8:
                return a.aH(obj, obj2);
            case 9:
                return a.aH(obj, obj2);
            case 10:
                return a.aH(obj, obj2);
            case 11:
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    ahji.V(null, brg.a, 0L, bwjVar, 0, 7);
                }
                return arnb.a;
            case 12:
                ((ahmn) obj).getClass();
                if (((Cursor) obj2).getCount() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                Cursor cursor = (Cursor) obj2;
                ((ahmn) obj).getClass();
                aron aronVar = new aron((byte[]) (b2 == true ? 1 : 0));
                while (cursor.moveToNext()) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("listener_key"));
                    string.getClass();
                    aronVar.add(string);
                }
                return aqjn.x(aronVar);
            case 14:
                String str = (String) obj;
                arpg arpgVar = (arpg) obj2;
                str.getClass();
                arpgVar.getClass();
                if (str.length() == 0) {
                    return arpgVar.toString();
                }
                return str + ", " + arpgVar;
            case 15:
                arpi arpiVar = (arpi) obj;
                arpg arpgVar2 = (arpg) obj2;
                arpiVar.getClass();
                arpgVar2.getClass();
                arpi minusKey = arpiVar.minusKey(arpgVar2.getKey());
                if (minusKey != arpj.a) {
                    arpf arpfVar = (arpf) minusKey.get(arpf.k);
                    if (arpfVar == null) {
                        return new arpd(minusKey, arpgVar2);
                    }
                    arpi minusKey2 = minusKey.minusKey(arpf.k);
                    if (minusKey2 == arpj.a) {
                        return new arpd(arpgVar2, arpfVar);
                    }
                    return new arpd(new arpd(minusKey2, arpgVar2), arpfVar);
                }
                return arpgVar2;
            case 16:
                arpi arpiVar2 = (arpi) obj;
                arpg arpgVar3 = (arpg) obj2;
                if (arpgVar3 instanceof aktz) {
                    return arpiVar2.plus(((aktz) arpgVar3).c());
                }
                return arpiVar2.plus(arpgVar3);
            case 17:
                arpg arpgVar4 = (arpg) obj2;
                if (((Boolean) obj).booleanValue() || (arpgVar4 instanceof aktz)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                return Boolean.valueOf(d.F(obj, obj2));
            case 19:
                return Integer.valueOf(((Number) obj).intValue() + 1);
            default:
                arpg arpgVar5 = (arpg) obj2;
                if (arpgVar5 instanceof aryk) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 1;
                    }
                    if (i2 == 0) {
                        return arpgVar5;
                    }
                    return Integer.valueOf(i2 + 1);
                }
                return obj;
        }
    }
}
