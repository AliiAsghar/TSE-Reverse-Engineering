package defpackage;

import com.google.gson.internal.bind.EnumTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters$29;
import com.google.gson.internal.bind.TypeAdapters$30;
import defpackage.aonx;
import defpackage.aoon;
import defpackage.aoqy;
import defpackage.aorn;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aorg {
    public static final aooo A;
    public static final aoon B;
    public static final aooo C;
    public static final aoon D;
    public static final aooo E;
    public static final aoon F;
    public static final aooo G;
    public static final aoon H;
    public static final aooo I;
    public static final aoon J;
    public static final aooo K;
    public static final aoon L;
    public static final aooo M;
    public static final aoon N;
    public static final aooo O;
    public static final aoon P;
    public static final aooo Q;
    public static final aoon R;
    public static final aooo S;
    public static final aoon T;
    public static final aooo U;
    public static final aooo V;
    public static final aoon a;
    public static final aooo b;
    public static final aoon c;
    public static final aooo d;
    public static final aoon e;
    public static final aoon f;
    public static final aooo g;
    public static final aoon h;
    public static final aooo i;
    public static final aoon j;
    public static final aooo k;
    public static final aoon l;
    public static final aooo m;
    public static final aoon n;
    public static final aooo o;
    public static final aoon p;
    public static final aooo q;
    public static final aoon r;
    public static final aooo s;
    public static final aoon t;
    public static final aoon u;
    public static final aooo v;
    public static final aoon w;
    public static final aoon x;
    public static final aoon y;
    public static final aoon z;

    static {
        aoon d2 = new aoqo().d();
        a = d2;
        b = new TypeAdapters$29(Class.class, d2);
        aoon d3 = new aoqx().d();
        c = d3;
        d = new TypeAdapters$29(BitSet.class, d3);
        aoqz aoqzVar = new aoqz();
        e = aoqzVar;
        f = new aora();
        g = new TypeAdapters$30(Boolean.TYPE, Boolean.class, aoqzVar);
        aorb aorbVar = new aorb();
        h = aorbVar;
        i = new TypeAdapters$30(Byte.TYPE, Byte.class, aorbVar);
        aorc aorcVar = new aorc();
        j = aorcVar;
        k = new TypeAdapters$30(Short.TYPE, Short.class, aorcVar);
        aord aordVar = new aord();
        l = aordVar;
        m = new TypeAdapters$30(Integer.TYPE, Integer.class, aordVar);
        aoon d4 = new aore().d();
        n = d4;
        o = new TypeAdapters$29(AtomicInteger.class, d4);
        aoon d5 = new aorf().d();
        p = d5;
        q = new TypeAdapters$29(AtomicBoolean.class, d5);
        aoon d6 = new aoqg().d();
        r = d6;
        s = new TypeAdapters$29(AtomicIntegerArray.class, d6);
        t = new aoqh();
        aoqi aoqiVar = new aoqi();
        u = aoqiVar;
        v = new TypeAdapters$30(Character.TYPE, Character.class, aoqiVar);
        aoqj aoqjVar = new aoqj();
        w = aoqjVar;
        x = new aoqk();
        y = new aoql();
        z = new aoqm();
        A = new TypeAdapters$29(String.class, aoqjVar);
        aoqn aoqnVar = new aoqn();
        B = aoqnVar;
        C = new TypeAdapters$29(StringBuilder.class, aoqnVar);
        aoqp aoqpVar = new aoqp();
        D = aoqpVar;
        E = new TypeAdapters$29(StringBuffer.class, aoqpVar);
        aoqq aoqqVar = new aoqq();
        F = aoqqVar;
        G = new TypeAdapters$29(URL.class, aoqqVar);
        aoqr aoqrVar = new aoqr();
        H = aoqrVar;
        I = new TypeAdapters$29(URI.class, aoqrVar);
        final aoqs aoqsVar = new aoqs();
        J = aoqsVar;
        final Class<InetAddress> cls = InetAddress.class;
        K = new aooo() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // defpackage.aooo
            public final aoon a(aonx aonxVar, aorn aornVar) {
                Class cls2 = cls;
                Class<?> cls3 = aornVar.a;
                if (!cls2.isAssignableFrom(cls3)) {
                    return null;
                }
                return new aoqy(aoqsVar, cls3);
            }

            public final String toString() {
                aoon aoonVar = aoqsVar;
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + aoonVar.toString() + "]";
            }
        };
        aoqt aoqtVar = new aoqt();
        L = aoqtVar;
        M = new TypeAdapters$29(UUID.class, aoqtVar);
        aoon d7 = new aoqu().d();
        N = d7;
        O = new TypeAdapters$29(Currency.class, d7);
        final aoqv aoqvVar = new aoqv();
        P = aoqvVar;
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        Q = new aooo() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // defpackage.aooo
            public final aoon a(aonx aonxVar, aorn aornVar) {
                Class cls4 = aornVar.a;
                if (cls4 != cls2 && cls4 != cls3) {
                    return null;
                }
                return aoqvVar;
            }

            public final String toString() {
                aoon aoonVar = aoqvVar;
                Class cls4 = cls3;
                return "Factory[type=" + cls2.getName() + "+" + cls4.getName() + ",adapter=" + aoonVar.toString() + "]";
            }
        };
        aoqw aoqwVar = new aoqw();
        R = aoqwVar;
        S = new TypeAdapters$29(Locale.class, aoqwVar);
        final aopt aoptVar = aopt.a;
        T = aoptVar;
        final Class<aood> cls4 = aood.class;
        U = new aooo() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // defpackage.aooo
            public final aoon a(aonx aonxVar, aorn aornVar) {
                Class cls22 = cls4;
                Class<?> cls32 = aornVar.a;
                if (!cls22.isAssignableFrom(cls32)) {
                    return null;
                }
                return new aoqy(aoptVar, cls32);
            }

            public final String toString() {
                aoon aoonVar = aoptVar;
                return "Factory[typeHierarchy=" + cls4.getName() + ",adapter=" + aoonVar.toString() + "]";
            }
        };
        V = EnumTypeAdapter.a;
    }
}
