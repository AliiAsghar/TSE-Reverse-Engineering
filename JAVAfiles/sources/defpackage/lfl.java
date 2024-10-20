package defpackage;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.messagedetails.viewmodel.MessageDetailsViewModel;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfl {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public lfl(Context context, xyt xytVar, armf armfVar, armf armfVar2) {
        this.b = context;
        this.a = xytVar;
        this.c = armfVar;
        this.d = armfVar2;
    }

    private static int D(long j) {
        int i = (int) j;
        if (i >= 0) {
            return i;
        }
        return Integer.MAX_VALUE;
    }

    private final vl E(int i) {
        Object obj;
        if (i != 0) {
            obj = this.b;
        } else {
            obj = this.a;
        }
        return (vl) obj;
    }

    public static final mgg n(Map map, int i) {
        Integer valueOf = Integer.valueOf(i);
        mgg mggVar = mgg.a;
        mggVar.getClass();
        return (mgg) Map.EL.getOrDefault(map, valueOf, mggVar);
    }

    public static final int s(amgg amggVar) {
        switch (amggVar.ordinal()) {
            case 3:
                return 4;
            case 4:
            case 14:
            default:
                return 1;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
            case 8:
            case 9:
            case 10:
                return 3;
            case 11:
            case 12:
            case 13:
                return 5;
            case 15:
                return 2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, utz] */
    public final /* bridge */ /* synthetic */ int A() {
        return ((Integer) this.a.e()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, utz] */
    public final /* bridge */ /* synthetic */ int B() {
        return ((Integer) this.d.e()).intValue();
    }

    public final void C(MessageId messageId) {
        if (((LruCache) this.c).get(messageId) == null) {
            synchronized (this.d) {
                if (((LruCache) this.d).get(messageId) == null) {
                    ((LruCache) this.d).put(messageId, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [yjf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, acdd] */
    public final akul a() {
        ArrayList arrayList = new ArrayList();
        if (this.c.g()) {
            if (!((LocationManager) this.a).isProviderEnabled("gps") && !((LocationManager) this.a).isProviderEnabled("network")) {
                xou xouVar = new xou((short[]) null);
                xouVar.j("currentLocation");
                xouVar.k("System location is disabled");
                arrayList.add(xouVar.i());
                return aktp.ag(arrayList);
            }
            return akul.g(agkx.f(this.b.a(102))).h(new itk(arrayList, 8), this.d);
        }
        xou xouVar2 = new xou((short[]) null);
        xouVar2.j("currentLocation");
        xouVar2.k("App does not have location permission");
        arrayList.add(xouVar2.i());
        return aktp.ag(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    public final void b(ViewGroup viewGroup, Collection collection, amfe amfeVar, Runnable runnable) {
        ajgi ajgiVar = new ajgi((Context) this.a);
        kkg kkgVar = (kkg) this.c.b();
        Integer valueOf = Integer.valueOf(R.plurals.delete_conversations_confirmation_dialog_title);
        boolean booleanValue = ((Boolean) ((utz) yig.Q.get()).e()).booleanValue();
        int i = R.string.delete_conversations_confirmation_dialog_text;
        if (booleanValue && ((Optional) ((apxx) kkgVar.e).a).isPresent()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SelectedConversation selectedConversation = (SelectedConversation) it.next();
                if (((msk) kkgVar.a.b()).t(selectedConversation.k, selectedConversation.p).z()) {
                    valueOf = Integer.valueOf(((vni) ((Optional) ((apxx) kkgVar.e).a).get()).c());
                    i = collection.size() == 1 ? ((vni) ((Optional) ((apxx) kkgVar.e).a).get()).a() : ((vni) ((Optional) ((apxx) kkgVar.e).a).get()).b();
                }
            }
        }
        ldl ldlVar = new ldl(valueOf.intValue(), i);
        ajgiVar.y(((cj) this.a).getResources().getQuantityString(ldlVar.a, collection.size(), Integer.valueOf(collection.size())));
        ajgiVar.m(ldlVar.b);
        ajgiVar.t(R.string.delete_conversation_confirmation_button, new aabt(this.b, "HomeFragmentPeer: Delete message", new aakt(this, viewGroup, collection, amfeVar, runnable, 1), 8));
        ajgiVar.o(R.string.delete_conversation_decline_button, new iws(2));
        ajgiVar.s(new kmu(runnable, 0));
        ev a = ajgiVar.a();
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
            Window window = a.getWindow();
            window.getClass();
            ahnz.s((TextView) window.findViewById(android.R.id.message));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final asai c(jza jzaVar) {
        jzaVar.getClass();
        ascd ascdVar = (ascd) this.d.get(jzaVar);
        if (ascdVar != null) {
            return ascdVar;
        }
        return ascy.a(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    public final void d(float f) {
        boolean z;
        boolean z2;
        if (f != ((jyz) this.a.c()).b) {
            ?? r0 = this.a;
            float f2 = ((jyz) this.a.c()).b;
            float f3 = brg.a;
            if (f >= brg.a) {
                f3 = f;
            }
            r0.f(new jyz(f2, f3));
            ?? r02 = this.b;
            if (((jyz) this.a.c()).b > ((jyz) this.a.c()).a) {
                z = true;
            } else {
                z = false;
            }
            r02.f(Boolean.valueOf(z));
            arng arngVar = new arng(jza.d);
            while (arngVar.hasNext()) {
                ascd ascdVar = (ascd) this.d.get((jza) arngVar.next());
                if (ascdVar != null) {
                    if (f > r0.c) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ascdVar.f(Boolean.valueOf(z2));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r31 != false) goto L27;
     */
    /* JADX WARN: Type inference failed for: r1v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(java.lang.String r18, java.lang.String r19, defpackage.mmi r20, java.lang.String r21, defpackage.nht r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, java.lang.String r29, int r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfl.e(java.lang.String, java.lang.String, mmi, java.lang.String, nht, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, boolean):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    public final void f(int i, Uri uri, int i2) {
        if (uri != null) {
            ?? r0 = this.d;
            String uri2 = uri.toString();
            if (((mgx) r0.b()).b() && !TextUtils.isEmpty(uri2)) {
                vl E = E(i);
                synchronized (E) {
                    if (E.containsKey(uri2)) {
                        ahpn ahpnVar = (ahpn) E.get(uri2);
                        if (ahpnVar == null) {
                            return;
                        }
                        if (i2 >= 0) {
                            ahpnVar.j = i2;
                        }
                        ((mgv) this.c.b()).d(ahpnVar);
                        E.remove(uri2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    public final void g(int i, Uri uri, long j, long j2, String str) {
        if (uri != null) {
            ?? r0 = this.d;
            String uri2 = uri.toString();
            if (((mgx) r0.b()).b() && !TextUtils.isEmpty(uri2)) {
                vl E = E(i);
                synchronized (E) {
                    if (E.containsKey(uri2)) {
                        ahpn ahpnVar = (ahpn) E.get(uri2);
                        if (ahpnVar == null) {
                            return;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            ahpnVar.c(str);
                        }
                        ahpnVar.b(D(j), D(j2));
                        ((mgv) this.c.b()).d(ahpnVar);
                        E.remove(uri2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void h(int i, Uri uri) {
        if (((mgx) this.d.b()).a()) {
            vl E = E(i);
            synchronized (E) {
                String uri2 = uri.toString();
                E.put(uri2, new ahpn(uri2));
            }
        }
    }

    public final void i(Uri uri) {
        if (uri != null) {
            String uri2 = uri.toString();
            vl E = E(1);
            synchronized (E) {
                if (E.containsKey(uri2)) {
                    E.remove(uri2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.mgb
            if (r0 == 0) goto L13
            r0 = r5
            mgb r0 = (defpackage.mgb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mgb r0 = new mgb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            apxx r5 = (defpackage.apxx) r5
            java.lang.Object r5 = r5.a
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = r5.get()
            mft r5 = (defpackage.mft) r5
            r0.b = r3
            java.lang.Object r5 = r5.a()
            if (r5 == r1) goto L56
        L48:
            ajwt r5 = (defpackage.ajwt) r5
            if (r5 == 0) goto L54
            int r5 = r5.a
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        L54:
            r5 = 0
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfl.j(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arwe, java.lang.Object] */
    @armg
    public final void k(long j) {
        albo.ax(arwi.e(aktp.a(this.c.b())), (ahlp) this.d, new mge((arpe) null, this, j, 1, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arwe, java.lang.Object] */
    @armg
    public final void l(long j) {
        albo.ax(arwi.e(aktp.a(this.c.b())), (ahlp) this.d, new mge(null, this, j, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arwe, java.lang.Object] */
    @armg
    public final void m(long j) {
        albo.ax(arwi.e(aktp.a(this.c.b())), (ahlp) this.d, new mge((arpe) null, this, j, 2, (char[]) null));
    }

    public final alog o(alog alogVar) {
        if (alogVar.isEmpty()) {
            return alog.r(amgg.UNKNOWN_FORMAT);
        }
        alob alobVar = new alob();
        Collection.EL.forEach(alogVar, new ksn(this, alobVar, 6));
        return alobVar.g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [orj, java.lang.Object] */
    public final amgg p(msh mshVar, boolean z, boolean z2) {
        String n;
        amgg amggVar;
        if (z2) {
            n = mshVar.i();
        } else {
            n = mshVar.n();
        }
        if (this.b.a() && mshVar.B()) {
            if (lgc.C(n)) {
                return amgg.SATELLITE_ESP;
            }
            return amgg.SATELLITE_ESP_DEMO;
        }
        if (albo.ah(n)) {
            if (n == null) {
                return amgg.UNKNOWN_FORMAT;
            }
            return amgg.EMPTY_STRING;
        }
        if (z) {
            return amgg.RBM_BOT;
        }
        if ("ʼWAP_PUSH_SI!ʼ".equals(n)) {
            return amgg.WAP_PUSH_SI;
        }
        xze xzeVar = xca.a;
        if (msx.g(n)) {
            return amgg.EMAIL_ADDRESS;
        }
        if (!((Boolean) new mst(3).get()).booleanValue() ? ((yjr) this.a).z(n) : mshVar.v()) {
            return amgg.EMERGENCY_NUMBER;
        }
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && mshVar.z()) {
            return amgg.PENPAL_BOT;
        }
        if (msx.i(n)) {
            boolean contains = n.contains("+");
            boolean j = ((xca) this.d).j(n);
            if (contains) {
                if (j) {
                    return amgg.ALPHANUMERIC_SHORT_CODE_WITH_COUNTRY;
                }
                return amgg.DIGIT_SHORT_CODE_WITH_COUNTRY;
            }
            if (j) {
                return amgg.ALPHANUMERIC_SHORT_CODE_WITHOUT_COUNTRY;
            }
            return amgg.DIGIT_SHORT_CODE_WITHOUT_COUNTRY;
        }
        if (((Boolean) new mst(12).get()).booleanValue()) {
            if (!mshVar.y()) {
                if (mshVar.q()) {
                    return amgg.E164_FORMATTABLE_NATIONAL_PHONE_NUMBER;
                }
                return amgg.NON_E164_FORMATTABLE_LOCAL_NUMBER;
            }
        } else if (!((yjr) this.a).C(n)) {
            try {
                if (((yjr) this.a).H(((yjr) this.a).D(n, ((yjr) this.a).m())) == 1) {
                    amggVar = amgg.E164_FORMATTABLE_NATIONAL_PHONE_NUMBER;
                } else {
                    amggVar = amgg.NON_E164_FORMATTABLE_LOCAL_NUMBER;
                }
                return amggVar;
            } catch (anhk unused) {
                return amgg.NON_E164_FORMATTABLE_LOCAL_NUMBER;
            }
        }
        return amgg.E164_PHONE_NUMBER;
    }

    public final amgg q(msh mshVar, boolean z) {
        return p(mshVar, z, false);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    @Deprecated
    public final List r(List list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            arrayList.add(amgg.UNKNOWN_FORMAT);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                arrayList.add(q(((msk) this.c.b()).s(bindData), vcp.k(bindData)));
            }
        }
        return arrayList;
    }

    public final amee t(int i) {
        return (amee) u(i).s();
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [xyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [xyt, java.lang.Object] */
    public final aozy u(int i) {
        aozy createBuilder = amee.b.createBuilder();
        boolean F = ((yjy) this.d.b()).h(i).F();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amee ameeVar = (amee) createBuilder.b;
        int i2 = 4;
        ameeVar.c |= 4;
        ameeVar.f = F;
        amnj s = ((yaq) this.a.a()).s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amee ameeVar2 = (amee) createBuilder.b;
        ameeVar2.g = s.g;
        int i3 = 8;
        ameeVar2.c |= 8;
        boolean w = ((yjr) ((znj) this.c.b()).a.b()).w();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amee ameeVar3 = (amee) createBuilder.b;
        ameeVar3.c |= 16;
        ameeVar3.h = w;
        boolean E = ((yjy) ((znj) this.c.b()).b.b()).h(i).E();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amee ameeVar4 = (amee) createBuilder.b;
        ameeVar4.c |= 32;
        ameeVar4.i = E;
        Stream map = Collection.EL.stream(((yaq) this.a.a()).e()).map(new lut(new mew(), 11));
        int i4 = alog.d;
        Iterable iterable = (Iterable) map.collect(alls.a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amee ameeVar5 = (amee) createBuilder.b;
        apao apaoVar = ameeVar5.j;
        if (!apaoVar.c()) {
            ameeVar5.j = apag.mutableCopy(apaoVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ameeVar5.j.g(((amed) it.next()).g);
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) this.b).getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            amee ameeVar6 = (amee) apagVar;
            ameeVar6.e = 6;
            ameeVar6.c |= 2;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amee ameeVar7 = (amee) createBuilder.b;
            ameeVar7.d = 0;
            ameeVar7.c |= 1;
        } else {
            switch (mev.a[activeNetworkInfo.getDetailedState().ordinal()]) {
                case 1:
                    i3 = 2;
                    break;
                case 2:
                    i3 = 3;
                    break;
                case 3:
                    i3 = 4;
                    break;
                case 4:
                    i3 = 5;
                    break;
                case 5:
                    i3 = 6;
                    break;
                case 6:
                    i3 = 7;
                    break;
                case 7:
                    break;
                case 8:
                    i3 = 9;
                    break;
                case 9:
                    i3 = 10;
                    break;
                case 10:
                    i3 = 11;
                    break;
                case 11:
                    i3 = 12;
                    break;
                case 12:
                    i3 = 13;
                    break;
                case 13:
                    i3 = 14;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amee ameeVar8 = (amee) createBuilder.b;
            ameeVar8.e = i3 - 1;
            ameeVar8.c |= 2;
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 6) {
                        i2 = 5;
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amee ameeVar9 = (amee) createBuilder.b;
            ameeVar9.d = i2 - 1;
            ameeVar9.c |= 1;
        }
        return createBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [apwt, java.lang.Object] */
    public final void v(View view, int i) {
        if (view == null) {
            return;
        }
        ahcn j = adwq.j(i);
        Object b = this.b.b();
        b.getClass();
        j.b(lgb.M((ngu) b));
        ((ahdb) this.c.b()).a(view, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [apwt, java.lang.Object] */
    public final void w(Activity activity, int i) {
        boolean z;
        ahcn j = adwq.j(i);
        ahcp aI = ahji.aI();
        Object obj = j.b;
        boolean z2 = true;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        albo.X(z, "CVE %s has already been built.", obj);
        ((apaa) j.c).ct(aI.a, aI.b);
        j.a(aI.a.a());
        j.a(aI.a.hashCode());
        j.a(aI.b.hashCode());
        ahcv ahcvVar = ahcq.b;
        Object obj2 = j.b;
        if (obj2 != null) {
            z2 = false;
        }
        albo.X(z2, "CVE %s has already been built.", obj2);
        j.a = ahcvVar;
        Object b = this.b.b();
        b.getClass();
        j.b(lgb.M((ngu) b));
        ((ahdb) this.c.b()).a(ahcz.a(activity), j);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [alij, java.lang.Object] */
    public final amhb x(int i) {
        try {
            return (amhb) this.a.a(Integer.valueOf(i));
        } catch (ExecutionException e) {
            throw new RuntimeException(a.bV(i, "Failed to create BugleMobileCode for subId: "), e.getCause());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    public final /* bridge */ /* synthetic */ lqn y() {
        jat jatVar = (jat) this.d.b();
        jatVar.getClass();
        ((lgc) this.c.b()).getClass();
        ((arwe) this.b.b()).getClass();
        ((arwe) this.a.b()).getClass();
        return new lqn(jatVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ncq z(ykb ykbVar) {
        wfh wfhVar = (wfh) this.a.b();
        wfhVar.getClass();
        anen anenVar = (anen) this.b.b();
        anenVar.getClass();
        return new ngk(wfhVar, anenVar, this.c, this.d, ykbVar);
    }

    public lfl(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.c = obj2;
        this.d = obj3;
        this.b = obj4;
    }

    public lfl(xca xcaVar, yjr yjrVar, armf armfVar, orj orjVar) {
        this.d = xcaVar;
        this.a = yjrVar;
        this.c = armfVar;
        this.b = orjVar;
    }

    public lfl(yjv yjvVar, armf armfVar, armf armfVar2) {
        this.a = xze.g("Bugle", "HomeScreenMenuHandler");
        this.c = yjvVar;
        this.d = armfVar;
        this.b = armfVar2;
    }

    public lfl(aiwu aiwuVar, armf armfVar, arwe arweVar, ahlp ahlpVar) {
        aiwuVar.getClass();
        armfVar.getClass();
        arweVar.getClass();
        ahlpVar.getClass();
        this.b = aiwuVar;
        this.a = armfVar;
        this.c = arweVar;
        this.d = ahlpVar;
    }

    public lfl(Set set, uac uacVar, ahiy ahiyVar) {
        set.getClass();
        ahiyVar.getClass();
        this.d = set;
        this.c = uacVar;
        this.b = ahiyVar;
        this.a = new AtomicBoolean(false);
    }

    public lfl(byte[] bArr) {
        this.a = ascy.a(new jyz(brg.a, brg.a));
        ascd a = ascy.a(false);
        this.b = a;
        this.c = a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        arng arngVar = new arng(jza.d);
        while (arngVar.hasNext()) {
            linkedHashMap.put((jza) arngVar.next(), ascy.a(false));
        }
        this.d = linkedHashMap;
    }

    public lfl(armf armfVar, armf armfVar2) {
        this.a = new vl();
        this.b = new vl();
        new vl();
        this.c = armfVar;
        this.d = armfVar2;
    }

    public lfl(arwe arweVar, asai asaiVar, armf armfVar, lkd lkdVar) {
        arweVar.getClass();
        asaiVar.getClass();
        armfVar.getClass();
        lkdVar.getClass();
        this.d = arweVar;
        this.a = asaiVar;
        this.b = armfVar;
        this.c = lkdVar;
    }

    public lfl() {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversations._id";
        a.c = new wsy();
        this.c = new lcu(a.a());
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.c(true);
        a2.a = "conversations.sort_timestamp";
        a2.c = new wsy();
        this.b = new lcu(a2.a());
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.c(true);
        a3.a = "conversations.sms_thread_id";
        a3.c = new wsy();
        a3.a();
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "conversations.name";
        a4.c = new wsy();
        a4.a();
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "conversations.name_is_automatic";
        a5.c = new wsy();
        a5.a();
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "conversations.subtitle";
        a6.c = new wsy();
        a6.a();
        agmi a7 = agmk.a();
        a7.d = 1;
        a7.a = "conversations.latest_message_id";
        a7.c = new wsy();
        this.a = new lcu(a7.a());
        agmi a8 = agmk.a();
        a8.d = 4;
        a8.a = "conversations.snippet_text";
        a8.c = new wsy();
        a8.a();
        agmi a9 = agmk.a();
        a9.d = 4;
        a9.a = "conversations.subject_text";
        a9.c = new wsy();
        a9.a();
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "conversations.preview_uri";
        a10.c = new wsy();
        a10.a();
        agmi a11 = agmk.a();
        a11.d = 4;
        a11.a = "conversations.preview_content_type";
        a11.c = new wsy();
        a11.a();
        agmi a12 = agmk.a();
        a12.d = 1;
        a12.a = "conversations.show_draft";
        a12.c = new wsy();
        a12.a();
        agmi a13 = agmk.a();
        a13.d = 4;
        a13.a = "conversations.draft_snippet_text";
        a13.c = new wsy();
        a13.a();
        agmi a14 = agmk.a();
        a14.d = 4;
        a14.a = "conversations.draft_subject_text";
        a14.c = new wsy();
        a14.a();
        agmi a15 = agmk.a();
        a15.d = 4;
        a15.a = "conversations.draft_preview_uri";
        a15.c = new wsy();
        a15.a();
        agmi a16 = agmk.a();
        a16.d = 4;
        a16.a = "conversations.draft_preview_content_type";
        a16.c = new wsy();
        a16.a();
        agmi a17 = agmk.a();
        a17.d = 1;
        a17.a = "conversations.etouffee_default";
        a17.c = new wsy();
        a17.a();
        agmi a18 = agmk.a();
        a18.d = 1;
        a18.c(true);
        a18.a = "conversations.archive_status";
        a18.c = new wsy();
        a18.a();
        agmi a19 = agmk.a();
        a19.d = 1;
        a19.a = "conversations.last_read_timestamp";
        a19.c = new wsy();
        a19.a();
        agmi a20 = agmk.a();
        a20.d = 4;
        a20.a = "conversations.icon";
        a20.c = new wsy();
        a20.a();
        agmi a21 = agmk.a();
        a21.d = 1;
        a21.a = "conversations.participant_contact_id";
        a21.c = new wsy();
        a21.a();
        agmi a22 = agmk.a();
        a22.d = 1;
        a22.a = "conversations.normalized_participant_contact_id";
        a22.c = new wsy();
        a22.a();
        agmi a23 = agmk.a();
        a23.d = 4;
        a23.a = "conversations.participant_lookup_key";
        a23.c = new wsy();
        a23.a();
        agmi a24 = agmk.a();
        a24.d = 4;
        a24.a = "conversations.normalized_participant_lookup_key";
        a24.c = new wsy();
        a24.a();
        agmi a25 = agmk.a();
        a25.d = 4;
        a25.c(true);
        a25.a = "conversations.participant_normalized_destination";
        a25.c = new wsy();
        a25.a();
        agmi a26 = agmk.a();
        a26.d = 4;
        a26.j(true);
        a26.c(true);
        a26.a = "conversations.participant_comparable_destination";
        a26.e(true);
        a26.c = new wsy();
        a26.a();
        agmi a27 = agmk.a();
        a27.d = 4;
        a27.a = "conversations.current_self_id";
        a27.c = new wsy();
        a27.a();
        agmi a28 = agmk.a();
        a28.d = 4;
        a28.a = "conversations.current_my_identity";
        a28.c = new wsy();
        a28.a();
        agmi a29 = agmk.a();
        a29.d = 4;
        a29.c(true);
        a29.d(true);
        a29.b = new lbx(18);
        a29.a = "conversations.current_my_identity_foreign_key";
        a29.c = new wsy();
        a29.a();
        agmi a30 = agmk.a();
        a30.d = 4;
        a30.c(true);
        a30.d(true);
        a30.b = new lbx(19);
        a30.a = "conversations.destination_token";
        a30.c = new wsy();
        a30.a();
        agmi a31 = agmk.a();
        a31.d = 1;
        a31.a = "conversations.participant_count";
        a31.c = new wsy();
        a31.a();
        agmi a32 = agmk.a();
        a32.d = 1;
        a32.a = "conversations.notification_enabled";
        a32.c = new wsy();
        a32.a();
        agmi a33 = agmk.a();
        a33.d = 4;
        a33.a = "conversations.notification_sound_uri";
        a33.c = new wsy();
        a33.a();
        agmi a34 = agmk.a();
        a34.d = 1;
        a34.a = "conversations.notification_vibration";
        a34.c = new wsy();
        a34.a();
        agmi a35 = agmk.a();
        a35.d = 1;
        a35.a = "conversations.include_email_addr";
        a35.c = new wsy();
        a35.a();
        agmi a36 = agmk.a();
        a36.d = 4;
        a36.a = "conversations.sms_service_center";
        a36.c = new wsy();
        a36.a();
        agmi a37 = agmk.a();
        a37.d = 4;
        a37.a = "conversations.participant_id_list";
        a37.c = new wsy();
        a37.a();
        agmi a38 = agmk.a();
        a38.d = 4;
        a38.j(true);
        a38.c(true);
        a38.a = "conversations.normalized_participant_id_list";
        a38.e(true);
        a38.c = new wsy();
        a38.a();
        agmi a39 = agmk.a();
        a39.d = 1;
        a39.a = "conversations.source_type";
        a39.c = new wsy();
        a39.a();
        agmi a40 = agmk.a();
        a40.d = 1;
        a40.c(true);
        a40.a = "conversations.rcs_session_id";
        a40.c = new wsy();
        a40.a();
        agmi a41 = agmk.a();
        a41.d = 1;
        a41.a = "conversations.join_state";
        a41.c = new wsy();
        a41.a();
        agmi a42 = agmk.a();
        a42.d = 1;
        a42.a = "conversations.conv_type";
        a42.c = new wsy();
        a42.a();
        agmi a43 = agmk.a();
        a43.d = 1;
        a43.a = "conversations.send_mode";
        a43.c = new wsy();
        a43.a();
        agmi a44 = agmk.a();
        a44.d = 1;
        a44.a = "conversations.IS_ENTERPRISE";
        a44.c = new wsy();
        a44.a();
        agmi a45 = agmk.a();
        a45.d = 1;
        a45.a = "conversations.has_ea2p_bot_recipient";
        a45.c = new wsy();
        a45.a();
        agmi a46 = agmk.a();
        a46.d = 1;
        a46.a = "conversations.last_interactive_event_timestamp";
        a46.c = new wsy();
        a46.a();
        agmi a47 = agmk.a();
        a47.d = 4;
        a47.a = "conversations.participant_display_destination";
        a47.c = new wsy();
        a47.a();
        agmi a48 = agmk.a();
        a48.d = 4;
        a48.a = "conversations.normalized_participant_display_destination";
        a48.c = new wsy();
        a48.a();
        agmi a49 = agmk.a();
        a49.d = 1;
        a49.a = "conversations.spam_warning_dismiss_status";
        a49.c = new wsy();
        a49.a();
        agmi a50 = agmk.a();
        a50.d = 1;
        a50.a = "conversations.open_count";
        a50.c = new wsy();
        a50.a();
        agmi a51 = agmk.a();
        a51.d = 1;
        a51.a = "conversations.last_logged_scooby_metadata_timestamp";
        a51.c = new wsy();
        a51.a();
        agmi a52 = agmk.a();
        a52.d = 1;
        a52.c(true);
        a52.a = "conversations.delete_timestamp";
        a52.c = new wsy();
        a52.a();
        agmi a53 = agmk.a();
        a53.d = 4;
        a53.j(true);
        a53.c(true);
        a53.a = "conversations.cms_id";
        a53.e(true);
        a53.c = new wsy();
        a53.a();
        agmi a54 = agmk.a();
        a54.d = 4;
        a54.c(true);
        a54.a = "conversations.rcs_group_id";
        a54.c = new wsy();
        a54.a();
        agmi a55 = agmk.a();
        a55.d = 4;
        a55.a = "conversations.rcs_conference_uri";
        a55.c = new wsy();
        a55.a();
        agmi a56 = agmk.a();
        a56.d = 5;
        a56.a = "conversations.tachygram_group_routing_info_token";
        a56.c = new wsy();
        a56.a();
        agmi a57 = agmk.a();
        a57.d = 1;
        a57.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        a57.c = new wsy();
        a57.a();
        agmi a58 = agmk.a();
        a58.d = 2;
        a58.a = "conversations.rcs_subject_change_timestamp_ms";
        a58.c = new wsy();
        a58.a();
        agmi a59 = agmk.a();
        a59.d = 1;
        a59.a = "conversations.rcs_session_allows_revocation";
        a59.c = new wsy();
        a59.a();
        agmi a60 = agmk.a();
        a60.d = 2;
        a60.a = "conversations.rcs_group_capabilities";
        a60.c = new wsy();
        a60.a();
        agmi a61 = agmk.a();
        a61.d = 1;
        a61.a = "conversations.awaiting_reverse_sync";
        a61.c = new wsy();
        a61.a();
        agmi a62 = agmk.a();
        a62.d = 2;
        a62.c(true);
        a62.d(true);
        a62.b = new lbx(20);
        a62.a = "conversations.duplicate_of";
        a62.c = new wsy();
        a62.a();
        agmi a63 = agmk.a();
        a63.d = 2;
        a63.c(true);
        a63.d(true);
        a63.b = new lct(1);
        a63.a = "conversations.new_duplicate_of";
        a63.c = new wsy();
        a63.a();
        agmi a64 = agmk.a();
        a64.d = 1;
        a64.a = "conversations.error_state";
        a64.c = new wsy();
        a64.a();
        agmi a65 = agmk.a();
        a65.d = 1;
        a65.a = "conversations.cms_life_cycle";
        a65.c = new wsy();
        a65.a();
        agmi a66 = agmk.a();
        a66.d = 4;
        a66.a = "conversations.rcs_group_self_msisdn";
        a66.c = new wsy();
        a66.a();
        agmi a67 = agmk.a();
        a67.d = 2;
        a67.a = "conversations.recipient_offline_timestamp_ms";
        a67.c = new wsy();
        a67.a();
        agmi a68 = agmk.a();
        a68.d = 2;
        a68.a = "conversations.rcs_group_last_sync_timestamp";
        a68.c = new wsy();
        a68.a();
        agmi a69 = agmk.a();
        a69.d = 1;
        a69.a = "conversations.has_been_e2ee";
        a69.c = new wsy();
        a69.a();
        agmi a70 = agmk.a();
        a70.d = 1;
        a70.a = "conversations.marked_as_unread";
        a70.c = new wsy();
        a70.a();
        agmi a71 = agmk.a();
        a71.d = 5;
        a71.a = "conversations.custom_theme";
        a71.c = new wsy();
        a71.a();
        agmi a72 = agmk.a();
        a72.d = 2;
        a72.a = "conversations.mms_group_upgrade_status";
        a72.c = new wsy();
        a72.a();
        agmi a73 = agmk.a();
        a73.d = 2;
        a73.a = "conversations.mms_group_upgrade_retries";
        a73.c = new wsy();
        a73.a();
        agmi a74 = agmk.a();
        a74.d = 2;
        a74.a = "conversations.encryption_protocol";
        a74.c = new wsy();
        a74.a();
        agmi a75 = agmk.a();
        a75.d = 4;
        a75.a = "conversations.encryption_id";
        a75.c = new wsy();
        a75.a();
        agmi a76 = agmk.a();
        a76.d = 4;
        a76.j(true);
        a76.c(true);
        a76.a = "conversations.cms_correlation_id";
        a76.e(true);
        a76.c = new wsy();
        a76.a();
        agmi a77 = agmk.a();
        a77.d = 2;
        a77.a = "conversation_pin.pin_status";
        a77.c = new wsy();
        this.d = new lcu(a77.a());
        agmi a78 = agmk.a();
        a78.d = 2;
        a78.j(true);
        a78.f(true);
        a78.c(true);
        a78.a = "conversation_pin._id";
        a78.c = new wsy();
        a78.a();
        agmi a79 = agmk.a();
        a79.d = 2;
        a79.j(true);
        a79.c(true);
        a79.d(true);
        a79.b = new lct(0);
        a79.a = "conversation_pin.conversation_id";
        a79.e(true);
        a79.c = new wsy();
        a79.a();
    }

    public lfl(Context context, rtp rtpVar, armf armfVar, armf armfVar2) {
        context.getClass();
        rtpVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = context;
        this.b = rtpVar;
        this.c = armfVar;
        this.d = armfVar2;
    }

    public lfl(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        armfVar6.getClass();
    }

    public lfl(nei neiVar, kcc kccVar, kbq kbqVar, armf armfVar) {
        neiVar.getClass();
        armfVar.getClass();
        this.d = neiVar;
        this.b = kccVar;
        this.a = kbqVar;
        this.c = armfVar;
    }

    public lfl(armf armfVar, armf armfVar2, obp obpVar) {
        armfVar.getClass();
        armfVar2.getClass();
        this.c = armfVar;
        this.b = armfVar2;
        this.a = obpVar;
        this.d = ascy.a(false);
    }

    public lfl(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
    }

    public lfl(armf armfVar, lgc lgcVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.c = armfVar;
        this.a = lgcVar;
        this.d = armfVar2;
        int i = alog.d;
        this.b = alsx.a;
    }

    public lfl(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
    }

    public lfl(xnv xnvVar, wfh wfhVar, ConversationId conversationId) {
        this.d = xnvVar;
        this.c = conversationId;
        this.a = new ConcurrentHashMap();
        this.b = wfhVar.Y(new mwr(1));
    }

    public lfl(xqc xqcVar, arwe arweVar) {
        xqcVar.getClass();
        arweVar.getClass();
        this.b = xqcVar;
        this.a = arweVar;
        this.d = new LruCache(30);
        this.c = new LruCache(30);
    }

    public lfl(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
    }

    public lfl(char[] cArr) {
        this.a = uuh.e(uuh.b, "initial_page_size", 60);
        this.d = uuh.e(uuh.b, "scrolling_page_size", 20);
        this.b = uuh.e(uuh.b, "max_page_data_size", 5000);
        this.c = uuh.e(uuh.b, "preload_page_size", 20);
    }

    public lfl(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
    }

    public lfl(arwe arweVar, muu muuVar, ifs ifsVar, alor alorVar) {
        arweVar.getClass();
        ifsVar.getClass();
        alorVar.getClass();
        this.a = arweVar;
        this.b = muuVar;
        this.c = ifsVar;
        this.d = alorVar;
    }

    public lfl(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }

    public lfl(lfk lfkVar, armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.a = lfkVar;
        this.b = armfVar;
        this.c = armfVar2;
        arml b = armd.b(3, new kjm(new kjm(lfkVar, 11), 12));
        int i = arsc.a;
        this.d = new eot(new arrh(MessageDetailsViewModel.class), new kjm(b, 13), new kfq(lfkVar, b, 9), new kjm(b, 14));
    }

    public lfl(lgd lgdVar, aksr aksrVar, lgg lggVar, armf armfVar) {
        lgdVar.getClass();
        aksrVar.getClass();
        lggVar.getClass();
        armfVar.getClass();
        this.c = lgdVar;
        this.b = aksrVar;
        this.a = lggVar;
        this.d = armfVar;
    }

    public lfl(arpi arpiVar, arwe arweVar, armf armfVar, jxv jxvVar) {
        arpiVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        jxvVar.getClass();
        this.b = arpiVar;
        this.d = arweVar;
        this.a = armfVar;
        this.c = jxvVar;
    }

    public lfl(iew iewVar, lfl lflVar, armf armfVar, armf armfVar2) {
        lflVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.d = iewVar;
        this.c = lflVar;
        this.b = armfVar;
        this.a = armfVar2;
    }

    public lfl(yjy yjyVar, adtn adtnVar, TelephonyManager telephonyManager) {
        this.a = new alig().f(new asqc(this, null));
        this.c = yjyVar;
        this.b = adtnVar;
        this.d = telephonyManager;
    }

    public lfl(mbu mbuVar) {
        amrs amrsVar;
        amrs amrsVar2;
        amfp amfpVar;
        amfp amfpVar2;
        mbuVar.getClass();
        this.a = mbuVar;
        aros arosVar = new aros();
        for (mbi mbiVar : mbuVar.e) {
            for (mbg mbgVar : mbiVar.c) {
                if (mbgVar.b == 1) {
                    amfp b = amfp.b(((Integer) mbgVar.c).intValue());
                    if (arosVar.containsKey(b == null ? amfp.UNKNOWN_BUGLE_EVENT_TYPE : b)) {
                        if (mbgVar.b == 1) {
                            amfpVar = amfp.b(((Integer) mbgVar.c).intValue());
                            if (amfpVar == null) {
                                amfpVar = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
                            }
                        } else {
                            amfpVar = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
                        }
                        Objects.toString(amfpVar);
                        throw new IllegalArgumentException("Multiple QoS tiers found for event type: ".concat(String.valueOf(amfpVar)));
                    }
                    if (mbgVar.b == 1) {
                        amfpVar2 = amfp.b(((Integer) mbgVar.c).intValue());
                        if (amfpVar2 == null) {
                            amfpVar2 = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
                        }
                    } else {
                        amfpVar2 = amfp.UNKNOWN_BUGLE_EVENT_TYPE;
                    }
                    amfpVar2.getClass();
                    apwa b2 = apwa.b(mbiVar.b);
                    b2 = b2 == null ? apwa.DEFAULT : b2;
                    b2.getClass();
                    arosVar.put(amfpVar2, b2);
                }
            }
        }
        this.b = arosVar.e();
        aros arosVar2 = new aros();
        for (mbi mbiVar2 : ((mbu) this.a).e) {
            for (mbg mbgVar2 : mbiVar2.c) {
                if (mbgVar2.b == 2) {
                    amrs b3 = amrs.b(((Integer) mbgVar2.c).intValue());
                    if (arosVar2.containsKey(b3 == null ? amrs.UNKNOWN_BUGLE_EVENT_CODE : b3)) {
                        if (mbgVar2.b == 2) {
                            amrsVar = amrs.b(((Integer) mbgVar2.c).intValue());
                            if (amrsVar == null) {
                                amrsVar = amrs.UNKNOWN_BUGLE_EVENT_CODE;
                            }
                        } else {
                            amrsVar = amrs.UNKNOWN_BUGLE_EVENT_CODE;
                        }
                        Objects.toString(amrsVar);
                        throw new IllegalArgumentException("Multiple QoS tiers found for event code: ".concat(String.valueOf(amrsVar)));
                    }
                    if (mbgVar2.b == 2) {
                        amrsVar2 = amrs.b(((Integer) mbgVar2.c).intValue());
                        if (amrsVar2 == null) {
                            amrsVar2 = amrs.UNKNOWN_BUGLE_EVENT_CODE;
                        }
                    } else {
                        amrsVar2 = amrs.UNKNOWN_BUGLE_EVENT_CODE;
                    }
                    amrsVar2.getClass();
                    apwa b4 = apwa.b(mbiVar2.b);
                    b4 = b4 == null ? apwa.DEFAULT : b4;
                    b4.getClass();
                    arosVar2.put(amrsVar2, b4);
                }
            }
        }
        this.d = arosVar2.e();
        apax apaxVar = ((mbu) this.a).e;
        apaxVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : apaxVar) {
            if (((mbi) obj).c.size() == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            apwa b5 = apwa.b(((mbi) it.next()).b);
            if (b5 == null) {
                b5 = apwa.DEFAULT;
            }
            arrayList2.add(b5);
        }
        this.c = (apwa) alzz.aQ(arrayList2, apwa.DEFAULT);
    }

    public lfl(xnv xnvVar, armf armfVar, armf armfVar2) {
        this.a = xnvVar;
        this.b = armfVar2;
        byte[] bArr = null;
        this.d = albo.D(new fgh(armfVar2, armfVar, 6, bArr));
        this.c = albo.D(new fgh(armfVar2, armfVar, 7, bArr));
    }

    public lfl(apwt apwtVar, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5) {
        apwtVar.getClass();
        apwtVar2.getClass();
        apwtVar3.getClass();
        apwtVar4.getClass();
        apwtVar5.getClass();
        this.d = apwtVar;
        this.c = apwtVar2;
        this.a = apwtVar4;
        this.b = apwtVar5;
    }
}
