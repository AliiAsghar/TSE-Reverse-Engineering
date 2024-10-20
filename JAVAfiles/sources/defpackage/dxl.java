package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxl {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray b;
    private static final SparseIntArray c;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        c = sparseIntArray2;
        int[] iArr = dxp.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxl.i(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(dxc dxcVar, String str) {
        int i;
        int i2 = -1;
        float f = Float.NaN;
        if (str != null) {
            int indexOf = str.indexOf(44);
            int length = str.length();
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                }
                int i4 = i3;
                i3 = indexOf + 1;
                i = i4;
            } else {
                i = -1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i3, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > brg.a && parseFloat2 > brg.a) {
                        f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                i2 = i;
            } else {
                String substring4 = str.substring(i3);
                if (substring4.length() > 0) {
                    f = Float.parseFloat(substring4);
                }
                i2 = i;
            }
            i2 = i;
        }
        dxcVar.I = str;
        dxcVar.J = f;
        dxcVar.K = i2;
    }

    private static void l(dxg dxgVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        dxf dxfVar = new dxf();
        dxgVar.g = dxfVar;
        dxgVar.c.b = false;
        dxgVar.d.c = false;
        dxgVar.b.a = false;
        dxgVar.e.b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (c.get(index)) {
                case 2:
                    dxfVar.b(2, typedArray.getDimensionPixelSize(index, dxgVar.d.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                case 30:
                case 32:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", a.ca(index, "Unknown attribute 0x", b));
                    break;
                case 5:
                    dxfVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    dxfVar.b(6, typedArray.getDimensionPixelOffset(index, dxgVar.d.E));
                    break;
                case 7:
                    dxfVar.b(7, typedArray.getDimensionPixelOffset(index, dxgVar.d.F));
                    break;
                case 8:
                    dxfVar.b(8, typedArray.getDimensionPixelSize(index, dxgVar.d.L));
                    break;
                case 11:
                    dxfVar.b(11, typedArray.getDimensionPixelSize(index, dxgVar.d.R));
                    break;
                case 12:
                    dxfVar.b(12, typedArray.getDimensionPixelSize(index, dxgVar.d.S));
                    break;
                case 13:
                    dxfVar.b(13, typedArray.getDimensionPixelSize(index, dxgVar.d.O));
                    break;
                case 14:
                    dxfVar.b(14, typedArray.getDimensionPixelSize(index, dxgVar.d.Q));
                    break;
                case 15:
                    dxfVar.b(15, typedArray.getDimensionPixelSize(index, dxgVar.d.T));
                    break;
                case 16:
                    dxfVar.b(16, typedArray.getDimensionPixelSize(index, dxgVar.d.P));
                    break;
                case 17:
                    dxfVar.b(17, typedArray.getDimensionPixelOffset(index, dxgVar.d.f));
                    break;
                case 18:
                    dxfVar.b(18, typedArray.getDimensionPixelOffset(index, dxgVar.d.g));
                    break;
                case 19:
                    dxfVar.a(19, typedArray.getFloat(index, dxgVar.d.h));
                    break;
                case 20:
                    dxfVar.a(20, typedArray.getFloat(index, dxgVar.d.y));
                    break;
                case 21:
                    dxfVar.b(21, typedArray.getLayoutDimension(index, dxgVar.d.e));
                    break;
                case 22:
                    dxfVar.b(22, a[typedArray.getInt(index, dxgVar.b.b)]);
                    break;
                case 23:
                    dxfVar.b(23, typedArray.getLayoutDimension(index, dxgVar.d.d));
                    break;
                case 24:
                    dxfVar.b(24, typedArray.getDimensionPixelSize(index, dxgVar.d.H));
                    break;
                case 27:
                    dxfVar.b(27, typedArray.getInt(index, dxgVar.d.G));
                    break;
                case 28:
                    dxfVar.b(28, typedArray.getDimensionPixelSize(index, dxgVar.d.I));
                    break;
                case 31:
                    dxfVar.b(31, typedArray.getDimensionPixelSize(index, dxgVar.d.M));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                    dxfVar.b(34, typedArray.getDimensionPixelSize(index, dxgVar.d.J));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                    dxfVar.a(37, typedArray.getFloat(index, dxgVar.d.z));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                    int resourceId = typedArray.getResourceId(index, dxgVar.a);
                    dxgVar.a = resourceId;
                    dxfVar.b(38, resourceId);
                    break;
                case 39:
                    dxfVar.a(39, typedArray.getFloat(index, dxgVar.d.W));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                    dxfVar.a(40, typedArray.getFloat(index, dxgVar.d.V));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                    dxfVar.b(41, typedArray.getInt(index, dxgVar.d.X));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                    dxfVar.b(42, typedArray.getInt(index, dxgVar.d.Y));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                    dxfVar.a(43, typedArray.getFloat(index, dxgVar.b.d));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                    dxfVar.d(44, true);
                    dxfVar.a(44, typedArray.getDimension(index, dxgVar.e.o));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                    dxfVar.a(45, typedArray.getFloat(index, dxgVar.e.d));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                    dxfVar.a(46, typedArray.getFloat(index, dxgVar.e.e));
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                    dxfVar.a(47, typedArray.getFloat(index, dxgVar.e.f));
                    break;
                case 48:
                    dxfVar.a(48, typedArray.getFloat(index, dxgVar.e.g));
                    break;
                case 49:
                    dxfVar.a(49, typedArray.getDimension(index, dxgVar.e.h));
                    break;
                case 50:
                    dxfVar.a(50, typedArray.getDimension(index, dxgVar.e.i));
                    break;
                case 51:
                    dxfVar.a(51, typedArray.getDimension(index, dxgVar.e.k));
                    break;
                case 52:
                    dxfVar.a(52, typedArray.getDimension(index, dxgVar.e.l));
                    break;
                case 53:
                    dxfVar.a(53, typedArray.getDimension(index, dxgVar.e.m));
                    break;
                case 54:
                    dxfVar.b(54, typedArray.getInt(index, dxgVar.d.Z));
                    break;
                case 55:
                    dxfVar.b(55, typedArray.getInt(index, dxgVar.d.aa));
                    break;
                case 56:
                    dxfVar.b(56, typedArray.getDimensionPixelSize(index, dxgVar.d.ab));
                    break;
                case 57:
                    dxfVar.b(57, typedArray.getDimensionPixelSize(index, dxgVar.d.ac));
                    break;
                case 58:
                    dxfVar.b(58, typedArray.getDimensionPixelSize(index, dxgVar.d.ad));
                    break;
                case 59:
                    dxfVar.b(59, typedArray.getDimensionPixelSize(index, dxgVar.d.ae));
                    break;
                case 60:
                    dxfVar.a(60, typedArray.getFloat(index, dxgVar.e.c));
                    break;
                case 62:
                    dxfVar.b(62, typedArray.getDimensionPixelSize(index, dxgVar.d.C));
                    break;
                case 63:
                    dxfVar.a(63, typedArray.getFloat(index, dxgVar.d.D));
                    break;
                case 64:
                    dxfVar.b(64, a(typedArray, index, dxgVar.c.c));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        dxfVar.c(65, typedArray.getString(index));
                        break;
                    } else {
                        dxfVar.c(65, dus.a[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    dxfVar.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    dxfVar.a(67, typedArray.getFloat(index, dxgVar.c.j));
                    break;
                case 68:
                    dxfVar.a(68, typedArray.getFloat(index, dxgVar.b.e));
                    break;
                case 69:
                    dxfVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    dxfVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    dxfVar.b(72, typedArray.getInt(index, dxgVar.d.ah));
                    break;
                case 73:
                    dxfVar.b(73, typedArray.getDimensionPixelSize(index, dxgVar.d.ai));
                    break;
                case 74:
                    dxfVar.c(74, typedArray.getString(index));
                    break;
                case 75:
                    dxfVar.d(75, typedArray.getBoolean(index, dxgVar.d.ap));
                    break;
                case 76:
                    dxfVar.b(76, typedArray.getInt(index, dxgVar.c.f));
                    break;
                case 77:
                    dxfVar.c(77, typedArray.getString(index));
                    break;
                case 78:
                    dxfVar.b(78, typedArray.getInt(index, dxgVar.b.c));
                    break;
                case 79:
                    dxfVar.a(79, typedArray.getFloat(index, dxgVar.c.h));
                    break;
                case 80:
                    dxfVar.d(80, typedArray.getBoolean(index, dxgVar.d.an));
                    break;
                case 81:
                    dxfVar.d(81, typedArray.getBoolean(index, dxgVar.d.ao));
                    break;
                case 82:
                    dxfVar.b(82, typedArray.getInteger(index, dxgVar.c.d));
                    break;
                case 83:
                    dxfVar.b(83, a(typedArray, index, dxgVar.e.j));
                    break;
                case 84:
                    dxfVar.b(84, typedArray.getInteger(index, dxgVar.c.l));
                    break;
                case 85:
                    dxfVar.a(85, typedArray.getFloat(index, dxgVar.c.k));
                    break;
                case 86:
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        dxgVar.c.o = typedArray.getResourceId(index, -1);
                        dxfVar.b(89, dxgVar.c.o);
                        dxi dxiVar = dxgVar.c;
                        if (dxiVar.o != -1) {
                            dxiVar.n = -2;
                            dxfVar.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (peekValue.type == 3) {
                        dxgVar.c.m = typedArray.getString(index);
                        dxfVar.c(90, dxgVar.c.m);
                        if (dxgVar.c.m.indexOf("/") > 0) {
                            dxgVar.c.o = typedArray.getResourceId(index, -1);
                            dxfVar.b(89, dxgVar.c.o);
                            dxgVar.c.n = -2;
                            dxfVar.b(88, -2);
                            break;
                        } else {
                            dxgVar.c.n = -1;
                            dxfVar.b(88, -1);
                            break;
                        }
                    } else {
                        dxi dxiVar2 = dxgVar.c;
                        dxiVar2.n = typedArray.getInteger(index, dxiVar2.o);
                        dxfVar.b(88, dxgVar.c.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", a.ca(index, "unused attribute 0x", b));
                    break;
                case 93:
                    dxfVar.b(93, typedArray.getDimensionPixelSize(index, dxgVar.d.N));
                    break;
                case 94:
                    dxfVar.b(94, typedArray.getDimensionPixelSize(index, dxgVar.d.U));
                    break;
                case 95:
                    i(dxfVar, typedArray, index, 0);
                    break;
                case 96:
                    i(dxfVar, typedArray, index, 1);
                    break;
                case 97:
                    dxfVar.b(97, typedArray.getInt(index, dxgVar.d.aq));
                    break;
                case 98:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        break;
                    } else {
                        dxgVar.a = typedArray.getResourceId(index, dxgVar.a);
                        break;
                    }
                case 99:
                    dxfVar.d(99, typedArray.getBoolean(index, dxgVar.d.i));
                    break;
            }
        }
    }

    private static final int[] m(View view, String str) {
        int length;
        int i;
        Object d;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = split.length;
            if (i2 >= length) {
                break;
            }
            String trim = split[i2].trim();
            try {
                i = dxo.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0) {
                if (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (d = ((ConstraintLayout) view.getParent()).d(trim)) != null && (d instanceof Integer)) {
                    i = ((Integer) d).intValue();
                } else {
                    i = 0;
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    private static final dxg n(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        dxg dxgVar = new dxg();
        if (z) {
            iArr = dxp.c;
        } else {
            iArr = dxp.a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z) {
            l(dxgVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    dxgVar.c.b = true;
                    dxgVar.d.c = true;
                    dxgVar.b.a = true;
                    dxgVar.e.b = true;
                }
                SparseIntArray sparseIntArray = b;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        dxh dxhVar = dxgVar.d;
                        dxhVar.r = a(obtainStyledAttributes, index, dxhVar.r);
                        break;
                    case 2:
                        dxh dxhVar2 = dxgVar.d;
                        dxhVar2.K = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar2.K);
                        break;
                    case 3:
                        dxh dxhVar3 = dxgVar.d;
                        dxhVar3.q = a(obtainStyledAttributes, index, dxhVar3.q);
                        break;
                    case 4:
                        dxh dxhVar4 = dxgVar.d;
                        dxhVar4.p = a(obtainStyledAttributes, index, dxhVar4.p);
                        break;
                    case 5:
                        dxgVar.d.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        dxh dxhVar5 = dxgVar.d;
                        dxhVar5.E = obtainStyledAttributes.getDimensionPixelOffset(index, dxhVar5.E);
                        break;
                    case 7:
                        dxh dxhVar6 = dxgVar.d;
                        dxhVar6.F = obtainStyledAttributes.getDimensionPixelOffset(index, dxhVar6.F);
                        break;
                    case 8:
                        dxh dxhVar7 = dxgVar.d;
                        dxhVar7.L = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar7.L);
                        break;
                    case 9:
                        dxh dxhVar8 = dxgVar.d;
                        dxhVar8.x = a(obtainStyledAttributes, index, dxhVar8.x);
                        break;
                    case 10:
                        dxh dxhVar9 = dxgVar.d;
                        dxhVar9.w = a(obtainStyledAttributes, index, dxhVar9.w);
                        break;
                    case 11:
                        dxh dxhVar10 = dxgVar.d;
                        dxhVar10.R = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar10.R);
                        break;
                    case 12:
                        dxh dxhVar11 = dxgVar.d;
                        dxhVar11.S = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar11.S);
                        break;
                    case 13:
                        dxh dxhVar12 = dxgVar.d;
                        dxhVar12.O = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar12.O);
                        break;
                    case 14:
                        dxh dxhVar13 = dxgVar.d;
                        dxhVar13.Q = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar13.Q);
                        break;
                    case 15:
                        dxh dxhVar14 = dxgVar.d;
                        dxhVar14.T = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar14.T);
                        break;
                    case 16:
                        dxh dxhVar15 = dxgVar.d;
                        dxhVar15.P = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar15.P);
                        break;
                    case 17:
                        dxh dxhVar16 = dxgVar.d;
                        dxhVar16.f = obtainStyledAttributes.getDimensionPixelOffset(index, dxhVar16.f);
                        break;
                    case 18:
                        dxh dxhVar17 = dxgVar.d;
                        dxhVar17.g = obtainStyledAttributes.getDimensionPixelOffset(index, dxhVar17.g);
                        break;
                    case 19:
                        dxh dxhVar18 = dxgVar.d;
                        dxhVar18.h = obtainStyledAttributes.getFloat(index, dxhVar18.h);
                        break;
                    case 20:
                        dxh dxhVar19 = dxgVar.d;
                        dxhVar19.y = obtainStyledAttributes.getFloat(index, dxhVar19.y);
                        break;
                    case 21:
                        dxh dxhVar20 = dxgVar.d;
                        dxhVar20.e = obtainStyledAttributes.getLayoutDimension(index, dxhVar20.e);
                        break;
                    case 22:
                        dxj dxjVar = dxgVar.b;
                        dxjVar.b = obtainStyledAttributes.getInt(index, dxjVar.b);
                        dxj dxjVar2 = dxgVar.b;
                        dxjVar2.b = a[dxjVar2.b];
                        break;
                    case 23:
                        dxh dxhVar21 = dxgVar.d;
                        dxhVar21.d = obtainStyledAttributes.getLayoutDimension(index, dxhVar21.d);
                        break;
                    case 24:
                        dxh dxhVar22 = dxgVar.d;
                        dxhVar22.H = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar22.H);
                        break;
                    case 25:
                        dxh dxhVar23 = dxgVar.d;
                        dxhVar23.j = a(obtainStyledAttributes, index, dxhVar23.j);
                        break;
                    case 26:
                        dxh dxhVar24 = dxgVar.d;
                        dxhVar24.k = a(obtainStyledAttributes, index, dxhVar24.k);
                        break;
                    case 27:
                        dxh dxhVar25 = dxgVar.d;
                        dxhVar25.G = obtainStyledAttributes.getInt(index, dxhVar25.G);
                        break;
                    case 28:
                        dxh dxhVar26 = dxgVar.d;
                        dxhVar26.I = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar26.I);
                        break;
                    case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                        dxh dxhVar27 = dxgVar.d;
                        dxhVar27.l = a(obtainStyledAttributes, index, dxhVar27.l);
                        break;
                    case 30:
                        dxh dxhVar28 = dxgVar.d;
                        dxhVar28.m = a(obtainStyledAttributes, index, dxhVar28.m);
                        break;
                    case 31:
                        dxh dxhVar29 = dxgVar.d;
                        dxhVar29.M = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar29.M);
                        break;
                    case 32:
                        dxh dxhVar30 = dxgVar.d;
                        dxhVar30.u = a(obtainStyledAttributes, index, dxhVar30.u);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                        dxh dxhVar31 = dxgVar.d;
                        dxhVar31.v = a(obtainStyledAttributes, index, dxhVar31.v);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                        dxh dxhVar32 = dxgVar.d;
                        dxhVar32.J = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar32.J);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                        dxh dxhVar33 = dxgVar.d;
                        dxhVar33.o = a(obtainStyledAttributes, index, dxhVar33.o);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                        dxh dxhVar34 = dxgVar.d;
                        dxhVar34.n = a(obtainStyledAttributes, index, dxhVar34.n);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                        dxh dxhVar35 = dxgVar.d;
                        dxhVar35.z = obtainStyledAttributes.getFloat(index, dxhVar35.z);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                        dxgVar.a = obtainStyledAttributes.getResourceId(index, dxgVar.a);
                        break;
                    case 39:
                        dxh dxhVar36 = dxgVar.d;
                        dxhVar36.W = obtainStyledAttributes.getFloat(index, dxhVar36.W);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                        dxh dxhVar37 = dxgVar.d;
                        dxhVar37.V = obtainStyledAttributes.getFloat(index, dxhVar37.V);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                        dxh dxhVar38 = dxgVar.d;
                        dxhVar38.X = obtainStyledAttributes.getInt(index, dxhVar38.X);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                        dxh dxhVar39 = dxgVar.d;
                        dxhVar39.Y = obtainStyledAttributes.getInt(index, dxhVar39.Y);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                        dxj dxjVar3 = dxgVar.b;
                        dxjVar3.d = obtainStyledAttributes.getFloat(index, dxjVar3.d);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                        dxk dxkVar = dxgVar.e;
                        dxkVar.n = true;
                        dxkVar.o = obtainStyledAttributes.getDimension(index, dxkVar.o);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                        dxk dxkVar2 = dxgVar.e;
                        dxkVar2.d = obtainStyledAttributes.getFloat(index, dxkVar2.d);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                        dxk dxkVar3 = dxgVar.e;
                        dxkVar3.e = obtainStyledAttributes.getFloat(index, dxkVar3.e);
                        break;
                    case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                        dxk dxkVar4 = dxgVar.e;
                        dxkVar4.f = obtainStyledAttributes.getFloat(index, dxkVar4.f);
                        break;
                    case 48:
                        dxk dxkVar5 = dxgVar.e;
                        dxkVar5.g = obtainStyledAttributes.getFloat(index, dxkVar5.g);
                        break;
                    case 49:
                        dxk dxkVar6 = dxgVar.e;
                        dxkVar6.h = obtainStyledAttributes.getDimension(index, dxkVar6.h);
                        break;
                    case 50:
                        dxk dxkVar7 = dxgVar.e;
                        dxkVar7.i = obtainStyledAttributes.getDimension(index, dxkVar7.i);
                        break;
                    case 51:
                        dxk dxkVar8 = dxgVar.e;
                        dxkVar8.k = obtainStyledAttributes.getDimension(index, dxkVar8.k);
                        break;
                    case 52:
                        dxk dxkVar9 = dxgVar.e;
                        dxkVar9.l = obtainStyledAttributes.getDimension(index, dxkVar9.l);
                        break;
                    case 53:
                        dxk dxkVar10 = dxgVar.e;
                        dxkVar10.m = obtainStyledAttributes.getDimension(index, dxkVar10.m);
                        break;
                    case 54:
                        dxh dxhVar40 = dxgVar.d;
                        dxhVar40.Z = obtainStyledAttributes.getInt(index, dxhVar40.Z);
                        break;
                    case 55:
                        dxh dxhVar41 = dxgVar.d;
                        dxhVar41.aa = obtainStyledAttributes.getInt(index, dxhVar41.aa);
                        break;
                    case 56:
                        dxh dxhVar42 = dxgVar.d;
                        dxhVar42.ab = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar42.ab);
                        break;
                    case 57:
                        dxh dxhVar43 = dxgVar.d;
                        dxhVar43.ac = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar43.ac);
                        break;
                    case 58:
                        dxh dxhVar44 = dxgVar.d;
                        dxhVar44.ad = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar44.ad);
                        break;
                    case 59:
                        dxh dxhVar45 = dxgVar.d;
                        dxhVar45.ae = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar45.ae);
                        break;
                    case 60:
                        dxk dxkVar11 = dxgVar.e;
                        dxkVar11.c = obtainStyledAttributes.getFloat(index, dxkVar11.c);
                        break;
                    case 61:
                        dxh dxhVar46 = dxgVar.d;
                        dxhVar46.B = a(obtainStyledAttributes, index, dxhVar46.B);
                        break;
                    case 62:
                        dxh dxhVar47 = dxgVar.d;
                        dxhVar47.C = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar47.C);
                        break;
                    case 63:
                        dxh dxhVar48 = dxgVar.d;
                        dxhVar48.D = obtainStyledAttributes.getFloat(index, dxhVar48.D);
                        break;
                    case 64:
                        dxi dxiVar = dxgVar.c;
                        dxiVar.c = a(obtainStyledAttributes, index, dxiVar.c);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            dxgVar.c.e = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            dxgVar.c.e = dus.a[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        dxgVar.c.g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        dxi dxiVar2 = dxgVar.c;
                        dxiVar2.j = obtainStyledAttributes.getFloat(index, dxiVar2.j);
                        break;
                    case 68:
                        dxj dxjVar4 = dxgVar.b;
                        dxjVar4.e = obtainStyledAttributes.getFloat(index, dxjVar4.e);
                        break;
                    case 69:
                        dxgVar.d.af = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        dxgVar.d.ag = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        dxh dxhVar49 = dxgVar.d;
                        dxhVar49.ah = obtainStyledAttributes.getInt(index, dxhVar49.ah);
                        break;
                    case 73:
                        dxh dxhVar50 = dxgVar.d;
                        dxhVar50.ai = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar50.ai);
                        break;
                    case 74:
                        dxgVar.d.al = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        dxh dxhVar51 = dxgVar.d;
                        dxhVar51.ap = obtainStyledAttributes.getBoolean(index, dxhVar51.ap);
                        break;
                    case 76:
                        dxi dxiVar3 = dxgVar.c;
                        dxiVar3.f = obtainStyledAttributes.getInt(index, dxiVar3.f);
                        break;
                    case 77:
                        dxgVar.d.am = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        dxj dxjVar5 = dxgVar.b;
                        dxjVar5.c = obtainStyledAttributes.getInt(index, dxjVar5.c);
                        break;
                    case 79:
                        dxi dxiVar4 = dxgVar.c;
                        dxiVar4.h = obtainStyledAttributes.getFloat(index, dxiVar4.h);
                        break;
                    case 80:
                        dxh dxhVar52 = dxgVar.d;
                        dxhVar52.an = obtainStyledAttributes.getBoolean(index, dxhVar52.an);
                        break;
                    case 81:
                        dxh dxhVar53 = dxgVar.d;
                        dxhVar53.ao = obtainStyledAttributes.getBoolean(index, dxhVar53.ao);
                        break;
                    case 82:
                        dxi dxiVar5 = dxgVar.c;
                        dxiVar5.d = obtainStyledAttributes.getInteger(index, dxiVar5.d);
                        break;
                    case 83:
                        dxk dxkVar12 = dxgVar.e;
                        dxkVar12.j = a(obtainStyledAttributes, index, dxkVar12.j);
                        break;
                    case 84:
                        dxi dxiVar6 = dxgVar.c;
                        dxiVar6.l = obtainStyledAttributes.getInteger(index, dxiVar6.l);
                        break;
                    case 85:
                        dxi dxiVar7 = dxgVar.c;
                        dxiVar7.k = obtainStyledAttributes.getFloat(index, dxiVar7.k);
                        break;
                    case 86:
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type == 1) {
                            dxgVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                            dxi dxiVar8 = dxgVar.c;
                            if (dxiVar8.o != -1) {
                                dxiVar8.n = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (peekValue.type == 3) {
                            dxgVar.c.m = obtainStyledAttributes.getString(index);
                            if (dxgVar.c.m.indexOf("/") > 0) {
                                dxgVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                                dxgVar.c.n = -2;
                                break;
                            } else {
                                dxgVar.c.n = -1;
                                break;
                            }
                        } else {
                            dxi dxiVar9 = dxgVar.c;
                            dxiVar9.n = obtainStyledAttributes.getInteger(index, dxiVar9.o);
                            break;
                        }
                    case 87:
                        Log.w("ConstraintSet", a.ca(index, "unused attribute 0x", sparseIntArray));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Log.w("ConstraintSet", a.ca(index, "Unknown attribute 0x", sparseIntArray));
                        break;
                    case 91:
                        dxh dxhVar54 = dxgVar.d;
                        dxhVar54.s = a(obtainStyledAttributes, index, dxhVar54.s);
                        break;
                    case 92:
                        dxh dxhVar55 = dxgVar.d;
                        dxhVar55.t = a(obtainStyledAttributes, index, dxhVar55.t);
                        break;
                    case 93:
                        dxh dxhVar56 = dxgVar.d;
                        dxhVar56.N = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar56.N);
                        break;
                    case 94:
                        dxh dxhVar57 = dxgVar.d;
                        dxhVar57.U = obtainStyledAttributes.getDimensionPixelSize(index, dxhVar57.U);
                        break;
                    case 95:
                        i(dxgVar.d, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i(dxgVar.d, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        dxh dxhVar58 = dxgVar.d;
                        dxhVar58.aq = obtainStyledAttributes.getInt(index, dxhVar58.aq);
                        break;
                }
            }
            dxh dxhVar59 = dxgVar.d;
            if (dxhVar59.al != null) {
                dxhVar59.ak = null;
            }
        }
        obtainStyledAttributes.recycle();
        return dxgVar;
    }

    public final dxg b(int i) {
        HashMap hashMap = this.e;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.e.put(valueOf, new dxg());
        }
        return (dxg) this.e.get(valueOf);
    }

    public final void c(ConstraintLayout constraintLayout) {
        k(constraintLayout);
        constraintLayout.f = null;
        constraintLayout.requestLayout();
    }

    public final void d(ConstraintLayout constraintLayout) {
        int i;
        dxl dxlVar = this;
        int childCount = constraintLayout.getChildCount();
        dxlVar.e.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            dxc dxcVar = (dxc) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                HashMap hashMap = dxlVar.e;
                Integer valueOf = Integer.valueOf(id);
                if (!hashMap.containsKey(valueOf)) {
                    dxlVar.e.put(valueOf, new dxg());
                }
                dxg dxgVar = (dxg) dxlVar.e.get(valueOf);
                if (dxgVar == null) {
                    i = childCount;
                } else {
                    HashMap hashMap2 = dxlVar.d;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap2.keySet()) {
                        dwz dwzVar = (dwz) hashMap2.get(str);
                        int i3 = childCount;
                        try {
                            if (str.equals("BackgroundColor")) {
                                hashMap3.put(str, new dwz(dwzVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                hashMap3.put(str, new dwz(dwzVar, cls.getMethod(a.cp(str, "getMap"), null).invoke(childAt, null)));
                            }
                        } catch (IllegalAccessException e) {
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                        } catch (NoSuchMethodException e2) {
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e3);
                        }
                        childCount = i3;
                    }
                    i = childCount;
                    dxgVar.f = hashMap3;
                    dxgVar.a = id;
                    int i4 = dxcVar.e;
                    dxh dxhVar = dxgVar.d;
                    dxhVar.j = i4;
                    dxhVar.k = dxcVar.f;
                    dxhVar.l = dxcVar.g;
                    dxhVar.m = dxcVar.h;
                    dxhVar.n = dxcVar.i;
                    dxhVar.o = dxcVar.j;
                    dxhVar.p = dxcVar.k;
                    dxhVar.q = dxcVar.l;
                    dxhVar.r = dxcVar.m;
                    dxhVar.s = dxcVar.n;
                    dxhVar.t = dxcVar.o;
                    dxhVar.u = dxcVar.s;
                    dxhVar.v = dxcVar.t;
                    dxhVar.w = dxcVar.u;
                    dxhVar.x = dxcVar.v;
                    dxhVar.y = dxcVar.G;
                    dxhVar.z = dxcVar.H;
                    dxhVar.A = dxcVar.I;
                    dxhVar.B = dxcVar.p;
                    dxhVar.C = dxcVar.q;
                    dxhVar.D = dxcVar.r;
                    dxhVar.E = dxcVar.X;
                    dxhVar.F = dxcVar.Y;
                    dxhVar.G = dxcVar.Z;
                    dxhVar.h = dxcVar.c;
                    dxhVar.f = dxcVar.a;
                    dxhVar.g = dxcVar.b;
                    dxhVar.d = dxcVar.width;
                    dxgVar.d.e = dxcVar.height;
                    dxgVar.d.H = dxcVar.leftMargin;
                    dxgVar.d.I = dxcVar.rightMargin;
                    dxgVar.d.J = dxcVar.topMargin;
                    dxgVar.d.K = dxcVar.bottomMargin;
                    int i5 = dxcVar.D;
                    dxh dxhVar2 = dxgVar.d;
                    dxhVar2.N = i5;
                    dxhVar2.V = dxcVar.M;
                    dxhVar2.W = dxcVar.L;
                    dxhVar2.Y = dxcVar.O;
                    dxhVar2.X = dxcVar.N;
                    dxhVar2.an = dxcVar.aa;
                    dxhVar2.ao = dxcVar.ab;
                    dxhVar2.Z = dxcVar.P;
                    dxhVar2.aa = dxcVar.Q;
                    dxhVar2.ab = dxcVar.T;
                    dxhVar2.ac = dxcVar.U;
                    dxhVar2.ad = dxcVar.R;
                    dxhVar2.ae = dxcVar.S;
                    dxhVar2.af = dxcVar.V;
                    dxhVar2.ag = dxcVar.W;
                    dxhVar2.am = dxcVar.ac;
                    dxhVar2.P = dxcVar.x;
                    dxhVar2.R = dxcVar.z;
                    dxhVar2.O = dxcVar.w;
                    dxhVar2.Q = dxcVar.y;
                    dxhVar2.T = dxcVar.A;
                    dxhVar2.S = dxcVar.B;
                    dxhVar2.U = dxcVar.C;
                    dxhVar2.aq = dxcVar.ad;
                    dxhVar2.L = dxcVar.getMarginEnd();
                    dxgVar.d.M = dxcVar.getMarginStart();
                    dxgVar.b.b = childAt.getVisibility();
                    dxgVar.b.d = childAt.getAlpha();
                    dxgVar.e.c = childAt.getRotation();
                    dxgVar.e.d = childAt.getRotationX();
                    dxgVar.e.e = childAt.getRotationY();
                    dxgVar.e.f = childAt.getScaleX();
                    dxgVar.e.g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        dxk dxkVar = dxgVar.e;
                        dxkVar.h = pivotX;
                        dxkVar.i = pivotY;
                    }
                    dxgVar.e.k = childAt.getTranslationX();
                    dxgVar.e.l = childAt.getTranslationY();
                    dxgVar.e.m = childAt.getTranslationZ();
                    dxk dxkVar2 = dxgVar.e;
                    if (dxkVar2.n) {
                        dxkVar2.o = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        dxh dxhVar3 = dxgVar.d;
                        dxhVar3.ap = barrier.b.b;
                        dxhVar3.ak = Arrays.copyOf(barrier.c, barrier.d);
                        dxh dxhVar4 = dxgVar.d;
                        dxhVar4.ah = barrier.a;
                        dxhVar4.ai = barrier.b.c;
                    }
                }
                i2++;
                dxlVar = this;
                childCount = i;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(Context context, int i) {
        d((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void f(int i, float f) {
        b(i).d.af = f;
    }

    public final void g(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    dxg n = n(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        n.d.b = true;
                    }
                    this.e.put(Integer.valueOf(n.a), n);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.bV(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.bV(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0079. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x00e8. Please report as an issue. */
    public final void h(Context context, XmlPullParser xmlPullParser) {
        char c2;
        Object obj;
        char c3;
        try {
            int eventType = xmlPullParser.getEventType();
            dxg dxgVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    int i = 0;
                    if (eventType != 2) {
                        if (eventType == 3) {
                            String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c3 = 3;
                                        break;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c3 = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c3 = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c3 = 0;
                                        break;
                                    }
                                    break;
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                                if (c3 == 1 || c3 == 2 || c3 == 3) {
                                    try {
                                        this.e.put(Integer.valueOf(dxgVar.a), dxgVar);
                                        dxgVar = null;
                                    } catch (IOException e) {
                                        e = e;
                                        Log.e("ConstraintSet", "Error parsing XML resource", e);
                                        return;
                                    } catch (XmlPullParserException e2) {
                                        e = e2;
                                        Log.e("ConstraintSet", "Error parsing XML resource", e);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                dxgVar = n(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            case 1:
                                dxgVar = n(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            case 2:
                                dxgVar = n(context, Xml.asAttributeSet(xmlPullParser), false);
                                dxh dxhVar = dxgVar.d;
                                dxhVar.b = true;
                                dxhVar.c = true;
                                break;
                            case 3:
                                dxgVar = n(context, Xml.asAttributeSet(xmlPullParser), false);
                                dxgVar.d.aj = 1;
                                break;
                            case 4:
                                if (dxgVar != null) {
                                    dxj dxjVar = dxgVar.b;
                                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dxp.g);
                                    dxjVar.a = true;
                                    int indexCount = obtainStyledAttributes.getIndexCount();
                                    for (int i2 = 0; i2 < indexCount; i2++) {
                                        int index = obtainStyledAttributes.getIndex(i2);
                                        if (index == 1) {
                                            dxjVar.d = obtainStyledAttributes.getFloat(1, dxjVar.d);
                                        } else if (index == 0) {
                                            int i3 = obtainStyledAttributes.getInt(0, dxjVar.b);
                                            dxjVar.b = i3;
                                            dxjVar.b = a[i3];
                                        } else {
                                            if (index == 4) {
                                                dxjVar.c = obtainStyledAttributes.getInt(4, dxjVar.c);
                                            } else if (index == 3) {
                                                dxjVar.e = obtainStyledAttributes.getFloat(3, dxjVar.e);
                                            }
                                        }
                                    }
                                    obtainStyledAttributes.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 5:
                                if (dxgVar != null) {
                                    dxk dxkVar = dxgVar.e;
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dxp.i);
                                    dxkVar.b = true;
                                    int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                    for (int i4 = 0; i4 < indexCount2; i4++) {
                                        int index2 = obtainStyledAttributes2.getIndex(i4);
                                        switch (dxk.a.get(index2)) {
                                            case 1:
                                                dxkVar.c = obtainStyledAttributes2.getFloat(index2, dxkVar.c);
                                                break;
                                            case 2:
                                                dxkVar.d = obtainStyledAttributes2.getFloat(index2, dxkVar.d);
                                                break;
                                            case 3:
                                                dxkVar.e = obtainStyledAttributes2.getFloat(index2, dxkVar.e);
                                                break;
                                            case 4:
                                                dxkVar.f = obtainStyledAttributes2.getFloat(index2, dxkVar.f);
                                                break;
                                            case 5:
                                                dxkVar.g = obtainStyledAttributes2.getFloat(index2, dxkVar.g);
                                                break;
                                            case 6:
                                                dxkVar.h = obtainStyledAttributes2.getDimension(index2, dxkVar.h);
                                                break;
                                            case 7:
                                                dxkVar.i = obtainStyledAttributes2.getDimension(index2, dxkVar.i);
                                                break;
                                            case 8:
                                                dxkVar.k = obtainStyledAttributes2.getDimension(index2, dxkVar.k);
                                                break;
                                            case 9:
                                                dxkVar.l = obtainStyledAttributes2.getDimension(index2, dxkVar.l);
                                                break;
                                            case 10:
                                                dxkVar.m = obtainStyledAttributes2.getDimension(index2, dxkVar.m);
                                                break;
                                            case 11:
                                                dxkVar.n = true;
                                                dxkVar.o = obtainStyledAttributes2.getDimension(index2, dxkVar.o);
                                                break;
                                            case 12:
                                                dxkVar.j = a(obtainStyledAttributes2, index2, dxkVar.j);
                                                break;
                                        }
                                    }
                                    obtainStyledAttributes2.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 6:
                                if (dxgVar != null) {
                                    dxh dxhVar2 = dxgVar.d;
                                    TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dxp.e);
                                    dxhVar2.c = true;
                                    int indexCount3 = obtainStyledAttributes3.getIndexCount();
                                    for (int i5 = 0; i5 < indexCount3; i5++) {
                                        int index3 = obtainStyledAttributes3.getIndex(i5);
                                        int i6 = dxh.a.get(index3);
                                        switch (i6) {
                                            case 1:
                                                dxhVar2.r = a(obtainStyledAttributes3, index3, dxhVar2.r);
                                                break;
                                            case 2:
                                                dxhVar2.K = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.K);
                                                break;
                                            case 3:
                                                dxhVar2.q = a(obtainStyledAttributes3, index3, dxhVar2.q);
                                                break;
                                            case 4:
                                                dxhVar2.p = a(obtainStyledAttributes3, index3, dxhVar2.p);
                                                break;
                                            case 5:
                                                dxhVar2.A = obtainStyledAttributes3.getString(index3);
                                                break;
                                            case 6:
                                                dxhVar2.E = obtainStyledAttributes3.getDimensionPixelOffset(index3, dxhVar2.E);
                                                break;
                                            case 7:
                                                dxhVar2.F = obtainStyledAttributes3.getDimensionPixelOffset(index3, dxhVar2.F);
                                                break;
                                            case 8:
                                                dxhVar2.L = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.L);
                                                break;
                                            case 9:
                                                dxhVar2.x = a(obtainStyledAttributes3, index3, dxhVar2.x);
                                                break;
                                            case 10:
                                                dxhVar2.w = a(obtainStyledAttributes3, index3, dxhVar2.w);
                                                break;
                                            case 11:
                                                dxhVar2.R = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.R);
                                                break;
                                            case 12:
                                                dxhVar2.S = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.S);
                                                break;
                                            case 13:
                                                dxhVar2.O = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.O);
                                                break;
                                            case 14:
                                                dxhVar2.Q = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.Q);
                                                break;
                                            case 15:
                                                dxhVar2.T = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.T);
                                                break;
                                            case 16:
                                                dxhVar2.P = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.P);
                                                break;
                                            case 17:
                                                dxhVar2.f = obtainStyledAttributes3.getDimensionPixelOffset(index3, dxhVar2.f);
                                                break;
                                            case 18:
                                                dxhVar2.g = obtainStyledAttributes3.getDimensionPixelOffset(index3, dxhVar2.g);
                                                break;
                                            case 19:
                                                dxhVar2.h = obtainStyledAttributes3.getFloat(index3, dxhVar2.h);
                                                break;
                                            case 20:
                                                dxhVar2.y = obtainStyledAttributes3.getFloat(index3, dxhVar2.y);
                                                break;
                                            case 21:
                                                dxhVar2.e = obtainStyledAttributes3.getLayoutDimension(index3, dxhVar2.e);
                                                break;
                                            case 22:
                                                dxhVar2.d = obtainStyledAttributes3.getLayoutDimension(index3, dxhVar2.d);
                                                break;
                                            case 23:
                                                dxhVar2.H = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.H);
                                                break;
                                            case 24:
                                                dxhVar2.j = a(obtainStyledAttributes3, index3, dxhVar2.j);
                                                break;
                                            case 25:
                                                dxhVar2.k = a(obtainStyledAttributes3, index3, dxhVar2.k);
                                                break;
                                            case 26:
                                                dxhVar2.G = obtainStyledAttributes3.getInt(index3, dxhVar2.G);
                                                break;
                                            case 27:
                                                dxhVar2.I = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.I);
                                                break;
                                            case 28:
                                                dxhVar2.l = a(obtainStyledAttributes3, index3, dxhVar2.l);
                                                break;
                                            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                                                dxhVar2.m = a(obtainStyledAttributes3, index3, dxhVar2.m);
                                                break;
                                            case 30:
                                                dxhVar2.M = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.M);
                                                break;
                                            case 31:
                                                dxhVar2.u = a(obtainStyledAttributes3, index3, dxhVar2.u);
                                                break;
                                            case 32:
                                                dxhVar2.v = a(obtainStyledAttributes3, index3, dxhVar2.v);
                                                break;
                                            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                                                dxhVar2.J = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.J);
                                                break;
                                            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                                                dxhVar2.o = a(obtainStyledAttributes3, index3, dxhVar2.o);
                                                break;
                                            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                                                dxhVar2.n = a(obtainStyledAttributes3, index3, dxhVar2.n);
                                                break;
                                            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                                                dxhVar2.z = obtainStyledAttributes3.getFloat(index3, dxhVar2.z);
                                                break;
                                            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                                                dxhVar2.W = obtainStyledAttributes3.getFloat(index3, dxhVar2.W);
                                                break;
                                            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                                                dxhVar2.V = obtainStyledAttributes3.getFloat(index3, dxhVar2.V);
                                                break;
                                            case 39:
                                                dxhVar2.X = obtainStyledAttributes3.getInt(index3, dxhVar2.X);
                                                break;
                                            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                                                dxhVar2.Y = obtainStyledAttributes3.getInt(index3, dxhVar2.Y);
                                                break;
                                            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                                i(dxhVar2, obtainStyledAttributes3, index3, 0);
                                                break;
                                            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                                                i(dxhVar2, obtainStyledAttributes3, index3, 1);
                                                break;
                                            default:
                                                switch (i6) {
                                                    case 61:
                                                        dxhVar2.B = a(obtainStyledAttributes3, index3, dxhVar2.B);
                                                        break;
                                                    case 62:
                                                        dxhVar2.C = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.C);
                                                        break;
                                                    case 63:
                                                        dxhVar2.D = obtainStyledAttributes3.getFloat(index3, dxhVar2.D);
                                                        break;
                                                    default:
                                                        switch (i6) {
                                                            case 69:
                                                                dxhVar2.af = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                break;
                                                            case 70:
                                                                dxhVar2.ag = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                break;
                                                            case 71:
                                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                break;
                                                            case 72:
                                                                dxhVar2.ah = obtainStyledAttributes3.getInt(index3, dxhVar2.ah);
                                                                break;
                                                            case 73:
                                                                dxhVar2.ai = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.ai);
                                                                break;
                                                            case 74:
                                                                dxhVar2.al = obtainStyledAttributes3.getString(index3);
                                                                break;
                                                            case 75:
                                                                dxhVar2.ap = obtainStyledAttributes3.getBoolean(index3, dxhVar2.ap);
                                                                break;
                                                            case 76:
                                                                dxhVar2.aq = obtainStyledAttributes3.getInt(index3, dxhVar2.aq);
                                                                break;
                                                            case 77:
                                                                dxhVar2.s = a(obtainStyledAttributes3, index3, dxhVar2.s);
                                                                break;
                                                            case 78:
                                                                dxhVar2.t = a(obtainStyledAttributes3, index3, dxhVar2.t);
                                                                break;
                                                            case 79:
                                                                dxhVar2.U = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.U);
                                                                break;
                                                            case 80:
                                                                dxhVar2.N = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.N);
                                                                break;
                                                            case 81:
                                                                dxhVar2.Z = obtainStyledAttributes3.getInt(index3, dxhVar2.Z);
                                                                break;
                                                            case 82:
                                                                dxhVar2.aa = obtainStyledAttributes3.getInt(index3, dxhVar2.aa);
                                                                break;
                                                            case 83:
                                                                dxhVar2.ac = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.ac);
                                                                break;
                                                            case 84:
                                                                dxhVar2.ab = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.ab);
                                                                break;
                                                            case 85:
                                                                dxhVar2.ae = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.ae);
                                                                break;
                                                            case 86:
                                                                dxhVar2.ad = obtainStyledAttributes3.getDimensionPixelSize(index3, dxhVar2.ad);
                                                                break;
                                                            case 87:
                                                                dxhVar2.an = obtainStyledAttributes3.getBoolean(index3, dxhVar2.an);
                                                                break;
                                                            case 88:
                                                                dxhVar2.ao = obtainStyledAttributes3.getBoolean(index3, dxhVar2.ao);
                                                                break;
                                                            case 89:
                                                                dxhVar2.am = obtainStyledAttributes3.getString(index3);
                                                                break;
                                                            case 90:
                                                                dxhVar2.i = obtainStyledAttributes3.getBoolean(index3, dxhVar2.i);
                                                                break;
                                                            case 91:
                                                                Log.w("ConstraintSet", a.ca(index3, "unused attribute 0x", dxh.a));
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", a.ca(index3, "Unknown attribute 0x", dxh.a));
                                                                break;
                                                        }
                                                }
                                        }
                                    }
                                    obtainStyledAttributes3.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 7:
                                if (dxgVar != null) {
                                    dxi dxiVar = dxgVar.c;
                                    TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dxp.f);
                                    dxiVar.b = true;
                                    int indexCount4 = obtainStyledAttributes4.getIndexCount();
                                    int i7 = 0;
                                    while (i7 < indexCount4) {
                                        int index4 = obtainStyledAttributes4.getIndex(i7);
                                        switch (dxi.a.get(index4)) {
                                            case 1:
                                                dxiVar.j = obtainStyledAttributes4.getFloat(index4, dxiVar.j);
                                                break;
                                            case 2:
                                                dxiVar.f = obtainStyledAttributes4.getInt(index4, dxiVar.f);
                                                break;
                                            case 3:
                                                if (obtainStyledAttributes4.peekValue(index4).type == 3) {
                                                    dxiVar.e = obtainStyledAttributes4.getString(index4);
                                                    break;
                                                } else {
                                                    dxiVar.e = dus.a[obtainStyledAttributes4.getInteger(index4, 0)];
                                                    break;
                                                }
                                            case 4:
                                                dxiVar.g = obtainStyledAttributes4.getInt(index4, i);
                                                break;
                                            case 5:
                                                dxiVar.c = a(obtainStyledAttributes4, index4, dxiVar.c);
                                                break;
                                            case 6:
                                                dxiVar.d = obtainStyledAttributes4.getInteger(index4, dxiVar.d);
                                                break;
                                            case 7:
                                                dxiVar.h = obtainStyledAttributes4.getFloat(index4, dxiVar.h);
                                                break;
                                            case 8:
                                                dxiVar.l = obtainStyledAttributes4.getInteger(index4, dxiVar.l);
                                                break;
                                            case 9:
                                                dxiVar.k = obtainStyledAttributes4.getFloat(index4, dxiVar.k);
                                                break;
                                            case 10:
                                                TypedValue peekValue = obtainStyledAttributes4.peekValue(index4);
                                                if (peekValue.type == 1) {
                                                    int resourceId = obtainStyledAttributes4.getResourceId(index4, -1);
                                                    dxiVar.o = resourceId;
                                                    if (resourceId != -1) {
                                                        dxiVar.n = -2;
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                } else if (peekValue.type == 3) {
                                                    dxiVar.m = obtainStyledAttributes4.getString(index4);
                                                    if (dxiVar.m.indexOf("/") > 0) {
                                                        dxiVar.o = obtainStyledAttributes4.getResourceId(index4, -1);
                                                        dxiVar.n = -2;
                                                        break;
                                                    } else {
                                                        dxiVar.n = -1;
                                                        break;
                                                    }
                                                } else {
                                                    dxiVar.n = obtainStyledAttributes4.getInteger(index4, dxiVar.o);
                                                    break;
                                                }
                                        }
                                        i7++;
                                        i = 0;
                                    }
                                    obtainStyledAttributes4.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case '\b':
                            case '\t':
                                if (dxgVar != null) {
                                    HashMap hashMap = dxgVar.f;
                                    TypedArray obtainStyledAttributes5 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), dxp.d);
                                    int indexCount5 = obtainStyledAttributes5.getIndexCount();
                                    int i8 = 0;
                                    boolean z = false;
                                    String str = null;
                                    Object obj2 = null;
                                    for (int i9 = 0; i9 < indexCount5; i9++) {
                                        int index5 = obtainStyledAttributes5.getIndex(i9);
                                        if (index5 == 0) {
                                            String string = obtainStyledAttributes5.getString(0);
                                            if (string != null && string.length() > 0) {
                                                str = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                                            } else {
                                                str = string;
                                            }
                                        } else if (index5 == 10) {
                                            str = obtainStyledAttributes5.getString(10);
                                            z = true;
                                        } else {
                                            if (index5 == 1) {
                                                obj2 = Boolean.valueOf(obtainStyledAttributes5.getBoolean(1, false));
                                                i8 = 6;
                                            } else if (index5 == 3) {
                                                obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(3, 0));
                                                i8 = 3;
                                            } else if (index5 == 2) {
                                                obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(2, 0));
                                                i8 = 4;
                                            } else if (index5 == 7) {
                                                obj2 = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes5.getDimension(7, brg.a), context.getResources().getDisplayMetrics()));
                                                i8 = 7;
                                            } else if (index5 == 4) {
                                                obj2 = Float.valueOf(obtainStyledAttributes5.getDimension(4, brg.a));
                                                i8 = 7;
                                            } else if (index5 == 5) {
                                                obj2 = Float.valueOf(obtainStyledAttributes5.getFloat(5, Float.NaN));
                                                i8 = 2;
                                            } else if (index5 == 6) {
                                                obj2 = Integer.valueOf(obtainStyledAttributes5.getInteger(6, -1));
                                                i8 = 1;
                                            } else if (index5 == 9) {
                                                obj2 = obtainStyledAttributes5.getString(9);
                                                i8 = 5;
                                            } else if (index5 == 8) {
                                                int resourceId2 = obtainStyledAttributes5.getResourceId(8, -1);
                                                if (resourceId2 == -1) {
                                                    resourceId2 = obtainStyledAttributes5.getInt(8, -1);
                                                }
                                                obj2 = Integer.valueOf(resourceId2);
                                                i8 = 8;
                                            }
                                        }
                                    }
                                    String str2 = str;
                                    if (str2 != null && (obj = obj2) != null) {
                                        hashMap.put(str2, new dwz(str2, i8, obj, z));
                                    }
                                    obtainStyledAttributes5.recycle();
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                break;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00f1. Please report as an issue. */
    public final void k(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2;
        String str;
        int i;
        HashMap hashMap;
        String str2;
        int i2;
        int i3;
        int i4;
        dxl dxlVar = this;
        ConstraintLayout constraintLayout3 = constraintLayout;
        HashMap hashMap2 = dxlVar.e;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(hashMap2.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout3.getChildAt(i5);
            int id = childAt.getId();
            HashMap hashMap3 = dxlVar.e;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap3.containsKey(valueOf)) {
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(str)));
            } else if (id != -1) {
                if (id != -1) {
                    if (dxlVar.e.containsKey(valueOf)) {
                        hashSet.remove(valueOf);
                        dxg dxgVar = (dxg) dxlVar.e.get(valueOf);
                        if (dxgVar != null) {
                            if (childAt instanceof Barrier) {
                                dxgVar.d.aj = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                dxh dxhVar = dxgVar.d;
                                barrier.a = dxhVar.ah;
                                barrier.b(dxhVar.ai);
                                dxh dxhVar2 = dxgVar.d;
                                barrier.b.b = dxhVar2.ap;
                                int[] iArr = dxhVar2.ak;
                                if (iArr != null) {
                                    barrier.j(iArr);
                                } else {
                                    String str3 = dxhVar2.al;
                                    if (str3 != null) {
                                        dxhVar2.ak = m(barrier, str3);
                                        barrier.j(dxgVar.d.ak);
                                    }
                                }
                            }
                            dxc dxcVar = (dxc) childAt.getLayoutParams();
                            dxcVar.a();
                            dxgVar.a(dxcVar);
                            HashMap hashMap4 = dxgVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap4.keySet()) {
                                dwz dwzVar = (dwz) hashMap4.get(str4);
                                if (!dwzVar.a) {
                                    hashMap = hashMap4;
                                    str2 = "set".concat(String.valueOf(str4));
                                } else {
                                    hashMap = hashMap4;
                                    str2 = str4;
                                }
                                try {
                                    i3 = dwzVar.h;
                                    i4 = i3 - 1;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    i2 = childCount;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    i2 = childCount;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    i2 = childCount;
                                }
                                if (i3 != 0) {
                                    switch (i4) {
                                        case 0:
                                            i2 = childCount;
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(str2, clsArr).invoke(childAt, Integer.valueOf(dwzVar.c));
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashMap4 = hashMap;
                                                childCount = i2;
                                            } catch (NoSuchMethodException e5) {
                                                e = e5;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e);
                                                hashMap4 = hashMap;
                                                childCount = i2;
                                            } catch (InvocationTargetException e6) {
                                                e = e6;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashMap4 = hashMap;
                                                childCount = i2;
                                            }
                                            hashMap4 = hashMap;
                                            childCount = i2;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(dwzVar.d));
                                            hashMap4 = hashMap;
                                            childCount = i2;
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(dwzVar.g));
                                            hashMap4 = hashMap;
                                            childCount = i2;
                                            break;
                                        case 3:
                                            i2 = childCount;
                                            Method method = cls.getMethod(str2, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(dwzVar.g);
                                            method.invoke(childAt, colorDrawable);
                                            hashMap4 = hashMap;
                                            childCount = i2;
                                            break;
                                        case 4:
                                            i2 = childCount;
                                            cls.getMethod(str2, CharSequence.class).invoke(childAt, dwzVar.e);
                                            hashMap4 = hashMap;
                                            childCount = i2;
                                            break;
                                        case 5:
                                            i2 = childCount;
                                            cls.getMethod(str2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(dwzVar.f));
                                            hashMap4 = hashMap;
                                            childCount = i2;
                                            break;
                                        case 6:
                                            i2 = childCount;
                                            cls.getMethod(str2, Float.TYPE).invoke(childAt, Float.valueOf(dwzVar.d));
                                            hashMap4 = hashMap;
                                            childCount = i2;
                                            break;
                                        case 7:
                                            i2 = childCount;
                                            try {
                                                cls.getMethod(str2, Integer.TYPE).invoke(childAt, Integer.valueOf(dwzVar.c));
                                            } catch (IllegalAccessException e7) {
                                                e = e7;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashMap4 = hashMap;
                                                childCount = i2;
                                            } catch (NoSuchMethodException e8) {
                                                e = e8;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e);
                                                hashMap4 = hashMap;
                                                childCount = i2;
                                            } catch (InvocationTargetException e9) {
                                                e = e9;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashMap4 = hashMap;
                                                childCount = i2;
                                            }
                                            hashMap4 = hashMap;
                                            childCount = i2;
                                        default:
                                            hashMap4 = hashMap;
                                            break;
                                    }
                                } else {
                                    i2 = childCount;
                                    throw null;
                                }
                            }
                            i = childCount;
                            childAt.setLayoutParams(dxcVar);
                            dxj dxjVar = dxgVar.b;
                            if (dxjVar.c == 0) {
                                childAt.setVisibility(dxjVar.b);
                            }
                            childAt.setAlpha(dxgVar.b.d);
                            childAt.setRotation(dxgVar.e.c);
                            childAt.setRotationX(dxgVar.e.d);
                            childAt.setRotationY(dxgVar.e.e);
                            childAt.setScaleX(dxgVar.e.f);
                            childAt.setScaleY(dxgVar.e.g);
                            dxk dxkVar = dxgVar.e;
                            if (dxkVar.j != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(dxgVar.e.j);
                                if (findViewById != null) {
                                    int top = findViewById.getTop() + findViewById.getBottom();
                                    int left = findViewById.getLeft() + findViewById.getRight();
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float f = left;
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((f / 2.0f) - left2);
                                        childAt.setPivotY((top / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(dxkVar.h)) {
                                    childAt.setPivotX(dxgVar.e.h);
                                }
                                if (!Float.isNaN(dxgVar.e.i)) {
                                    childAt.setPivotY(dxgVar.e.i);
                                }
                            }
                            childAt.setTranslationX(dxgVar.e.k);
                            childAt.setTranslationY(dxgVar.e.l);
                            childAt.setTranslationZ(dxgVar.e.m);
                            dxk dxkVar2 = dxgVar.e;
                            if (dxkVar2.n) {
                                childAt.setElevation(dxkVar2.o);
                            }
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", a.bV(id, "WARNING NO CONSTRAINTS for view "));
                    }
                    i5++;
                    dxlVar = this;
                    constraintLayout3 = constraintLayout;
                    childCount = i;
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            i = childCount;
            i5++;
            dxlVar = this;
            constraintLayout3 = constraintLayout;
            childCount = i;
        }
        int i6 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            dxg dxgVar2 = (dxg) this.e.get(num);
            if (dxgVar2 != null) {
                if (dxgVar2.d.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    dxh dxhVar3 = dxgVar2.d;
                    int[] iArr2 = dxhVar3.ak;
                    if (iArr2 != null) {
                        barrier2.j(iArr2);
                    } else {
                        String str5 = dxhVar3.al;
                        if (str5 != null) {
                            dxhVar3.ak = m(barrier2, str5);
                            barrier2.j(dxgVar2.d.ak);
                        }
                    }
                    dxh dxhVar4 = dxgVar2.d;
                    barrier2.a = dxhVar4.ah;
                    barrier2.b(dxhVar4.ai);
                    dxc dxcVar2 = new dxc();
                    barrier2.k();
                    dxgVar2.a(dxcVar2);
                    constraintLayout2 = constraintLayout;
                    constraintLayout2.addView(barrier2, dxcVar2);
                } else {
                    constraintLayout2 = constraintLayout;
                }
                if (dxgVar2.d.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    dxc dxcVar3 = new dxc();
                    dxgVar2.a(dxcVar3);
                    constraintLayout2.addView(guideline, dxcVar3);
                }
            }
        }
        for (int i7 = 0; i7 < i6; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof dxa) {
                ((dxa) childAt2).g(constraintLayout);
            }
        }
    }
}
