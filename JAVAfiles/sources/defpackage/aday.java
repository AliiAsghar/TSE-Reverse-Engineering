package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aday {
    public final Object a;
    public final Object b;

    public aday(agny agnyVar, agpw agpwVar) {
        this.b = agpwVar;
        this.a = agnyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object L(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeed
            if (r0 == 0) goto L13
            r0 = r5
            aeed r0 = (defpackage.aeed) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeed r0 = new aeed
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            aedx r5 = (defpackage.aedx) r5
            long r4 = r5.d
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.L(aday, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object M(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeee
            if (r0 == 0) goto L13
            r0 = r5
            aeee r0 = (defpackage.aeee) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeee r0 = new aeee
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 == r1) goto L4d
        L3a:
            r4 = r5
            aedx r4 = (defpackage.aedx) r4
            int r4 = r4.b
            r4 = r4 & 256(0x100, float:3.59E-43)
            r0 = 0
            if (r4 != 0) goto L45
            r5 = r0
        L45:
            aedx r5 = (defpackage.aedx) r5
            if (r5 == 0) goto L4c
            aozb r4 = r5.k
            return r4
        L4c:
            return r0
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.M(aday, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object N(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeef
            if (r0 == 0) goto L13
            r0 = r5
            aeef r0 = (defpackage.aeef) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeef r0 = new aeef
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            aedx r5 = (defpackage.aedx) r5
            long r4 = r5.c
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.N(aday, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object O(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeeg
            if (r0 == 0) goto L13
            r0 = r5
            aeeg r0 = (defpackage.aeeg) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeeg r0 = new aeeg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 == r1) goto L51
        L3a:
            r4 = r5
            aedx r4 = (defpackage.aedx) r4
            int r4 = r4.b
            r4 = r4 & 64
            r0 = 0
            if (r4 != 0) goto L45
            r5 = r0
        L45:
            aedx r5 = (defpackage.aedx) r5
            if (r5 == 0) goto L50
            long r4 = r5.i
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
        L50:
            return r0
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.O(aday, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object P(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeeh
            if (r0 == 0) goto L13
            r0 = r5
            aeeh r0 = (defpackage.aeeh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeeh r0 = new aeeh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 == r1) goto L46
        L3a:
            aedx r5 = (defpackage.aedx) r5
            apct r4 = r5.e
            if (r4 != 0) goto L42
            apct r4 = defpackage.apct.a
        L42:
            r4.getClass()
            return r4
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.P(aday, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object Q(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeei
            if (r0 == 0) goto L13
            r0 = r5
            aeei r0 = (defpackage.aeei) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeei r0 = new aeei
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 == r1) goto L4d
        L3a:
            r4 = r5
            aedx r4 = (defpackage.aedx) r4
            int r4 = r4.b
            r4 = r4 & 8
            r0 = 0
            if (r4 != 0) goto L45
            r5 = r0
        L45:
            aedx r5 = (defpackage.aedx) r5
            if (r5 == 0) goto L4c
            aozb r4 = r5.f
            return r4
        L4c:
            return r0
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.Q(aday, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object R(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeej
            if (r0 == 0) goto L13
            r0 = r5
            aeej r0 = (defpackage.aeej) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeej r0 = new aeej
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            aedx r5 = (defpackage.aedx) r5
            long r4 = r5.h
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.R(aday, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object S(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeek
            if (r0 == 0) goto L13
            r0 = r5
            aeek r0 = (defpackage.aeek) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeek r0 = new aeek
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            aedx r5 = (defpackage.aedx) r5
            boolean r4 = r5.l
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.S(aday, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object T(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeel
            if (r0 == 0) goto L13
            r0 = r5
            aeel r0 = (defpackage.aeel) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeel r0 = new aeel
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 == r1) goto L4d
        L3a:
            r4 = r5
            aedx r4 = (defpackage.aedx) r4
            int r4 = r4.b
            r4 = r4 & 1024(0x400, float:1.435E-42)
            r0 = 0
            if (r4 != 0) goto L45
            r5 = r0
        L45:
            aedx r5 = (defpackage.aedx) r5
            if (r5 == 0) goto L4c
            java.lang.String r4 = r5.m
            return r4
        L4c:
            return r0
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.T(aday, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object U(defpackage.aday r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.aeem
            if (r0 == 0) goto L13
            r0 = r5
            aeem r0 = (defpackage.aeem) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeem r0 = new aeem
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            r0.b = r3
            java.lang.Object r5 = r4.E(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            aedx r5 = (defpackage.aedx) r5
            boolean r4 = r5.n
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.U(aday, arpe):java.lang.Object");
    }

    private static final String ac(String str) {
        return str.replaceAll("[:/?#\\[\\]@=;&$+!*'(),]", "");
    }

    public static admw b() {
        return admx.a(apkn.RCS_PROVISIONING_UNKNOWN_STATE, Optional.empty());
    }

    public static String c(String str) {
        URL url = new URL(str);
        if (!url.getProtocol().equals("https")) {
            if (url.getProtocol().equals("http")) {
                if (!((Boolean) acqa.e.a()).booleanValue()) {
                    return str.replace("http:", "https:");
                }
            } else {
                advr.g("Error converting [%s] to secure link", str);
                throw new MalformedURLException(a.bW(str, "Only HTTPS or HTTP protocols are allowed in the URL [", "]"));
            }
        }
        return str;
    }

    static final void d(Uri.Builder builder, admw admwVar, String str, String str2, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (str2 == null) {
                str2 = "";
            } else if (str2.length() > i) {
                str2 = str2.substring(0, i);
            }
            builder.appendQueryParameter(str, str2);
            admwVar.c(str, str2);
            return;
        }
        throw new IllegalArgumentException("Parameter name must not be empty");
    }

    static final void e(Uri.Builder builder, admw admwVar, String str) {
        if (TextUtils.isEmpty(null)) {
            return;
        }
        d(builder, admwVar, str, null, 15);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    public final void A(aefs aefsVar) {
        albo.U(!this.b.contains(aefsVar), "The same fixer cannot be added twice");
        this.b.add(aefsVar);
    }

    public final aefk B() {
        albo.U(true, "AppDoctorLogger must be set");
        return new aefk(this);
    }

    public final Object C(arqr arqrVar, arpe arpeVar) {
        Object d = arwi.d(new adzx(this, arqrVar, (arpe) null, 4), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    public final Object D(arpe arpeVar) {
        Object C = C(aedh.c, arpeVar);
        if (C == arpl.a) {
            return C;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aeeo
            if (r0 == 0) goto L13
            r0 = r6
            aeeo r0 = (defpackage.aeeo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeeo r0 = new aeeo
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.aqil.P(r6)
            zcb r6 = new zcb
            r2 = 0
            r4 = 20
            r6.<init>(r5, r2, r4)
            r0.b = r3
            java.lang.Object r6 = defpackage.arwi.d(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.E(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final agrr F(List list) {
        aefr aefrVar;
        aefs aefsVar;
        aefu aefuVar;
        agrr agrrVar = new agrr(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                aefrVar = (aefr) ((ListenableFuture) it.next()).get();
                Object obj = this.a;
                if (obj != null) {
                    try {
                        aefu aefuVar2 = aefrVar.c;
                        if (aefuVar2 != null && (aefsVar = aefrVar.b) != null) {
                            int i = aefuVar2.a(aefsVar.c).b;
                            Object obj2 = ((aoij) obj).c;
                            if (i == 5) {
                                String str = aefrVar.b.b;
                                Bundle a = ((aefm) obj2).a();
                                a.putString("com.google.android.gms.common.appdoctor.uuid", str);
                                ((aefm) obj2).b.call("mark_fix_completed", null, a);
                            } else {
                                aefrVar.c.a(aefrVar.b.c);
                                String str2 = aefrVar.b.b;
                                Bundle a2 = ((aefm) obj2).a();
                                a2.putString("com.google.android.gms.common.appdoctor.uuid", str2);
                                ((aefm) obj2).b.call("mark_fix_attempted", null, a2);
                            }
                        }
                        Log.e("AppDoctor", "Null CompletionResult from Fixer.");
                    } catch (RemoteException unused) {
                        Object obj3 = ((aoij) obj).b;
                        aozy createBuilder = abkf.a.createBuilder();
                        abjr abjrVar = aefrVar.b.c;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ((abkf) createBuilder.b).b = abjrVar.a();
                        String str3 = aefrVar.b.b;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        Context context = ((aefu) obj3).b;
                        Object obj4 = ((aoij) obj).a;
                        abkf abkfVar = (abkf) createBuilder.b;
                        str3.getClass();
                        abkfVar.d = str3;
                        ((aefk) obj4).e(context, (abkf) createBuilder.s(), ((aefu) obj3).a);
                    }
                }
                agrrVar.a |= aefrVar.b();
                agrrVar.b |= aefrVar.a();
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                Log.e("AppDoctorFixerFramework", "applyFixes future failed", e);
                Thread.currentThread().interrupt();
            }
            if (aefrVar.a() && (aefuVar = aefrVar.c) != null) {
                Context context2 = aefuVar.b;
                synchronized (aefx.class) {
                    Thread thread = aefx.a;
                    if (thread != null) {
                        thread.interrupt();
                    }
                    if (aefx.b != null) {
                        Log.d("AppDoctorRestartUtil", "A restart app timeout thread already started.");
                        aefx.b.getClass();
                    } else {
                        Thread thread2 = new Thread(new aefw(context2.getApplicationContext(), 0));
                        thread2.start();
                        aefx.a = thread2;
                        aefx.b = thread2;
                    }
                }
            } else if (aefrVar.b()) {
                synchronized (aefx.class) {
                    Thread thread3 = aefx.a;
                    if (thread3 != null && thread3.isAlive()) {
                        Log.d("AppDoctorRestartUtil", "A restart process timeout thread already started.");
                        aefx.a.getClass();
                    } else {
                        Thread thread4 = new Thread(new zth(14));
                        thread4.start();
                        aefx.a = thread4;
                    }
                }
            }
            Log.e("AppDoctorFixerFramework", "applyFixes future failed", e);
            Thread.currentThread().interrupt();
        }
        return agrrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G(defpackage.arqv r10, defpackage.arpe r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.aean
            if (r0 == 0) goto L13
            r0 = r11
            aean r0 = (defpackage.aean) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aean r0 = new aean
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r10 = r0.a
            defpackage.aqil.P(r11)     // Catch: java.lang.Throwable -> L29
            goto L93
        L29:
            r11 = move-exception
            goto L9e
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.aqil.P(r11)
            java.lang.Object r11 = r9.b
            aqui r2 = defpackage.aqui.a()
            java.util.List r2 = r2.b()
            boolean r4 = r2.isEmpty()
            r5 = 0
            if (r4 == 0) goto L4a
            r2 = 0
            goto L50
        L4a:
            java.lang.Object r2 = r2.get(r5)
            aqug r2 = (defpackage.aqug) r2
        L50:
            if (r2 == 0) goto La4
            ahjj r11 = (defpackage.ahjj) r11
            java.lang.Object r11 = r11.a
            java.lang.String r11 = (java.lang.String) r11
            aque r11 = r2.b(r11)
            java.lang.String r2 = "negative max"
            defpackage.d.t(r3, r2)
            r2 = r11
            ariy r2 = (defpackage.ariy) r2
            r4 = 104857600(0x6400000, float:3.6111186E-35)
            r2.j = r4
            aquc r11 = r11.a()
            java.lang.Object r2 = r9.a
            aotn r4 = new aotn
            aqrr r6 = defpackage.aqrr.a
            r4.<init>(r11, r6)
            aqrv[] r6 = new defpackage.aqrv[r3]
            arll r7 = new arll
            aqut r2 = (defpackage.aqut) r2
            r7.<init>(r2, r5)
            r6[r5] = r7
            arlb r2 = r4.i(r6)
            aotn r2 = (defpackage.aotn) r2
            r0.a = r11     // Catch: java.lang.Throwable -> L9a
            r0.c = r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r10 = r10.a(r2, r0)     // Catch: java.lang.Throwable -> L9a
            if (r10 == r1) goto L99
            r8 = r11
            r11 = r10
            r10 = r8
        L93:
            aquc r10 = (defpackage.aquc) r10
            r10.d()
            return r11
        L99:
            return r1
        L9a:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L9e:
            aquc r10 = (defpackage.aquc) r10
            r10.d()
            throw r11
        La4:
            aquf r10 = new aquf
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.G(arqv, arpe):java.lang.Object");
    }

    public final Object H(String str) {
        ((gtm) this.b).b(str);
        return arnb.a;
    }

    public final Object I(Document document, QName qName, XmlPullParser xmlPullParser) {
        adwz adwzVar = (adwz) ((alor) this.a).get(new QName(xmlPullParser.getNamespace(), xmlPullParser.getName()));
        if (adwzVar == null) {
            return adxb.d(document, xmlPullParser);
        }
        return adwzVar.a(document, qName, xmlPullParser);
    }

    public final void J(Object obj, XmlSerializer xmlSerializer) {
        adwz adwzVar = (adwz) ((alor) this.b).get(obj.getClass());
        if (adwzVar != null) {
            adwzVar.d(obj, xmlSerializer);
        } else if (obj instanceof Element) {
            adxb.f((Element) obj, xmlSerializer);
        } else if (obj instanceof adxa) {
            ((adxa) obj).c(xmlSerializer);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.lang.Object] */
    public final atkn K(aefu aefuVar) {
        ListenableFuture bj;
        agrr agrrVar;
        ListenableFuture bI;
        boolean z;
        agrr agrrVar2 = new agrr(null);
        try {
            alog<aefs> n = alog.n(this.b);
            ArrayList arrayList = new ArrayList(n.size());
            try {
                Iterator<E> it = n.iterator();
                while (it.hasNext()) {
                    if (((aefs) it.next()).a(aefuVar)) {
                        aday adayVar = new aday(aefuVar.b);
                        boolean z2 = false;
                        boolean z3 = false;
                        for (aefs aefsVar : n) {
                            aeft aeftVar = new aeft(aefuVar);
                            aeftVar.g = aefsVar;
                            aefu a = aeftVar.a();
                            if (!aefsVar.a(a)) {
                                bI = albo.bI(aefr.a);
                                z = false;
                            } else {
                                aeft aeftVar2 = new aeft(a);
                                aeftVar2.b(new aefq(aefsVar.e.a, 3));
                                aefu a2 = aeftVar2.a();
                                aefsVar.c(a2, aefsVar.e, adayVar);
                                if (aefsVar.f) {
                                    bI = aetn.bj(new xqt(aefsVar, a2, adayVar, 15, (byte[]) null));
                                } else {
                                    bI = albo.bI(aefsVar.b(a2, adayVar, aefsVar.e));
                                }
                                z = true;
                            }
                            z3 |= z;
                            z2 |= !bI.isDone();
                            arrayList.add(bI);
                        }
                        if (!z2) {
                            bj = albo.bI(null);
                            agrrVar = F(arrayList);
                        } else {
                            agrr agrrVar3 = new agrr(null);
                            try {
                                bj = aetn.bj(Executors.callable(new uju(this, agrrVar2, (List) arrayList, aefuVar, 9)));
                                agrrVar = agrrVar3;
                            } catch (Throwable th) {
                                th = th;
                                agrrVar2 = agrrVar3;
                                if (agrrVar2.b()) {
                                    agrrVar2.a(aefuVar.b);
                                }
                                throw th;
                            }
                        }
                        atkn atknVar = new atkn(z3, bj);
                        if (agrrVar.b()) {
                            agrrVar.a(aefuVar.b);
                        }
                        return atknVar;
                    }
                }
                atkn atknVar2 = new atkn(false, (Object) albo.bI(null));
                if (agrrVar2.b()) {
                    agrrVar2.a(aefuVar.b);
                }
                return atknVar2;
            } catch (RuntimeException e) {
                aetn.bi(e, aefuVar, "AppDoctorFixerFramework");
                atkn atknVar3 = new atkn(false, (Object) albo.bH(e));
                if (agrrVar2.b()) {
                    agrrVar2.a(aefuVar.b);
                }
                return atknVar3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int V() {
        ArrayList arrayList = new ArrayList();
        agny agnyVar = (agny) this.a;
        agnw d = agnc.d(agnyVar.d);
        adwp u = aglo.u();
        String str = agnyVar.a;
        Object obj = this.b;
        Integer a = agnb.a(str);
        if (a != null) {
            Log.i("D26R", "DELETE FROM " + str + " WHERE " + ((agpw) obj).a(agpo.b()));
            adwp.l(a.intValue());
        }
        aoij q = u.q(d, new rhq(str, obj, 11, null), new agom((agpw) obj));
        boolean z = false;
        int a2 = d.a(str, ((agpw) this.b).b(agpo.b(), arrayList), (String[]) arrayList.toArray(new String[0]), (agny) this.a);
        if (a2 > 0) {
            z = true;
        }
        q.a(z);
        return a2;
    }

    public final alog W() {
        agnw d;
        syb sybVar = (syb) this.b;
        d = agnc.d("$primary");
        return (alog) d.s("messages-deleteAndReturnDeletedRows-txn", new swp(sybVar, 15));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final int X() {
        return this.a.size();
    }

    public final boolean Y() {
        if (X() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final aglh Z(agle agleVar) {
        agli agliVar = new agli(agleVar);
        this.b.put(agleVar, agliVar);
        return agliVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final adax a(adrc adrcVar) {
        anen anenVar = (anen) this.a.b();
        adba adbaVar = (adba) this.b.b();
        adbaVar.getClass();
        adrcVar.getClass();
        return new adax(anenVar, adbaVar, adrcVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final ForegroundColorSpan aa() {
        return new ForegroundColorSpan(((Number) this.a.a()).intValue());
    }

    public final Object ab(String str, kkc kkcVar, gso gsoVar, boolean z, arpe arpeVar) {
        ((alvg) ((aluw) this.a).g().h("com/google/android/libraries/abuse/hades/moirai/download/DefaultWorkManagerWrapper", "beginUniqueWork", 62, "WorkManagerWrapper.kt")).t("PersephoneDownloadWorker is scheduled for request %s.", kkcVar.a);
        gti k = ((gtm) this.b).k(str, gsoVar, kkcVar);
        k.a();
        if (z) {
            gup gupVar = (gup) k;
            gvd gvdVar = gupVar.a;
            gyt A = gvdVar.e.A();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
            List list = gupVar.f;
            int size = list.size();
            gvf.bv(sb, size);
            sb.append(")");
            gih a = gih.a(sb.toString(), size);
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                a.g(i, (String) it.next());
                i++;
            }
            gzn gznVar = (gzn) A;
            ghv b = gznVar.a.b();
            String[] strArr = {"WorkTag", "WorkProgress", "workspec"};
            gzc gzcVar = new gzc(gznVar, a);
            b.c.f(strArr);
            ico icoVar = b.k;
            gik gikVar = new gik((gid) icoVar.b, icoVar, strArr, gzcVar);
            tb tbVar = gys.b;
            gpx gpxVar = gvdVar.l;
            Object obj = new Object();
            enx enxVar = new enx();
            gzt gztVar = new gzt(gpxVar, obj, tbVar, enxVar);
            enw enwVar = new enw(gikVar, gztVar);
            enw enwVar2 = (enw) enxVar.g.f(gikVar, enwVar);
            if (enwVar2 != null && enwVar2.b != gztVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (enwVar2 == null && enxVar.k()) {
                enwVar.b();
            }
            Object d = arwi.d(new adzx(enxVar, new fzj((arpe) null, 8, (char[][]) null), (arpe) null, 3), arpeVar);
            if (d == arpl.a) {
                return d;
            }
        }
        return arnb.a;
    }

    public final void f(String str, Configuration configuration, String str2, String str3, int i, adnw adnwVar, Optional optional) {
        if (str3 != null) {
            admw admwVar = (admw) optional.orElse(b());
            Uri.Builder z = z(str, configuration, adnwVar, new adtl(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE), admwVar);
            if (!TextUtils.isEmpty(str2)) {
                z.appendQueryParameter("msisdn", str2);
                admwVar.c("msisdn", str2);
            }
            z.appendQueryParameter("token", str3);
            admwVar.c("token", str3);
            z.appendQueryParameter("SMS_port", String.valueOf(i));
            admwVar.c("SMS_port", String.valueOf(i));
            admwVar.d(c(z.build().toString()));
            return;
        }
        throw new IllegalArgumentException("Token must not be null!");
    }

    public final int g(String str) {
        return j(str).getInt("provisioning_engine_replay_count_key", 0);
    }

    public final int h(String str) {
        return j(str).getInt("provisioning_engine_retry_count_key", 0);
    }

    public final SharedPreferences i() {
        return ((Context) this.a).getSharedPreferences("provisioning_engine_state_cache_common.pref", 0);
    }

    public final SharedPreferences j(String str) {
        return ((Context) this.a).getSharedPreferences(String.format("provisioning_engine_state_cache_%s.pref", str), 0);
    }

    public final anhz k(String str) {
        anhz anhzVar;
        int i = j(str).getInt("provisioning_engine_upi_eligibility_key", anhz.UPI_ELIGIBILITY_UNSPECIFIED.a());
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    anhzVar = null;
                } else {
                    anhzVar = anhz.INELIGIBLE;
                }
            } else {
                anhzVar = anhz.ELIGIBLE;
            }
        } else {
            anhzVar = anhz.UPI_ELIGIBILITY_UNSPECIFIED;
        }
        if (anhzVar != null) {
            return anhzVar;
        }
        return anhz.UPI_ELIGIBILITY_UNSPECIFIED;
    }

    @Deprecated
    public final Optional l(String str) {
        Configuration configuration = null;
        String string = j(str).getString("provisioning_engine_rcs_configuration", null);
        if (string != null && !string.equals("null")) {
            try {
                configuration = (Configuration) ((aonx) this.b).i(string, Configuration.class);
            } catch (aook e) {
                advr.i(e, "Failed to parse json.", new Object[0]);
            }
        }
        return Optional.ofNullable(configuration);
    }

    public final String m(String str) {
        return j(str).getString("provisioning_engine_provisioning_session_id_key", null);
    }

    public final String n(String str) {
        return j(str).getString("provisioning_engine_msisdn_key", null);
    }

    public final String o(String str) {
        if (w(str)) {
            advr.c("Already finished a provisioning attempt so no session ID available.", new Object[0]);
            return null;
        }
        return j(str).getString("provisioning_engine_provisioning_session_id_key", null);
    }

    public final String p(String str) {
        return j(str).getString("provisioning_engine_state_key", null);
    }

    public final void q(String str) {
        j(str).edit().putInt("provisioning_engine_replay_count_key", 0).commit();
    }

    public final void r(String str, boolean z) {
        j(str).edit().putBoolean("provisioning_engine_finished_provisioning_attempt_key", z).commit();
    }

    public final void s(String str, String str2) {
        j(str).edit().putString("provisioning_engine_msisdn_key", str2).commit();
    }

    public final void t(String str, String str2) {
        j(str).edit().putString("provisioning_engine_state_key", str2).commit();
    }

    public final void u(String str, anhz anhzVar) {
        j(str).edit().putInt("provisioning_engine_upi_eligibility_key", anhzVar.a()).commit();
    }

    @Deprecated
    public final boolean v() {
        return i().getBoolean("provisioning_engine_google_tos_consent_key", false);
    }

    public final boolean w(String str) {
        return j(str).getBoolean("provisioning_engine_finished_provisioning_attempt_key", false);
    }

    public final boolean x(String str) {
        return j(str).getBoolean("provisioning_engine_has_provisioned_once_key_v2", false);
    }

    public final Optional y(String str) {
        str.getClass();
        return Optional.ofNullable((adjl) ((ConcurrentHashMap) this.a).get(str));
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [armf, java.lang.Object] */
    public final Uri.Builder z(String str, Configuration configuration, adnw adnwVar, adtl adtlVar, admw admwVar) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Optional optional = admwVar.a;
        buildUpon.getClass();
        optional.ifPresent(new adlr(buildUpon, 9));
        aozy i = admwVar.i();
        if (!i.b.isMutable()) {
            i.u();
        }
        apig apigVar = (apig) i.b;
        apig apigVar2 = apig.a;
        str.getClass();
        apigVar.b |= 2;
        apigVar.d = str;
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((apig) admwVar.i().b).e)).entrySet()) {
            Iterator<E> it = ((apie) entry.getValue()).b.iterator();
            while (it.hasNext()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) it.next());
            }
        }
        buildUpon.appendQueryParameter("vers", Integer.toString(configuration.mVersion));
        admwVar.c("vers", Integer.toString(configuration.mVersion));
        if (aczv.U()) {
            int i2 = configuration.rcsState;
            buildUpon.appendQueryParameter("rcs_state", Integer.toString(i2));
            admwVar.c("rcs_state", Integer.toString(i2));
        }
        if (!TextUtils.isEmpty(adnwVar.e)) {
            buildUpon.appendQueryParameter("instance_id_token", adnwVar.e);
            admwVar.c("instance_id_token", adnwVar.e);
        }
        if (!TextUtils.isEmpty(adnwVar.f)) {
            buildUpon.appendQueryParameter("IMSI", adnwVar.f);
            admwVar.c("IMSI", adnwVar.f);
        }
        boolean z = true;
        if (!((acxz) this.b.b()).a() && adwt.g((Context) this.a).a.getPhoneType() != 1) {
            z = false;
        }
        if (!TextUtils.isEmpty(adnwVar.g) && z) {
            buildUpon.appendQueryParameter("IMEI", adnwVar.g);
            admwVar.c("IMEI", adnwVar.g);
        }
        if (!TextUtils.isEmpty(adnwVar.h)) {
            buildUpon.appendQueryParameter("device_type", adnwVar.h);
            admwVar.c("device_type", adnwVar.h);
        }
        d(buildUpon, admwVar, "terminal_model", ac((String) adtlVar.c), 10);
        d(buildUpon, admwVar, "terminal_vendor", ac((String) adtlVar.a), 4);
        d(buildUpon, admwVar, "terminal_sw_version", ac((String) adtlVar.b), 10);
        d(buildUpon, admwVar, "client_vendor", adnwVar.d, 4);
        d(buildUpon, admwVar, "client_version", adnwVar.c, 15);
        e(buildUpon, admwVar, "bugle_version");
        e(buildUpon, admwVar, "cs_version");
        d(buildUpon, admwVar, "rcs_profile", adnwVar.a, 15);
        d(buildUpon, admwVar, "rcs_version", adnwVar.b, 4);
        String str2 = (String) aduv.e.d();
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("provision_id", str2);
            admwVar.c("provision_id", str2);
        }
        return buildUpon;
    }

    public aday(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public aday(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public aday(aczn acznVar) {
        this.a = acznVar.i("enable", true);
        this.b = acznVar.h("google_platform_bot_regex", "@rbm[.]goog$");
    }

    public aday(Set set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Collection.EL.stream(set).forEach(new abid(hashMap, hashMap2, 13, null));
        this.a = alor.j(hashMap);
        this.b = alor.j(hashMap2);
    }

    public aday(aczo aczoVar) {
        this.a = aczoVar.i("enable_rbm_vodafone_platform", false);
        this.b = aczoVar.h("vodafone_platform_bot_regex", "@.+[.]vodafone[.]com$");
    }

    public aday(aczp aczpVar) {
        this.a = aczpVar.i("enable_carousels", true);
        this.b = aczpVar.i("enable_standalone_cards", true);
    }

    public aday() {
        this.a = new ConcurrentHashMap();
        this.b = new AtomicReference();
        new AtomicReference();
    }

    public aday(Context context, Optional optional) {
        context.getClass();
        optional.isPresent();
        this.b = gvf.ar(context);
        this.a = alvi.m("com/google/android/libraries/abuse/hades/moirai/download/DefaultWorkManagerWrapper");
    }

    public aday(ahjj ahjjVar, aqut aqutVar) {
        aqutVar.getClass();
        this.b = ahjjVar;
        this.a = aqutVar;
    }

    public aday(byte[] bArr, byte[] bArr2) {
        aefv aefvVar = new aefv(1);
        this.b = new alpr();
        this.a = aefvVar;
    }

    public aday(Context context) {
        atsg bk = aetn.bk(context);
        abgj abgjVar = accz.a;
        ExecutorService r = abgj.r(4);
        aiuz aiuzVar = new aiuz(context);
        aiuzVar.c("app_doctor");
        aiuzVar.d("AppDoctor.pb");
        Uri a = aiuzVar.a();
        aiwl a2 = aiwm.a();
        a2.e(a);
        a2.d(aegj.a);
        this.a = bk.n(a2.a());
        this.b = r;
    }

    public aday(aoij aoijVar) {
        this.b = new ArrayList();
        this.a = aoijVar;
    }

    public aday(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public aday(char[] cArr) {
        ascd a = ascy.a(new afrh(null));
        this.a = a;
        this.b = a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    public aday(adta adtaVar, adta adtaVar2, afvz afvzVar, arqg arqgVar) {
        arwe arweVar = (arwe) adtaVar2.a.b();
        arweVar.getClass();
        afwi afwiVar = new afwi(arweVar, afvzVar);
        this.a = afwiVar;
        agak agakVar = (agak) adtaVar.a.b();
        agakVar.getClass();
        this.b = new afwk(agakVar, afvzVar, afwiVar, arqgVar);
    }

    public aday(armf armfVar, armf armfVar2, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public aday(armf armfVar, armf armfVar2, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public aday(ViewGroup viewGroup) {
        this.b = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.shortcuts_screen_recycler_view);
        findViewById.getClass();
        this.a = (RecyclerView) findViewById;
    }

    public aday(armf armfVar, armf armfVar2, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public aday(adwo adwoVar) {
        this.a = adwoVar;
        this.b = new HashMap();
    }

    public aday(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public aday(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public aday(Context context, byte[] bArr) {
        context.getClass();
        this.a = armd.a(new agef(context, 3));
        this.b = armd.a(new agef(context, 4));
    }

    public aday(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public aday(Executor executor) {
        this.b = new ConcurrentHashMap();
        this.a = executor;
        Z(new agle("Main", 1, true)).e(Process.myPid());
    }
}
