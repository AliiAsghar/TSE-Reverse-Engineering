package defpackage;

import android.graphics.PorterDuff;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import defpackage.bwj;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class a {
    public static /* synthetic */ int A(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ boolean D(byn bynVar) {
        return ((Boolean) bynVar.a()).booleanValue();
    }

    public static /* synthetic */ int[] G() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static /* synthetic */ void H(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((oo) list.get(size)).a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ Object I(Object obj) {
        aqil.P(obj);
        return arnb.a;
    }

    public static /* synthetic */ boolean J(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object K(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        }
        return arnb.a;
    }

    public static /* synthetic */ int L(double d) {
        double pow;
        double d2 = d / 100.0d;
        if (d2 <= 0.0031308d) {
            pow = d2 * 12.92d;
        } else {
            pow = (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        int round = (int) Math.round(pow * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static /* synthetic */ int M(int i) {
        return i - 1;
    }

    public static /* synthetic */ void N(int i, int i2) {
        if (i >= 0 && i < i2) {
        } else {
            throw new IndexOutOfBoundsException(bU(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void O(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(bU(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void P(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            } else {
                throw new IllegalArgumentException(bU(i2, i, "fromIndex: ", " > toIndex: "));
            }
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static /* synthetic */ long Q(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ int R(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return 0;
        }
        return 3;
    }

    public static /* synthetic */ int S(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int T(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            if (i != 4) {
                return 0;
            }
            return 6;
        }
        return 5;
    }

    public static /* synthetic */ int U(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return 0;
        }
        return 5;
    }

    public static /* synthetic */ int V(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int W(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int X(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int Y(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return 0;
        }
        return 4;
    }

    public static /* synthetic */ int Z(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return 5;
        }
        return 4;
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "IS_POSSIBLE";
            case 2:
                return "IS_POSSIBLE_LOCAL_ONLY";
            case 3:
                return "INVALID_COUNTRY_CODE";
            case 4:
                return "TOO_SHORT";
            case 5:
                return "INVALID_LENGTH";
            case 6:
                return "TOO_LONG";
            default:
                return "null";
        }
    }

    public static /* synthetic */ Object aB(byte[] bArr) {
        return (aplg) apag.parseFrom(aplg.a, bArr);
    }

    public static /* synthetic */ Object aC(Object obj) {
        syc sycVar = (syc) obj;
        sycVar.T(2, 11);
        return sycVar;
    }

    public static /* synthetic */ int aD(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 5) {
            return 0;
        }
        return 6;
    }

    public static /* synthetic */ Object aE(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        aozy createBuilder = wbj.a.createBuilder();
        String str = (String) entry.getKey();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbj wbjVar = (wbj) createBuilder.b;
        str.getClass();
        wbjVar.b |= 1;
        wbjVar.c = str;
        String str2 = (String) entry.getValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbj wbjVar2 = (wbj) createBuilder.b;
        str2.getClass();
        wbjVar2.b |= 2;
        wbjVar2.d = str2;
        return (wbj) createBuilder.s();
    }

    public static /* synthetic */ int aF(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aG(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ Object aH(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        }
        return arnb.a;
    }

    public static /* synthetic */ int[] aI() {
        return new int[]{1, 2};
    }

    public static /* synthetic */ int aJ(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aK(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aL(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aM(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static /* synthetic */ Collection aN() {
        String str = "Inverse On Surface";
        String str2 = "fl";
        String str3 = "Surface Variant";
        return aqjn.B(new apvu(aqjn.B("a", "a", "b"), str, str2), new apvu(aqjn.B("a", "b", "b"), str3, str2), new apvu(aqjn.B("a", "c", "b"), str, str2), new apvu(aqjn.B("a", "d", "b"), str3, str2), new apvu(aqjn.B("b", "a", "b"), str, str2), new apvu(aqjn.B("b", "b", "b"), str3, str2), new apvu(aqjn.B("b", "c", "b"), str, str2), new apvu(aqjn.B("b", "d", "b"), str3, str2), new apvu(aqjn.B("c", "a", "b"), str, str2), new apvu(aqjn.B("c", "b", "b"), str3, str2), new apvu(aqjn.B("c", "c", "b"), str, str2), new apvu(aqjn.B("c", "d", "b"), str3, str2), new apvu(aqjn.B("d", "a", "b"), str, str2), new apvu(aqjn.B("d", "b", "b"), str3, str2), new apvu(aqjn.B("d", "c", "b"), str, str2), new apvu(aqjn.B("d", "d", "b"), str3, str2), new apvu(aqjn.B("e", "a", "b"), str, str2), new apvu(aqjn.B("e", "b", "b"), str3, str2), new apvu(aqjn.B("e", "c", "b"), str, str2), new apvu(aqjn.B("e", "d", "b"), str3, str2));
    }

    public static /* synthetic */ int aO(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aP(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aQ(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aR(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void aS(int i) {
        if (i != 0) {
        } else {
            throw null;
        }
    }

    public static /* synthetic */ int aT(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            return 4;
        }
        return 3;
    }

    public static /* synthetic */ int aU(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            if (i != 5) {
                return 0;
            }
            return 7;
        }
        return 6;
    }

    public static /* synthetic */ boolean aW(int i) {
        if (R(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean aX(int i) {
        if (ae(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean aY(int i) {
        if (Y(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object aZ(Object obj) {
        String str;
        atkn atknVar = (atkn) obj;
        String obj2 = atknVar.b.toString();
        if (true != atknVar.a) {
            str = " DESC";
        } else {
            str = " ASC";
        }
        return obj2.concat(str);
    }

    public static /* synthetic */ int aa(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0;
            }
            return 3;
        }
        return 2;
    }

    public static /* synthetic */ int ab(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return 0;
        }
        return 2;
    }

    public static /* synthetic */ int[] ac() {
        return new int[]{1, 2, 3};
    }

    public static /* synthetic */ boolean ad(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int ae(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int af(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int ag(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aj(int i) {
        return i - 2;
    }

    public static /* synthetic */ int ak(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int al(int i) {
        return i - 2;
    }

    public static /* synthetic */ int am(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int an(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int ao(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int ap(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int aq(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int ar(int i) {
        return i - 2;
    }

    public static /* synthetic */ int as(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int at(int i) {
        return i - 2;
    }

    public static /* synthetic */ int au(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int av(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ void aw(Object obj, Object obj2) {
        aozy aozyVar = (aozy) obj;
        amsm amsmVar = (amsm) obj2;
        aozyVar.getClass();
        amsmVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ames amesVar = (ames) aozyVar.b;
        ames amesVar2 = ames.a;
        amesVar.c = amsmVar;
        amesVar.b = 7;
    }

    public static /* synthetic */ Object ax(Object obj) {
        dho dhoVar = (dho) obj;
        dhoVar.getClass();
        dhn dhnVar = dhi.a;
        artm artmVar = dhm.a[0];
        dhnVar.a(dhoVar, true);
        return arnb.a;
    }

    public static /* synthetic */ String b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "null";
                        }
                        return "TOO_LONG";
                    }
                    return "TOO_SHORT_NSN";
                }
                return "TOO_SHORT_AFTER_IDD";
            }
            return "NOT_A_NUMBER";
        }
        return "INVALID_COUNTRY_CODE";
    }

    public static /* synthetic */ boolean bA(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bB(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bC(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean bD(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean bE(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object bF(Object obj) {
        return arnb.a;
    }

    public static /* synthetic */ long bG(zw zwVar) {
        float f = zwVar.a;
        float f2 = zwVar.b;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final void bH(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void bI(String str) {
        throw new IllegalStateException(str);
    }

    public static final void bJ(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void bK(String str) {
        throw new NoSuchElementException(str);
    }

    public static final int bL(to toVar, int i) {
        try {
            return vp.a(toVar.a, toVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int bM(to toVar, Object obj, int i) {
        int i2 = toVar.c;
        if (i2 == 0) {
            return -1;
        }
        int bL = bL(toVar, i);
        if (bL < 0) {
            return bL;
        }
        if (d.F(obj, toVar.b[bL])) {
            return bL;
        }
        int i3 = bL + 1;
        while (i3 < i2 && toVar.a[i3] == i) {
            if (d.F(obj, toVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = bL - 1; i4 >= 0 && toVar.a[i4] == i; i4--) {
            if (d.F(obj, toVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static final int bN(to toVar) {
        return bM(toVar, null, 0);
    }

    public static final void bO(to toVar, int i) {
        toVar.a = new int[i];
        toVar.b = new Object[i];
    }

    public static final float bP(ejf ejfVar) {
        return ((te) ejfVar.a).b;
    }

    public static final float bQ(ejf ejfVar) {
        return ((te) ejfVar.a).a;
    }

    public static final void bR(ejf ejfVar) {
        if (!ejfVar.c()) {
            ejfVar.a(0, 0, 0, 0);
            return;
        }
        float bP = bP(ejfVar);
        float bQ = bQ(ejfVar);
        int ceil = (int) Math.ceil(tf.a(bP, bQ, ejfVar.b()));
        int ceil2 = (int) Math.ceil(tf.b(bP, bQ, ejfVar.b()));
        ejfVar.a(ceil, ceil2, ceil, ceil2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bS(boolean z, arqg arqgVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        bwj c = bwjVar.c(-361453782);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (true != c.H(z)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(arqgVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c.L()) {
            c.v();
            z3 = z;
        } else {
            boolean z5 = (z ? 1 : 0) | i2;
            if (1 != z5) {
                z2 = false;
            } else {
                z2 = true;
            }
            cas a = cap.a(arqgVar, c);
            c.z(-41177256);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new rq(z2, a);
                bwkVar.ad(T);
            }
            rq rqVar = (rq) T;
            bwkVar.Y();
            c.z(-41168687);
            boolean G = c.G(rqVar) | c.H(z2);
            Object T2 = bwkVar.T();
            if (G || T2 == bwj.a.a) {
                T2 = new jmp(rqVar, z2, 1);
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            bxl.h((arqg) T2, c);
            int i6 = rr.a;
            ro a2 = rr.a(c);
            if (a2 != null) {
                rm c2 = a2.c();
                enm enmVar = (enm) c.g(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                c.z(-41153386);
                boolean G2 = c.G(c2) | c.G(enmVar) | c.G(rqVar);
                Object T3 = bwkVar.T();
                if (G2 || T3 == bwj.a.a) {
                    T3 = new eiw(c2, enmVar, rqVar, 1);
                    bwkVar.ad(T3);
                }
                bwkVar.Y();
                bxl.b(enmVar, c2, (arqr) T3, c);
                z3 = z5;
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        }
        bzz e = c.e();
        if (e != null) {
            if (true != z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            ((bzf) e).d = new lil(z4, arqgVar, i, i2, 1);
        }
    }

    public static final void bT(View view, ro roVar) {
        view.getClass();
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, roVar);
    }

    public static /* synthetic */ String bU(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String bV(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String bW(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String bX(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String bY(Object obj, Object obj2, String str, String str2) {
        return str + obj2.toString() + str2 + obj.toString();
    }

    public static /* synthetic */ String bZ(String str, String str2, String str3, String str4, String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ boolean bb(int i) {
        if (aD(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bc(int i) {
        if (X(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int bd(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ boolean be(int i) {
        if (U(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bf(int i) {
        if (ag(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bg(int i) {
        if (aJ(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bh(int i) {
        if (ab(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bi(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ boolean bj(int i) {
        if (aO(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bk(int i) {
        if (aG(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bl(int i) {
        if (aQ(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void bm(int i) {
        if (i != 0) {
        } else {
            throw null;
        }
    }

    public static /* synthetic */ void bn(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            e(parcel, (Parcelable) list.get(i), 0);
        }
    }

    public static boolean bo(int i) {
        if (i != 13 && i != 14) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ agcp bp() {
        return d.P().W();
    }

    public static final int br(int i) {
        if (i != 0) {
            if (i == 4) {
                return 4;
            }
            if (i == 8) {
                return 3;
            }
            throw new IllegalArgumentException(bV(i, "Unknown visibility "));
        }
        return 2;
    }

    public static final int bs(View view) {
        if (view.getAlpha() == brg.a && view.getVisibility() == 0) {
            return 4;
        }
        return br(view.getVisibility());
    }

    public static /* synthetic */ String bt(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "REMOVING";
            }
            return "ADDING";
        }
        return "NONE";
    }

    public static final dv bu(ViewGroup viewGroup, a aVar) {
        aVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof dv) {
            return (dv) tag;
        }
        dv dvVar = new dv(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, dvVar);
        return dvVar;
    }

    public static /* synthetic */ long bv(long j, cjp cjpVar) {
        float intBitsToFloat;
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i);
        float f = cjpVar.b;
        if (intBitsToFloat2 >= f) {
            if (Float.intBitsToFloat(i) > cjpVar.d) {
                f = cjpVar.d;
            } else {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) < cjpVar.c) {
            intBitsToFloat = cjpVar.c;
        } else {
            if (Float.intBitsToFloat(i2) > cjpVar.e) {
                intBitsToFloat = cjpVar.e;
            } else {
                intBitsToFloat = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
    }

    public static /* synthetic */ boolean bw(int i) {
        if (!bA(i, 2) && !bA(i, 4) && !bA(i, 5)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void bx(CursorAnchorInfo.Builder builder, diy diyVar, cjp cjpVar) {
        boolean z;
        int h;
        int h2;
        boolean z2 = false;
        if (cjpVar.b >= cjpVar.d) {
            z = true;
        } else {
            z = false;
        }
        float f = cjpVar.c;
        if (f >= cjpVar.e) {
            z2 = true;
        }
        if ((z || z2) || (h = diyVar.h(f)) > (h2 = diyVar.h(cjpVar.e))) {
            return;
        }
        while (true) {
            a$$ExternalSyntheticApiModelOutline0.m(builder, diyVar.b(h), diyVar.d(h), diyVar.c(h), diyVar.a(h));
            if (h != h2) {
                h++;
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ Boolean by() {
        return true;
    }

    public static /* synthetic */ Boolean bz() {
        return false;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 2:
                return GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT;
            case 3:
                return "TOP";
            case 4:
                return GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT;
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    public static /* synthetic */ String ca(int i, String str, SparseIntArray sparseIntArray) {
        return str + Integer.toHexString(i) + "   " + sparseIntArray.get(i);
    }

    public static /* synthetic */ String cb(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String cc(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String cd(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String ce(Object obj, Object obj2, String str, String str2, String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ String cf(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String cg(String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ String ch(Object obj, String str) {
        return str + obj;
    }

    public static /* synthetic */ String ci(Object obj, String str, String str2, String str3) {
        return str2 + str + str3 + obj;
    }

    public static /* synthetic */ String ck(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String cl(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ String cm(StringBuilder sb, String str, int i, String str2, int i2, cbb cbbVar) {
        sb.append("Error while pushing ");
        sb.append(cbbVar);
        sb.append(". Not all arguments were provided. Missing ");
        sb.append(i2);
        sb.append(" int arguments (");
        sb.append(str2);
        sb.append(") and ");
        sb.append(i);
        sb.append(" object arguments (");
        sb.append(str);
        sb.append(").");
        return sb.toString();
    }

    public static /* synthetic */ String cn(long j, String str, String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ String co(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String cp(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String cq(int i, String str) {
        return i + str;
    }

    public static /* synthetic */ String cr(Object obj, String str) {
        return str + String.valueOf(obj);
    }

    public static /* synthetic */ String cs(long j, long j2, String str, String str2) {
        return str + j2 + str2 + j;
    }

    public static /* synthetic */ String ct(Object obj, Object obj2, String str, String str2) {
        return str + String.valueOf(obj2) + str2 + String.valueOf(obj);
    }

    public static /* synthetic */ Object d(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static /* synthetic */ void e(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
    }

    public static /* synthetic */ void f(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }

    public static /* synthetic */ void g() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean h() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean i() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object j() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object k() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object l() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object m() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object n() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void o() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void p() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void q() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void r() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean s() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ PorterDuff.Mode u(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static /* synthetic */ int v(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static /* synthetic */ View w(View view) {
        view.getClass();
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static /* synthetic */ List x(cas casVar) {
        return (List) casVar.a();
    }

    public static /* synthetic */ boolean y() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ long z(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ int aV(int i) {
        return i;
    }
}
