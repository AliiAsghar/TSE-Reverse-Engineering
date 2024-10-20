package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: for, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cfor extends fom {
    public static final Parcelable.Creator<Cfor> CREATOR = new eri(20);
    public final String a;
    public final alog b;

    /* JADX WARN: Multi-variable type inference failed */
    public Cfor(String str, String str2, List list) {
        super(str);
        d.s(!list.isEmpty());
        this.a = str2;
        alog n = alog.n(list);
        this.b = n;
    }

    private static List d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fom, defpackage.erj
    public final void b(erg ergVar) {
        char c;
        Integer num;
        String str = this.f;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                ergVar.a = (CharSequence) this.b.get(0);
                return;
            case 2:
            case 3:
                ergVar.b = (CharSequence) this.b.get(0);
                return;
            case 4:
            case 5:
                ergVar.d = (CharSequence) this.b.get(0);
                return;
            case 6:
            case 7:
                ergVar.c = (CharSequence) this.b.get(0);
                return;
            case '\b':
            case '\t':
                String[] ae = eul.ae((String) this.b.get(0), "/");
                try {
                    int parseInt = Integer.parseInt(ae[0]);
                    if (ae.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(ae[1]));
                    } else {
                        num = null;
                    }
                    ergVar.h = Integer.valueOf(parseInt);
                    ergVar.i = num;
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    ergVar.l = Integer.valueOf(Integer.parseInt((String) this.b.get(0)));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str2 = (String) this.b.get(0);
                    int parseInt2 = Integer.parseInt(str2.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str2.substring(0, 2));
                    ergVar.m = Integer.valueOf(parseInt2);
                    ergVar.n = Integer.valueOf(parseInt3);
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List d = d((String) this.b.get(0));
                int size = d.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            ergVar.n = (Integer) d.get(2);
                        } else {
                            return;
                        }
                    }
                    ergVar.m = (Integer) d.get(1);
                }
                ergVar.l = (Integer) d.get(0);
                return;
            case 15:
                List d2 = d((String) this.b.get(0));
                int size2 = d2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            ergVar.q = (Integer) d2.get(2);
                        } else {
                            return;
                        }
                    }
                    ergVar.p = (Integer) d2.get(1);
                }
                ergVar.o = (Integer) d2.get(0);
                return;
            case 16:
            case 17:
                ergVar.s = (CharSequence) this.b.get(0);
                return;
            case 18:
            case 19:
                ergVar.t = (CharSequence) this.b.get(0);
                return;
            case 20:
            case 21:
                ergVar.r = (CharSequence) this.b.get(0);
                return;
            case 22:
                Integer cv = albo.cv((String) this.b.get(0));
                if (cv == null) {
                    ergVar.u = (CharSequence) this.b.get(0);
                    return;
                }
                String a = fon.a(cv.intValue());
                if (a != null) {
                    ergVar.u = a;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Cfor cfor = (Cfor) obj;
            if (Objects.equals(this.f, cfor.f) && Objects.equals(this.a, cfor.a) && alzz.at(this.b, cfor.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f.hashCode() + 527;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((hashCode * 31) + i) * 31) + this.b.hashCode();
    }

    @Override // defpackage.fom
    public final String toString() {
        return this.f + ": description=" + this.a + ": values=" + String.valueOf(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeStringArray((String[]) this.b.toArray(new String[0]));
    }
}
