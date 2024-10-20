package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.Objects;
import j$.util.Optional;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtr extends adtd implements adtm, adtk {
    public static final advp a = new advp("(Sim)");
    private static final Optional h = Optional.empty();
    public SubscriptionManager.OnSubscriptionsChangedListener b;
    volatile Handler c;
    HandlerThread d;
    public final adtj e;
    public final Context f;
    public final adts g;
    private final adtn m;
    private final armf n;
    private final armf o;
    private final aduw p;
    private final Executor q;
    private final armf r;
    private final adtg t;
    private final adaw u;
    private final SparseArray i = new SparseArray();
    private int j = 1;
    private int k = -1;
    private int l = -1;
    private final AtomicInteger s = new AtomicInteger(0);

    public adtr(Context context, aduw aduwVar, adts adtsVar, adtg adtgVar, adtn adtnVar, adtj adtjVar, armf armfVar, armf armfVar2, armf armfVar3, Executor executor) {
        this.f = context;
        this.p = aduwVar;
        this.g = adtsVar;
        this.t = adtgVar;
        this.m = adtnVar;
        this.e = adtjVar;
        this.q = new anew(executor);
        this.r = armfVar;
        this.u = new adaw(armfVar);
        this.o = armfVar2;
        this.n = armfVar3;
    }

    public static final int D(Context context, int i) {
        if (yhx.b) {
            try {
                adwt M = M(context, i);
                if (M == null) {
                    return -1;
                }
                return M.d();
            } catch (adwk e) {
                advr.j(e, a, "Failed to get sim carrier id from TelephonyManager", new Object[0]);
            }
        }
        return -1;
    }

    public static final int E(Context context) {
        int defaultVoiceSubscriptionId;
        adwq.b(context);
        defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
        return defaultVoiceSubscriptionId;
    }

    public static final int F(Context context) {
        return ((SubscriptionManager) adwq.b(context).a).getActiveSubscriptionInfoCountMax();
    }

    protected static final String G(Context context, int i) {
        String i2;
        adwt M = M(context, i);
        if (M == null) {
            i2 = "";
        } else {
            i2 = M.i();
        }
        if (TextUtils.isEmpty(i2)) {
            return "";
        }
        return i2;
    }

    protected static final String H(Context context, int i) {
        String n;
        adwt M = M(context, i);
        if (M == null) {
            n = "";
        } else {
            n = M.n();
        }
        if (!TextUtils.isEmpty(n)) {
            return n;
        }
        throw new IllegalStateException("SIM card is not available");
    }

    static final boolean I(Intent intent) {
        if (!"android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED".equals(intent.getAction()) && !S(intent.getAction())) {
            return false;
        }
        return true;
    }

    private final int J(Intent intent) {
        boolean equals = "android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction());
        int i = -1;
        if (equals && F(this.f) == 1) {
            i = 0;
        }
        if (intent.hasExtra("android.telephony.extra.SLOT_INDEX")) {
            return intent.getIntExtra("android.telephony.extra.SLOT_INDEX", i);
        }
        if (intent.hasExtra("slot")) {
            return intent.getIntExtra("slot", i);
        }
        if (intent.hasExtra("phone")) {
            int intExtra = intent.getIntExtra("phone", i);
            advr.r(a, "EXTRA_SLOT_KEY is not available. use PHONE_KEY:%d", Integer.valueOf(intExtra));
            return intExtra;
        }
        if (equals) {
            advr.r(a, "Missing slot index in SIM_STATE_CHANGED event", new Object[0]);
        }
        return i;
    }

    private static int K(Intent intent) {
        if (intent.hasExtra("android.telephony.extra.SUBSCRIPTION_INDEX")) {
            return intent.getIntExtra("android.telephony.extra.SUBSCRIPTION_INDEX", -1);
        }
        if (!intent.hasExtra("subscription")) {
            return -1;
        }
        return intent.getIntExtra("subscription", -1);
    }

    private final synchronized adtq L(int i) {
        for (int i2 = 0; i2 < this.j; i2++) {
            adtq adtqVar = (adtq) this.i.get(i2);
            if (adtqVar != null && adtqVar.b == i) {
                return adtqVar;
            }
        }
        return null;
    }

    private static adwt M(Context context, int i) {
        return adwt.g(context).f(i);
    }

    private final Optional N(String str) {
        Optional empty = Optional.empty();
        if (!TextUtils.isEmpty(str)) {
            return Optional.of(this.p.b(str));
        }
        return empty;
    }

    private final synchronized void O() {
        for (int i = 0; i < this.j; i++) {
            advr.d(a, "SIM slot#%d : %s", Integer.valueOf(i), this.i.get(i));
        }
    }

    private final void P(String str) {
        try {
            Optional N = N(str);
            if (N.isPresent()) {
                advr.l(a, "Caching isFiDevice for iccid: %s", advq.SIM_ICCID.c(N.get()));
                this.p.f((String) N.get());
            }
        } catch (adux e) {
            advr.t(e, a, "exception when try to set isFiDeviceToIccid", new Object[0]);
        }
    }

    private final void Q(Context context, int i) {
        abja abjaVar = this.m.e;
        String G = G(context, i);
        abjaVar.e(G);
        String u = u(context, G, i);
        this.m.f.e(u);
        advp advpVar = a;
        advr.d(advpVar, "Updated raw MSISDN:%s, formatted MSISDN:%s in SimPreferences", advq.PHONE_NUMBER.c(G), advq.PHONE_NUMBER.c(u));
        if (adwi.f(context)) {
            if (((Boolean) aczf.o().a.h.a()).booleanValue()) {
                aiut.b();
                try {
                    this.p.k("currentActiveMsisdn", u, "RcsApplicationData");
                    advr.d(advpVar, "Updated formatted MSISDN:%s in BugleSharedPreferences", advq.PHONE_NUMBER.c(u));
                    return;
                } catch (adux e) {
                    advr.j(e, a, "Failed to update from bugleSharedPreferences", new Object[0]);
                    return;
                }
            }
            return;
        }
        advr.l(advpVar, "Skipping writing to Msisdn because this is not main bugle process.", new Object[0]);
    }

    private final synchronized void R(Context context, int i, int i2, String str) {
        if (i < 0) {
            advr.h(a, "Invalid slotId %d", Integer.valueOf(i));
            return;
        }
        if (this.j > 1 && "LOADED".equals(str)) {
            B(context);
            if (i2 < 0 && this.i.get(i) != null) {
                i2 = ((adtq) this.i.get(i)).b;
            }
        }
        int i3 = i2;
        adtq L = L(i3);
        if (L != null) {
            this.i.delete(L.a);
            if ("NOT_READY".equals(str) && "LOADED".equals(L.f)) {
                advr.l(a, "Unexpected SIM_NOT_READY.", new Object[0]);
                str = "ABSENT";
            }
        }
        this.i.put(i, new adtq(i, i3, 0, 0, null, str));
    }

    private static boolean S(String str) {
        if (str == null || !((Boolean) h.map(new admk(str, 13)).orElse(false)).booleanValue()) {
            return false;
        }
        return true;
    }

    private final synchronized boolean T() {
        for (int i = 0; i < this.j; i++) {
            if (this.i.get(i) == null) {
                return false;
            }
            String str = ((adtq) this.i.get(i)).f;
            if (!"ABSENT".equals(str) && !"LOADED".equals(str) && !"LOCKED".equals(str)) {
                return false;
            }
        }
        return true;
    }

    private static final String U(Context context, int i) {
        String m;
        int F = F(context);
        if (F > 1 && i >= 0) {
            advr.d(a, "Use sub id %d to get mcc/mnc", Integer.valueOf(i));
            if (yhx.b) {
                adwt M = M(context, i);
                if (M != null) {
                    m = M.m();
                }
                m = "";
            } else {
                try {
                    try {
                        TelephonyManager telephonyManager = adwt.g(context).a;
                        Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getSimOperator", Integer.TYPE);
                        declaredMethod.setAccessible(true);
                        m = (String) String.class.cast(declaredMethod.invoke(telephonyManager, Integer.valueOf(i)));
                    } catch (Exception e) {
                        throw new adwj(a.bW("getSimOperator", "Invoking ", " failed"), e);
                    }
                } catch (adwj e2) {
                    advr.j(e2, a, "Failed to get sim operator from telephony for sub id %d", Integer.valueOf(i));
                }
            }
        } else {
            advr.d(a, "Don't use sub id to get mcc/mnc: slot_num=%d; sub_id=%d;", Integer.valueOf(F), Integer.valueOf(i));
            m = adwt.g(context).m();
        }
        if (TextUtils.isEmpty(m)) {
            return "";
        }
        return m;
    }

    private static final boolean V(Context context) {
        if (F(context) > 1) {
            return true;
        }
        return false;
    }

    public static IntentFilter s() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ims.SIM_LOADED");
        intentFilter.addAction("com.google.android.ims.SIM_ABSENT");
        return intentFilter;
    }

    final void A(Context context, apht aphtVar) {
        Intent a2 = adtg.a(aphtVar);
        String action = a2.getAction();
        if (((Boolean) this.n.b()).booleanValue() && action != null && action.equals("com.google.android.ims.SIM_LOADED")) {
            advr.l(a, "Handling SIM_LOADED in PhoneSimsStateUpdater.", new Object[0]);
        } else {
            advr.l(a, "Broadcasting %s", a2.toString());
            epw.a(context).d(a2);
        }
    }

    final synchronized void B(Context context) {
        adwq b = adwq.b(context);
        this.j = F(context);
        for (int i = 0; i < this.j; i++) {
            try {
                try {
                    SubscriptionInfo activeSubscriptionInfoForSimSlotIndex = ((SubscriptionManager) b.a).getActiveSubscriptionInfoForSimSlotIndex(i);
                    advr.d(a, "Slot#%d: SubscriptionInfo=%s", Integer.valueOf(i), advq.GENERIC.c(activeSubscriptionInfoForSimSlotIndex));
                    if (activeSubscriptionInfoForSimSlotIndex == null) {
                        this.i.put(i, new adtq(i, -1, 0, 0, null, "ABSENT"));
                    } else {
                        String str = "";
                        try {
                            TelephonyManager e = adwt.g(context).e(activeSubscriptionInfoForSimSlotIndex.getSubscriptionId());
                            if (e != null && e.getSimState() == 5) {
                                str = "LOADED";
                            } else {
                                str = "ABSENT";
                            }
                        } catch (adwk unused) {
                            advr.h(a, "Permission is required for TelephonyManager", new Object[0]);
                        }
                        this.i.put(i, new adtq(i, activeSubscriptionInfoForSimSlotIndex.getSubscriptionId(), activeSubscriptionInfoForSimSlotIndex.getMcc(), activeSubscriptionInfoForSimSlotIndex.getMnc(), activeSubscriptionInfoForSimSlotIndex.getIccId(), str));
                    }
                } catch (SecurityException e2) {
                    throw new adwk("READ_PHONE_STATE permission is missing.", e2);
                }
            } catch (adwk unused2) {
                advr.h(a, "Permission is required for SubscriptionManager", new Object[0]);
                return;
            }
        }
    }

    final synchronized boolean C(Context context, String str) {
        int i;
        apht c = this.t.c();
        if (this.k == f(context) && c != null) {
            int R = a.R(c.c);
            if (R == 0) {
                R = 1;
            }
            if ("LOADED".equals(str)) {
                i = 2;
            } else if ("ABSENT".equals(str)) {
                i = 3;
            } else {
                i = 1;
            }
            if (R == i) {
                if (!V(context)) {
                    return true;
                }
                if (this.l != b(context)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adtk
    public final void a(Context context, Intent intent) {
        int i;
        int i2;
        String str;
        if (intent != null) {
            advr.l(a, "process intent: %s", intent.getAction());
        }
        this.r.b();
        synchronized (this) {
            this.j = F(context);
            String str2 = "";
            if (intent != null) {
                str2 = albo.ag(intent.getStringExtra("ss"));
                i = K(intent);
                i2 = J(intent);
            } else {
                i = -1;
                i2 = -1;
            }
            this.r.b();
            Handler handler = this.c;
            if (handler != null) {
                handler.post(new ebm(this, i2, 15));
                return;
            }
            if (intent == null) {
                return;
            }
            advp advpVar = a;
            advr.d(advpVar, "Received SIM state %s for subId=%d slotId=%d", str2, Integer.valueOf(i), Integer.valueOf(i2));
            R(context, i2, i, str2);
            O();
            advr.d(advpVar, "DefaultSubId=%d", Integer.valueOf(f(context)));
            if (!T()) {
                advr.d(advpVar, "SIM subscription update is not finished.", new Object[0]);
                return;
            }
            adtq t = t(context);
            if (t == null) {
                advr.r(advpVar, "Default SIM info not updated.", new Object[0]);
                str = "ABSENT";
            } else {
                str = t.f;
            }
            advr.l(advpVar, "Processing an intent", new Object[0]);
            y(context, str, i, i2);
        }
    }

    @Override // defpackage.adtm
    public final int b(Context context) {
        int defaultDataSubscriptionId;
        adwq.b(context);
        defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        return defaultDataSubscriptionId;
    }

    @Override // defpackage.adtd
    public final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        if (!((acwr) this.o.b()).a() && ((!I(intent) && !"android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED".equals(intent.getAction())) || V(context))) {
            w(intent);
            adts adtsVar = this.g;
            if (adtsVar != null && adtsVar.d(F(context))) {
                if (intent != null) {
                    advr.l(a, "delay SIM event: %s, %s", intent.getAction(), intent.getStringExtra("ss"));
                    return;
                }
                return;
            } else if (!I(intent) && !"android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED".equals(intent.getAction())) {
                a(context, intent);
                return;
            } else {
                z(context, intent);
                return;
            }
        }
        advr.l(a, "Unexpected action: %s", intent.getAction());
    }

    @Override // defpackage.adtd
    protected final Executor d() {
        return this.q;
    }

    @Override // defpackage.adtd
    public final boolean e(Context context, Intent intent) {
        if (!"android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction()) && !"android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED".equals(intent.getAction()) && !"android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED".equals(intent.getAction()) && !S(intent.getAction())) {
            advr.r(a, "Unexpected action: %s", intent.getAction());
            return false;
        }
        advr.d(a, "Received intent %s", intent.getAction());
        return true;
    }

    @Override // defpackage.adtm
    public final int f(Context context) {
        int defaultSubscriptionId;
        adwq.b(context);
        defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
        return defaultSubscriptionId;
    }

    @Override // defpackage.adtm
    public final int g() {
        return this.m.a();
    }

    @Override // defpackage.adtm
    public final synchronized int h() {
        return this.m.b();
    }

    @Override // defpackage.adtm
    public final Optional i(int i) {
        String str;
        adtq L = L(i);
        if (L != null && (str = L.e) != null) {
            return Optional.of(str);
        }
        return Optional.empty();
    }

    @Override // defpackage.adtm
    public final String j() {
        String h2;
        synchronized (this) {
            h2 = this.m.h();
            if (agkx.ae(h2) && this.m.u()) {
                try {
                    Context context = this.f;
                    int h3 = h();
                    if (r(context)) {
                        Q(context, h3);
                    }
                    h2 = this.m.h();
                } catch (adwk unused) {
                    advr.h(a, "Exception updating MSISDN", new Object[0]);
                }
            }
            advr.d(a, "Formatted MSISDN: %s", advq.PHONE_NUMBER.c(h2));
        }
        return h2;
    }

    @Override // defpackage.adtm
    public final String k() {
        return this.m.j();
    }

    @Override // defpackage.adtm
    public final synchronized void l(PrintWriter printWriter) {
        printWriter.println("- SimStateTracker -");
        printWriter.println("  default subId: " + this.k);
        printWriter.println("  stored subId: " + this.m.b());
        printWriter.println("  stored slotIndex: " + this.m.a());
        printWriter.println("  stored SIM ID: ".concat(String.valueOf(advq.SIM_ID.c(this.m.l()))));
        printWriter.println("  stored IMSI: ".concat(String.valueOf(advq.IMSI.c(this.m.j()))));
        printWriter.println("  stored raw MSISDN: ".concat(String.valueOf(advq.PHONE_NUMBER.c(this.m.k()))));
        printWriter.println("  stored SIM operator: ".concat(String.valueOf(this.m.m())));
        printWriter.println("  stored GID1: ".concat(String.valueOf(this.m.i())));
        printWriter.println("  isFiDevice: " + this.m.u());
        printWriter.println("  # of SIM slot: " + this.j);
        for (int i = 0; i < this.j; i++) {
            printWriter.printf("  SIM slot#%d : %s\n", Integer.valueOf(i), this.i.get(i));
        }
    }

    @Override // defpackage.adtm
    public final void m(Context context, Intent intent) {
        this.s.set(0);
        a(context, intent);
    }

    @Override // defpackage.adtm
    public final void n(int i) {
        String str;
        int i2;
        B(this.f);
        O();
        advp advpVar = a;
        advr.d(advpVar, "DefaultSubId=%d", Integer.valueOf(f(this.f)));
        if (!T()) {
            advr.d(advpVar, "SIM subscription update is not finished.", new Object[0]);
            return;
        }
        adtq t = t(this.f);
        if (t == null) {
            advr.r(advpVar, "Default SIM info not updated.", new Object[0]);
            i2 = -1;
            str = "ABSENT";
        } else {
            str = t.f;
            i2 = t.b;
        }
        advr.l(advpVar, "Processing an intent", new Object[0]);
        y(this.f, str, i2, i);
    }

    @Override // defpackage.adtm
    public final synchronized void o() {
        if (this.c == null) {
            HandlerThread handlerThread = new HandlerThread("SimStateTrackerHandler");
            this.d = handlerThread;
            agki.a(handlerThread);
            this.d.start();
            this.c = new Handler(this.d.getLooper());
        }
        adts adtsVar = this.g;
        if (adtsVar != null) {
            Context context = this.f;
            Handler handler = this.c;
            handler.getClass();
            adtsVar.b(context, this, handler);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED");
        h.ifPresent(new adoj(intentFilter, 8));
        this.f.registerReceiver(this, intentFilter);
        advp advpVar = a;
        advr.d(advpVar, "Registered sim events broadcast receiver", new Object[0]);
        Handler handler2 = this.c;
        handler2.getClass();
        handler2.post(new adhp(this, 15));
        advr.d(advpVar, "Number of SIM slot: %d", Integer.valueOf(F(this.f)));
    }

    @Override // defpackage.adtm
    public final void p(String str, String str2) {
        this.p.k("msisdn_for_iccid_".concat(str), str2, "bugle");
    }

    @Override // defpackage.adtm
    public final synchronized void q() {
        try {
            this.f.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            advr.j(e, a, "Failed to unregister intent receiver.", new Object[0]);
        }
        HandlerThread handlerThread = this.d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.d = null;
            this.c = null;
        }
        SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener = this.b;
        if (onSubscriptionsChangedListener != null) {
            this.b = null;
            try {
                try {
                    ((SubscriptionManager) adwq.b(this.f).a).removeOnSubscriptionsChangedListener(onSubscriptionsChangedListener);
                    advr.d(a, "SubscriptionsChangedListener is removed.", new Object[0]);
                } catch (SecurityException e2) {
                    throw new adwk("READ_PHONE_STATE permission is missing.", e2);
                }
            } catch (Exception e3) {
                advr.j(e3, a, "Failed to remove onSubscriptionsChangedListener.", new Object[0]);
            }
        }
        adts adtsVar = this.g;
        if (adtsVar != null) {
            adtsVar.c();
        }
    }

    @Override // defpackage.adtm
    public final boolean r(Context context) {
        String str;
        adtq t = t(context);
        if (t != null) {
            str = t.f;
        } else {
            str = "";
        }
        return "LOADED".equals(str);
    }

    final synchronized adtq t(Context context) {
        if (this.j == 1) {
            return (adtq) this.i.get(0);
        }
        return L(f(context));
    }

    protected final String u(Context context, String str, int i) {
        String aq;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        adwt M = M(context, i);
        if (M == null) {
            aq = "";
        } else {
            aq = albo.aq(M.l());
        }
        if (!((anhn) this.r.b()).c(str, aq)) {
            advr.r(a, "line1number from telephony is invalid! (%s) %s", aq, advq.PHONE_NUMBER.c(str));
            return "";
        }
        return albo.ag(this.u.d(str, aq));
    }

    public final synchronized List v() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (int i = 0; i < this.i.size(); i++) {
            adtq adtqVar = (adtq) this.i.valueAt(i);
            if (adtqVar != null) {
                arrayList.add(adtqVar);
            }
        }
        return arrayList;
    }

    final synchronized void w(Intent intent) {
        int i;
        int i2;
        String str;
        int i3;
        char c;
        int K = K(intent);
        int J = J(intent);
        int i4 = -1;
        if (yhx.b) {
            i = intent.getIntExtra("android.telephony.extra.CARRIER_ID", -1);
        } else {
            i = -1;
        }
        if (yhx.c) {
            i2 = intent.getIntExtra("android.telephony.extra.SPECIFIC_CARRIER_ID", -1);
        } else {
            i2 = -1;
        }
        if ("android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction())) {
            str = Objects.toString(intent.getStringExtra("ss"), "UNKNOWN");
            i3 = 2;
        } else {
            str = "UNKNOWN";
            if (I(intent)) {
                if (true == "android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED".equals(intent.getAction())) {
                    i3 = 7;
                } else {
                    i3 = 1;
                }
            } else {
                if ("android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED".equals(intent.getAction())) {
                    i3 = 5;
                }
                i3 = 1;
            }
        }
        Context context = this.f;
        int E = E(context);
        int b = b(context);
        aozy createBuilder = aphp.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aphp aphpVar = (aphp) apagVar;
        aphpVar.b |= 4;
        aphpVar.e = E;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        aphp aphpVar2 = (aphp) apagVar2;
        aphpVar2.b |= 16;
        aphpVar2.g = b;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        aphp aphpVar3 = (aphp) apagVar3;
        aphpVar3.c = i3 - 1;
        aphpVar3.b |= 1;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        aphp aphpVar4 = (aphp) apagVar4;
        aphpVar4.b |= 2;
        aphpVar4.d = K;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        aphp aphpVar5 = (aphp) apagVar5;
        aphpVar5.b |= 8;
        aphpVar5.f = J;
        int i5 = 3;
        switch (str.hashCode()) {
            case -2044189691:
                if (str.equals("LOADED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2044123382:
                if (str.equals("LOCKED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 77848963:
                if (str.equals("READY")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1034051831:
                if (str.equals("NOT_READY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1924388665:
                if (str.equals("ABSENT")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            i5 = 1;
                        } else {
                            i5 = 5;
                        }
                    } else {
                        i5 = 6;
                    }
                } else {
                    i5 = 4;
                }
            }
        } else {
            i5 = 2;
        }
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        aphp aphpVar6 = (aphp) createBuilder.b;
        aphpVar6.i = i5 - 1;
        aphpVar6.b |= 64;
        int F = F(context);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphp aphpVar7 = (aphp) createBuilder.b;
        aphpVar7.b |= 32;
        aphpVar7.h = F;
        int D = D(context, K);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphp aphpVar8 = (aphp) createBuilder.b;
        aphpVar8.b |= 128;
        aphpVar8.j = D;
        if (yhx.c) {
            try {
                adwt M = M(context, K);
                if (M != null) {
                    try {
                        i4 = M.a.getSimSpecificCarrierId();
                    } catch (SecurityException e) {
                        throw new adwk("READ_PHONE_STATE permission is missing.", e);
                    }
                }
            } catch (adwk e2) {
                advr.j(e2, a, "Failed to get sim specific carrier id from TelephonyManager", new Object[0]);
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar6 = createBuilder.b;
        aphp aphpVar9 = (aphp) apagVar6;
        aphpVar9.b |= 512;
        aphpVar9.l = i4;
        if (!apagVar6.isMutable()) {
            createBuilder.u();
        }
        apag apagVar7 = createBuilder.b;
        aphp aphpVar10 = (aphp) apagVar7;
        aphpVar10.b |= 256;
        aphpVar10.k = i;
        if (!apagVar7.isMutable()) {
            createBuilder.u();
        }
        aphp aphpVar11 = (aphp) createBuilder.b;
        aphpVar11.b |= 1024;
        aphpVar11.m = i2;
        this.e.a((aphp) createBuilder.s());
    }

    final synchronized void x(apht aphtVar) {
        apht aphtVar2;
        int defaultSmsSubscriptionId;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        try {
            Context context = this.f;
            int E = E(context);
            adwq.b(context);
            defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
            int b = b(context);
            aozy builder = aphtVar.toBuilder();
            for (adtq adtqVar : v()) {
                if (adtqVar != null && "LOADED".equals(adtqVar.f)) {
                    int i2 = adtqVar.b;
                    SubscriptionInfo a2 = adwq.b(context).a(i2);
                    if (a2 != null) {
                        str = a2.getNumber();
                    } else {
                        str = "";
                    }
                    aozy createBuilder = aphr.a.createBuilder();
                    if (i2 == E) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    aphr aphrVar = (aphr) apagVar;
                    aphrVar.b |= 1;
                    aphrVar.c = z;
                    if (i2 == defaultSmsSubscriptionId) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar2 = createBuilder.b;
                    aphr aphrVar2 = (aphr) apagVar2;
                    aphrVar2.b |= 2;
                    aphrVar2.d = z2;
                    if (i2 == b) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    aphr aphrVar3 = (aphr) createBuilder.b;
                    aphrVar3.b |= 4;
                    aphrVar3.e = z3;
                    aphr aphrVar4 = (aphr) createBuilder.s();
                    aozy createBuilder2 = aphs.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    aphs aphsVar = (aphs) createBuilder2.b;
                    aphsVar.b |= 1;
                    aphsVar.c = i2;
                    if (true != TextUtils.isEmpty(str)) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar3 = createBuilder2.b;
                    aphs aphsVar2 = (aphs) apagVar3;
                    aphsVar2.d = i - 1;
                    aphsVar2.b |= 2;
                    if (!apagVar3.isMutable()) {
                        createBuilder2.u();
                    }
                    aphs aphsVar3 = (aphs) createBuilder2.b;
                    aphrVar4.getClass();
                    aphsVar3.e = aphrVar4;
                    aphsVar3.b |= 4;
                    aphs aphsVar4 = (aphs) createBuilder2.s();
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    apht aphtVar3 = (apht) builder.b;
                    aphsVar4.getClass();
                    apax apaxVar = aphtVar3.g;
                    if (!apaxVar.c()) {
                        aphtVar3.g = apag.mutableCopy(apaxVar);
                    }
                    aphtVar3.g.add(aphsVar4);
                }
            }
            aphtVar2 = (apht) builder.s();
        } catch (adwk e) {
            advr.j(e, a, "Attempted to get device SIM configuration without phone permission", new Object[0]);
            aphtVar2 = aphtVar;
        }
        this.e.c(aphtVar2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:18|19|(1:21)(1:250)|(1:23)(1:249)|24|25|(2:26|27)|(42:31|(1:33)|34|35|(5:37|(3:188|189|(2:191|(3:193|(1:195)|196)))|39|(1:41)|42)(1:201)|43|(1:45)|46|(1:48)|49|(1:51)(2:182|183)|52|(1:54)|55|(6:57|(6:60|(4:62|63|64|65)|68|(7:70|71|72|73|74|75|76)(1:80)|77|58)|81|82|(6:85|86|87|(3:123|124|125)(4:89|90|(4:93|(7:98|99|(1:101)|102|(4:104|105|106|107)(3:116|(1:118)|119)|108|109)|110|91)|122)|115|83)|128)|129|(1:131)|132|(1:134)|135|(1:137)(1:181)|138|(1:140)|141|(1:143)(1:180)|144|(1:146)|147|(1:149)(1:179)|150|(1:152)|153|154|155|(1:157)(1:175)|158|(1:160)(2:171|(1:173))|161|(3:163|(1:165)|166)|167|(1:169)|170)|203|(1:205)|206|(3:231|232|(41:236|(1:238)(1:242)|(1:240)|(0)(0)|43|(0)|46|(0)|49|(0)(0)|52|(0)|55|(0)|129|(0)|132|(0)|135|(0)(0)|138|(0)|141|(0)(0)|144|(0)|147|(0)(0)|150|(0)|153|154|155|(0)(0)|158|(0)(0)|161|(0)|167|(0)|170))|208|(3:211|(4:214|(5:216|217|(3:222|223|35)|219|220)(1:229)|221|212)|230)|210|(0)(0)|43|(0)|46|(0)|49|(0)(0)|52|(0)|55|(0)|129|(0)|132|(0)|135|(0)(0)|138|(0)|141|(0)(0)|144|(0)|147|(0)(0)|150|(0)|153|154|155|(0)(0)|158|(0)(0)|161|(0)|167|(0)|170) */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x055a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x055e, code lost:
    
        defpackage.advr.t(r0, defpackage.adtr.a, "Exception getting groupIdLevel1", new java.lang.Object[0]);
        r5 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x049d A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ba A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0520 A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0603 A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0635 A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0549 A[Catch: adwk | SecurityException -> 0x055a, SecurityException -> 0x055c, IllegalStateException -> 0x0661, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x053c A[Catch: adwk | SecurityException -> 0x055a, SecurityException -> 0x055c, IllegalStateException -> 0x0661, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04f6 A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04d8 A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x022d A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0193 A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TRY_LEAVE, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0244 A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x025e A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e2 A[Catch: IllegalStateException -> 0x0661, adwk -> 0x066e, all -> 0x06f1, TryCatch #8 {IllegalStateException -> 0x0661, blocks: (B:19:0x0068, B:24:0x007f, B:27:0x008c, B:29:0x0096, B:31:0x00ae, B:33:0x00b6, B:34:0x00b9, B:37:0x0193, B:189:0x01a7, B:191:0x01b1, B:193:0x01cd, B:195:0x01f2, B:196:0x01f5, B:43:0x0231, B:45:0x0244, B:46:0x0247, B:48:0x025e, B:49:0x0261, B:52:0x02ce, B:55:0x02d6, B:57:0x02e2, B:58:0x02ff, B:60:0x0305, B:64:0x0315, B:65:0x0336, B:67:0x0325, B:68:0x0348, B:73:0x0352, B:75:0x0377, B:79:0x0364, B:82:0x038b, B:83:0x038f, B:85:0x0395, B:87:0x03d9, B:124:0x03df, B:90:0x03e8, B:91:0x03ec, B:93:0x03f2, B:96:0x0404, B:99:0x040a, B:101:0x041d, B:102:0x0423, B:104:0x0431, B:107:0x0437, B:113:0x0488, B:116:0x0451, B:118:0x0461, B:119:0x0466, B:129:0x0497, B:131:0x049d, B:132:0x04a7, B:134:0x04ba, B:135:0x04bd, B:138:0x04de, B:141:0x04e6, B:144:0x04fa, B:147:0x0502, B:150:0x0518, B:152:0x0520, B:153:0x0523, B:155:0x0533, B:158:0x0540, B:161:0x056a, B:163:0x0603, B:165:0x0613, B:166:0x0616, B:167:0x0623, B:169:0x0635, B:170:0x0638, B:171:0x0549, B:175:0x053c, B:178:0x055e, B:180:0x04f6, B:181:0x04d8, B:183:0x02c8, B:186:0x0658, B:187:0x0660, B:39:0x020d, B:41:0x0215, B:42:0x0218, B:200:0x0204, B:201:0x022d, B:203:0x00e6, B:205:0x00ee, B:206:0x00f1, B:232:0x0101, B:234:0x0107, B:240:0x0116, B:208:0x0126, B:211:0x0136, B:212:0x0144, B:214:0x014a, B:217:0x015a, B:223:0x0173, B:226:0x0179, B:228:0x0185, B:245:0x011d, B:248:0x00dd, B:249:0x007d, B:250:0x0077), top: B:18:0x0068, outer: #7 }] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Object, acyz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized void y(android.content.Context r22, java.lang.String r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 1781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtr.y(android.content.Context, java.lang.String, int, int):void");
    }

    final synchronized void z(Context context, Intent intent) {
        advp advpVar = a;
        advr.d(advpVar, "Processing default changed intent: %s", intent.getAction());
        if (this.k == f(context) && this.l == b(context)) {
            advr.d(advpVar, "There is no change on default call/data. Ignore this intent.", new Object[0]);
            return;
        }
        if (!T()) {
            advr.d(advpVar, "SIM subscription update is not finished.", new Object[0]);
            return;
        }
        adtq t = t(context);
        if (t == null) {
            advr.r(advpVar, "There is no default SIM subscription.", new Object[0]);
            y(context, "ABSENT", -1, -1);
        } else {
            y(context, t.f, t.b, J(intent));
        }
    }
}
