package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class af {
    private static final int[] a = {0, 4, 8};
    private static final SparseIntArray b;
    private final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        int[] iArr = ag.a;
        sparseIntArray.append(85, 25);
        sparseIntArray.append(86, 26);
        sparseIntArray.append(88, 29);
        sparseIntArray.append(89, 30);
        sparseIntArray.append(95, 36);
        sparseIntArray.append(94, 35);
        sparseIntArray.append(67, 4);
        sparseIntArray.append(66, 3);
        sparseIntArray.append(62, 1);
        sparseIntArray.append(103, 6);
        sparseIntArray.append(104, 7);
        sparseIntArray.append(74, 17);
        sparseIntArray.append(75, 18);
        sparseIntArray.append(76, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(90, 32);
        sparseIntArray.append(91, 33);
        sparseIntArray.append(73, 10);
        sparseIntArray.append(72, 9);
        sparseIntArray.append(108, 13);
        sparseIntArray.append(111, 16);
        sparseIntArray.append(109, 14);
        sparseIntArray.append(106, 11);
        sparseIntArray.append(110, 15);
        sparseIntArray.append(107, 12);
        sparseIntArray.append(98, 40);
        sparseIntArray.append(83, 39);
        sparseIntArray.append(82, 41);
        sparseIntArray.append(97, 42);
        sparseIntArray.append(81, 20);
        sparseIntArray.append(96, 37);
        sparseIntArray.append(71, 5);
        sparseIntArray.append(84, 60);
        sparseIntArray.append(93, 60);
        sparseIntArray.append(87, 60);
        sparseIntArray.append(65, 60);
        sparseIntArray.append(61, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(99, 54);
        sparseIntArray.append(77, 55);
        sparseIntArray.append(100, 56);
        sparseIntArray.append(78, 57);
        sparseIntArray.append(101, 58);
        sparseIntArray.append(79, 59);
        sparseIntArray.append(1, 38);
    }

    private static int p(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    private static final String q(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME;
                    }
                    return ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME;
                }
                return "baseline";
            }
            return "bottom";
        }
        return "top";
    }

    private static /* synthetic */ String r(byte b2) {
        return "right to " + q(b2) + " undefined";
    }

    public final ae a(int i) {
        HashMap hashMap = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.c.put(valueOf, new ae());
        }
        return (ae) this.c.get(valueOf);
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.c = null;
    }

    public final void c(ConstraintLayout constraintLayout) {
        HashMap hashMap = this.c;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap hashMap2 = this.c;
            Integer valueOf = Integer.valueOf(id);
            if (hashMap2.containsKey(valueOf)) {
                hashSet.remove(valueOf);
                ae aeVar = (ae) this.c.get(valueOf);
                ad adVar = (ad) childAt.getLayoutParams();
                aeVar.a(adVar);
                childAt.setLayoutParams(adVar);
                childAt.setVisibility(aeVar.G);
                childAt.setAlpha(aeVar.R);
                childAt.setRotationX(aeVar.U);
                childAt.setRotationY(aeVar.V);
                childAt.setScaleX(aeVar.W);
                childAt.setScaleY(aeVar.X);
                childAt.setPivotX(aeVar.Y);
                childAt.setPivotY(aeVar.Z);
                childAt.setTranslationX(aeVar.aa);
                childAt.setTranslationY(aeVar.ab);
                childAt.setTranslationZ(aeVar.ac);
                if (aeVar.S) {
                    childAt.setElevation(aeVar.T);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ae aeVar2 = (ae) this.c.get(num);
            if (aeVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ad adVar2 = new ad();
                aeVar2.a(adVar2);
                constraintLayout.addView(guideline, adVar2);
            }
        }
    }

    public final void d(int i, int i2) {
        HashMap hashMap = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            ae aeVar = (ae) this.c.get(valueOf);
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 != 6) {
                        aeVar.s = -1;
                        aeVar.t = -1;
                        aeVar.E = -1;
                        aeVar.L = -1;
                        return;
                    }
                    aeVar.q = -1;
                    aeVar.r = -1;
                    aeVar.F = -1;
                    aeVar.M = -1;
                    return;
                }
                aeVar.p = -1;
                return;
            }
            aeVar.n = -1;
            aeVar.o = -1;
            aeVar.D = -1;
            aeVar.K = -1;
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ad adVar = (ad) childAt.getLayoutParams();
            int id = childAt.getId();
            HashMap hashMap = this.c;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                this.c.put(valueOf, new ae());
            }
            ae aeVar = (ae) this.c.get(valueOf);
            aeVar.d = id;
            aeVar.h = adVar.d;
            aeVar.i = adVar.e;
            aeVar.j = adVar.f;
            aeVar.k = adVar.g;
            aeVar.l = adVar.h;
            aeVar.m = adVar.i;
            aeVar.n = adVar.j;
            aeVar.o = adVar.k;
            aeVar.p = adVar.l;
            aeVar.q = adVar.m;
            aeVar.r = adVar.n;
            aeVar.s = adVar.o;
            aeVar.t = adVar.p;
            aeVar.u = adVar.w;
            aeVar.v = adVar.x;
            aeVar.w = adVar.y;
            aeVar.x = adVar.K;
            aeVar.y = adVar.L;
            aeVar.z = adVar.M;
            aeVar.g = adVar.c;
            aeVar.e = adVar.a;
            aeVar.f = adVar.b;
            aeVar.b = adVar.width;
            aeVar.c = adVar.height;
            aeVar.A = adVar.leftMargin;
            aeVar.B = adVar.rightMargin;
            aeVar.C = adVar.topMargin;
            aeVar.D = adVar.bottomMargin;
            aeVar.N = adVar.B;
            aeVar.O = adVar.A;
            aeVar.Q = adVar.D;
            aeVar.P = adVar.C;
            aeVar.ad = adVar.E;
            aeVar.ae = adVar.F;
            aeVar.af = adVar.I;
            aeVar.ag = adVar.J;
            aeVar.ah = adVar.G;
            aeVar.ai = adVar.H;
            aeVar.E = adVar.getMarginEnd();
            aeVar.F = adVar.getMarginStart();
            aeVar.G = childAt.getVisibility();
            aeVar.R = childAt.getAlpha();
            aeVar.U = childAt.getRotationX();
            aeVar.V = childAt.getRotationY();
            aeVar.W = childAt.getScaleX();
            aeVar.X = childAt.getScaleY();
            aeVar.Y = childAt.getPivotX();
            aeVar.Z = childAt.getPivotY();
            aeVar.aa = childAt.getTranslationX();
            aeVar.ab = childAt.getTranslationY();
            aeVar.ac = childAt.getTranslationZ();
            if (aeVar.S) {
                aeVar.T = childAt.getElevation();
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        HashMap hashMap = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.c.put(valueOf, new ae());
        }
        byte b2 = (byte) i4;
        ae aeVar = (ae) this.c.get(valueOf);
        if (i2 != 4) {
            if (i2 != 5) {
                if (i2 != 6) {
                    if (i4 == 6) {
                        aeVar.s = i3;
                        aeVar.t = -1;
                        return;
                    }
                    throw new IllegalArgumentException(r(b2));
                }
                if (i4 == 6) {
                    aeVar.r = i3;
                    aeVar.q = -1;
                    return;
                }
                throw new IllegalArgumentException(r(b2));
            }
            if (i4 == 5) {
                aeVar.p = i3;
                aeVar.o = -1;
                aeVar.n = -1;
                aeVar.l = -1;
                aeVar.m = -1;
                return;
            }
            throw new IllegalArgumentException(r(b2));
        }
        if (i4 == 4) {
            aeVar.o = i3;
            aeVar.n = -1;
            aeVar.p = -1;
        } else {
            if (i4 == 3) {
                aeVar.n = i3;
                aeVar.o = -1;
                aeVar.p = -1;
                return;
            }
            throw new IllegalArgumentException(r(b2));
        }
    }

    public final void g(int i, int i2, int i3, int i4, int i5) {
        HashMap hashMap = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.c.put(valueOf, new ae());
        }
        byte b2 = (byte) i4;
        ae aeVar = (ae) this.c.get(valueOf);
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 != 6) {
                        if (i4 == 7) {
                            aeVar.t = i3;
                            aeVar.s = -1;
                        } else if (i4 == 6) {
                            aeVar.s = i3;
                            aeVar.t = -1;
                        } else {
                            throw new IllegalArgumentException(r(b2));
                        }
                        aeVar.E = i5;
                        return;
                    }
                    if (i4 == 6) {
                        aeVar.r = i3;
                        aeVar.q = -1;
                    } else if (i4 == 7) {
                        aeVar.q = i3;
                        aeVar.r = -1;
                    } else {
                        throw new IllegalArgumentException(r(b2));
                    }
                    aeVar.F = i5;
                    return;
                }
                if (i4 == 5) {
                    aeVar.p = i3;
                    aeVar.o = -1;
                    aeVar.n = -1;
                    aeVar.l = -1;
                    aeVar.m = -1;
                    return;
                }
                throw new IllegalArgumentException(r(b2));
            }
            if (i4 == 4) {
                aeVar.o = i3;
                aeVar.n = -1;
                aeVar.p = -1;
            } else if (i4 == 3) {
                aeVar.n = i3;
                aeVar.o = -1;
                aeVar.p = -1;
            } else {
                throw new IllegalArgumentException(r(b2));
            }
            aeVar.D = i5;
            return;
        }
        if (i4 == 3) {
            aeVar.l = i3;
            aeVar.m = -1;
            aeVar.p = -1;
        } else if (i4 == 4) {
            aeVar.m = i3;
            aeVar.l = -1;
            aeVar.p = -1;
        } else {
            throw new IllegalArgumentException(r(b2));
        }
        aeVar.C = i5;
    }

    public final void h(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        ae aeVar = new ae();
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, ag.b);
                        int indexCount = obtainStyledAttributes.getIndexCount();
                        for (int i2 = 0; i2 < indexCount; i2++) {
                            int index = obtainStyledAttributes.getIndex(i2);
                            SparseIntArray sparseIntArray = b;
                            int i3 = sparseIntArray.get(index);
                            if (i3 != 60) {
                                switch (i3) {
                                    case 1:
                                        aeVar.p = p(obtainStyledAttributes, index, aeVar.p);
                                        break;
                                    case 2:
                                        aeVar.D = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.D);
                                        break;
                                    case 3:
                                        aeVar.o = p(obtainStyledAttributes, index, aeVar.o);
                                        break;
                                    case 4:
                                        aeVar.n = p(obtainStyledAttributes, index, aeVar.n);
                                        break;
                                    case 5:
                                        aeVar.w = obtainStyledAttributes.getString(index);
                                        break;
                                    case 6:
                                        aeVar.x = obtainStyledAttributes.getDimensionPixelOffset(index, aeVar.x);
                                        break;
                                    case 7:
                                        aeVar.y = obtainStyledAttributes.getDimensionPixelOffset(index, aeVar.y);
                                        break;
                                    case 8:
                                        aeVar.E = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.E);
                                        break;
                                    case 9:
                                        aeVar.n = p(obtainStyledAttributes, index, aeVar.t);
                                        break;
                                    case 10:
                                        aeVar.s = p(obtainStyledAttributes, index, aeVar.s);
                                        break;
                                    case 11:
                                        aeVar.K = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.K);
                                        break;
                                    case 12:
                                        aeVar.L = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.L);
                                        break;
                                    case 13:
                                        aeVar.H = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.H);
                                        break;
                                    case 14:
                                        aeVar.J = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.J);
                                        break;
                                    case 15:
                                        aeVar.M = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.M);
                                        break;
                                    case 16:
                                        aeVar.I = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.I);
                                        break;
                                    case 17:
                                        aeVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, aeVar.e);
                                        break;
                                    case 18:
                                        aeVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, aeVar.f);
                                        break;
                                    case 19:
                                        aeVar.g = obtainStyledAttributes.getFloat(index, aeVar.g);
                                        break;
                                    case 20:
                                        aeVar.u = obtainStyledAttributes.getFloat(index, aeVar.u);
                                        break;
                                    case 21:
                                        aeVar.c = obtainStyledAttributes.getLayoutDimension(index, aeVar.c);
                                        break;
                                    case 22:
                                        int i4 = obtainStyledAttributes.getInt(index, aeVar.G);
                                        aeVar.G = i4;
                                        aeVar.G = a[i4];
                                        break;
                                    case 23:
                                        aeVar.b = obtainStyledAttributes.getLayoutDimension(index, aeVar.b);
                                        break;
                                    case 24:
                                        aeVar.A = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.A);
                                        break;
                                    case 25:
                                        aeVar.h = p(obtainStyledAttributes, index, aeVar.h);
                                        break;
                                    case 26:
                                        aeVar.i = p(obtainStyledAttributes, index, aeVar.i);
                                        break;
                                    case 27:
                                        aeVar.z = obtainStyledAttributes.getInt(index, aeVar.z);
                                        break;
                                    case 28:
                                        aeVar.B = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.B);
                                        break;
                                    case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                                        aeVar.j = p(obtainStyledAttributes, index, aeVar.j);
                                        break;
                                    case 30:
                                        aeVar.k = p(obtainStyledAttributes, index, aeVar.k);
                                        break;
                                    case 31:
                                        aeVar.F = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.F);
                                        break;
                                    case 32:
                                        aeVar.q = p(obtainStyledAttributes, index, aeVar.q);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                                        aeVar.r = p(obtainStyledAttributes, index, aeVar.r);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                                        aeVar.C = obtainStyledAttributes.getDimensionPixelSize(index, aeVar.C);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                                        aeVar.m = p(obtainStyledAttributes, index, aeVar.m);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                                        aeVar.l = p(obtainStyledAttributes, index, aeVar.l);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                                        aeVar.v = obtainStyledAttributes.getFloat(index, aeVar.v);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                                        aeVar.d = obtainStyledAttributes.getResourceId(index, aeVar.d);
                                        break;
                                    case 39:
                                        aeVar.O = obtainStyledAttributes.getFloat(index, aeVar.O);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                                        aeVar.N = obtainStyledAttributes.getFloat(index, aeVar.N);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                        aeVar.P = obtainStyledAttributes.getInt(index, aeVar.P);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                                        aeVar.Q = obtainStyledAttributes.getInt(index, aeVar.Q);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                                        aeVar.R = obtainStyledAttributes.getFloat(index, aeVar.R);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                                        aeVar.S = true;
                                        aeVar.T = obtainStyledAttributes.getFloat(index, aeVar.T);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                                        aeVar.U = obtainStyledAttributes.getFloat(index, aeVar.U);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                                        aeVar.V = obtainStyledAttributes.getFloat(index, aeVar.V);
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                                        aeVar.W = obtainStyledAttributes.getFloat(index, aeVar.W);
                                        break;
                                    case 48:
                                        aeVar.X = obtainStyledAttributes.getFloat(index, aeVar.X);
                                        break;
                                    case 49:
                                        aeVar.Y = obtainStyledAttributes.getFloat(index, aeVar.Y);
                                        break;
                                    case 50:
                                        aeVar.Z = obtainStyledAttributes.getFloat(index, aeVar.Z);
                                        break;
                                    case 51:
                                        aeVar.aa = obtainStyledAttributes.getFloat(index, aeVar.aa);
                                        break;
                                    case 52:
                                        aeVar.ab = obtainStyledAttributes.getFloat(index, aeVar.ab);
                                        break;
                                    case 53:
                                        aeVar.ac = obtainStyledAttributes.getFloat(index, aeVar.ac);
                                        break;
                                    default:
                                        Log.w("ConstraintSet", a.ca(index, "Unknown attribute 0x", sparseIntArray));
                                        break;
                                }
                            } else {
                                Log.w("ConstraintSet", a.ca(index, "unused attribute 0x", sparseIntArray));
                            }
                        }
                        obtainStyledAttributes.recycle();
                        if (name.equalsIgnoreCase("Guideline")) {
                            aeVar.a = true;
                        }
                        this.c.put(Integer.valueOf(aeVar.d), aeVar);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void i(int i, int i2, int i3) {
        ae a2 = a(i);
        if (i2 != 4) {
            if (i2 != 5) {
                a2.F = i3;
                return;
            }
            throw new IllegalArgumentException("baseline does not support margins");
        }
        a2.D = i3;
    }

    public final void j(int i, float f) {
        a(i).W = f;
    }

    public final void k(int i, float f) {
        a(i).X = f;
    }

    public final void l(int i, float f, float f2) {
        ae a2 = a(i);
        a2.Z = f2;
        a2.Y = f;
    }

    public final void m(int i, int i2) {
        a(i).G = i2;
    }

    public final void n(int i) {
        a(R.id.banner_card_id).c = i;
    }

    public final void o(int i) {
        a(R.id.banner_card_id).b = i;
    }
}
