package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsg {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public atsg(ansy ansyVar, Context context, ahiy ahiyVar, anen anenVar, aegu aeguVar, aksr aksrVar, Executor executor) {
        this.a = ansyVar;
        this.e = context;
        this.b = ahiyVar;
        this.f = anenVar;
        this.c = aeguVar;
        this.d = aksrVar;
        this.g = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if ("".equals(r4) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final j$.util.Optional f(java.lang.String r4) {
        /*
            java.lang.reflect.Method r0 = defpackage.aiur.a
            java.lang.String r0 = "debug."
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            r0 = 0
            java.lang.reflect.Method r1 = defpackage.aiur.a     // Catch: java.lang.Exception -> L27
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L27
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.Exception -> L27
            r4 = 1
            r2[r4] = r0     // Catch: java.lang.Exception -> L27
            java.lang.Object r4 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L30
            goto L2f
        L27:
            r4 = move-exception
            java.lang.String r1 = "SystemProperties"
            java.lang.String r2 = "get error"
            android.util.Log.e(r1, r2, r4)
        L2f:
            r4 = r0
        L30:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L3b
            j$.util.Optional r4 = j$.util.Optional.empty()
            goto L3f
        L3b:
            j$.util.Optional r4 = j$.util.Optional.of(r4)
        L3f:
            akyh r1 = new akyh
            r2 = 20
            r1.<init>(r2, r0)
            j$.util.Optional r4 = r4.map(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atsg.f(java.lang.String):j$.util.Optional");
    }

    private static final String[] v(akmy akmyVar) {
        try {
            return (String[]) Arrays.copyOf(akmyVar.f(), akmyVar.f().length, String[].class);
        } catch (ArrayStoreException e) {
            throw new IllegalArgumentException("AsyncContentResolver cannot be queried with a SafeSQLStatement containing byte array arguments. Only String arguments are allowed.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b3, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r8 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, arml] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ajwt r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.atsf
            if (r0 == 0) goto L13
            r0 = r8
            atsf r0 = (defpackage.atsf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            atsf r0 = new atsf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            defpackage.aqil.P(r8)
            goto Lad
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            atsg r7 = r0.d
            defpackage.aqil.P(r8)
            goto L53
        L3a:
            defpackage.aqil.P(r8)
            if (r7 == 0) goto Lb7
            java.lang.Object r8 = r6.c
            ahiy r8 = (defpackage.ahiy) r8
            com.google.common.util.concurrent.ListenableFuture r7 = r8.C(r7)
            r0.d = r6
            r0.b = r5
            java.lang.Object r8 = defpackage.arro.F(r7, r0)
            if (r8 != r1) goto L52
            goto Lb6
        L52:
            r7 = r6
        L53:
            ajza r8 = (defpackage.ajza) r8
            ajzb r8 = r8.b
            java.lang.String r8 = r8.i
            java.lang.String r2 = "pseudonymous"
            boolean r8 = defpackage.d.F(r8, r2)
            if (r8 == 0) goto L62
            goto Lb7
        L62:
            boolean r8 = defpackage.xxy.a()
            if (r8 != 0) goto L69
            goto Lb8
        L69:
            alhr r8 = defpackage.xyc.a
            java.lang.Object r8 = r8.get()
            utz r8 = (defpackage.utz) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L7e
            goto Lb8
        L7e:
            java.lang.Object r8 = r7.b
            j$.util.Optional r8 = (j$.util.Optional) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L89
            goto Lb8
        L89:
            java.lang.Object r8 = r7.f
            java.lang.Object r8 = r8.a()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L98
            goto Lb8
        L98:
            java.lang.Object r7 = r7.b
            j$.util.Optional r7 = (j$.util.Optional) r7
            java.lang.Object r7 = r7.get()
            xyc r7 = (defpackage.xyc) r7
            r8 = 0
            r0.d = r8
            r0.b = r3
            java.lang.Object r8 = r7.a()
            if (r8 == r1) goto Lb6
        Lad:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto Lb8
            goto Lb7
        Lb6:
            return r1
        Lb7:
            r4 = r5
        Lb8:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atsg.a(ajwt, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map, java.lang.Object] */
    public final synchronized ListenableFuture b() {
        if (!((AtomicBoolean) this.a).get()) {
            return aneh.a;
        }
        alor.j(this.f);
        ((AtomicBoolean) this.a).set(false);
        return ((anfg) ((Optional) this.c).orElseThrow()).a();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    public final Optional c(String str) {
        if (((Boolean) ((armf) ((Optional) this.e).orElse(new acss(this, 19))).b()).booleanValue()) {
            Optional optional = (Optional) Map.EL.computeIfAbsent(this.b, str, new allr(7));
            if (optional.isPresent()) {
                return optional;
            }
        }
        g();
        return Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    public final synchronized void d(String str, Optional optional) {
        g();
        d.s(false);
        d.s(((alpt) this.d).contains(str));
        if (f(str).isPresent()) {
            return;
        }
        this.f.put(str, optional);
        ((AtomicBoolean) this.a).set(true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public final boolean e(String str) {
        g();
        d.s(false);
        return ((Boolean) ((armf) Map.EL.getOrDefault(this.g, str, new ahjy(10))).b()).booleanValue();
    }

    public final void g() {
        ((Optional) this.c).isPresent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final andc h(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        strArr.getClass();
        uri.getClass();
        akeu akeuVar = new akeu(this, uri, strArr, str, strArr2, str2);
        int i = aixm.a;
        aixk aixkVar = new aixk(akeuVar);
        aixkVar.e((Executor) this.f);
        return andc.a(aixkVar, andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture i(akew akewVar) {
        return albo.bM(akto.k(new ahes(this, akewVar, 17, null)), this.f);
    }

    public final void j(Uri uri, boolean z, aker akerVar) {
        ((Context) this.e).getContentResolver().registerContentObserver(uri, z, akerVar);
    }

    public final void k(aker akerVar) {
        ((Context) this.e).getContentResolver().unregisterContentObserver(akerVar);
    }

    public final ListenableFuture l(Uri uri, Bundle bundle) {
        return i(new aket(uri, bundle, 1));
    }

    public final ListenableFuture m(final Uri uri, final ContentValues contentValues, final String str) {
        return i(new akew() { // from class: akes
            @Override // defpackage.akew
            public final Object a(ansy ansyVar) {
                Uri uri2 = uri;
                Integer num = (Integer) ansyVar.p(uri2, new akcd(uri2, contentValues, str, 1));
                num.intValue();
                return num;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [ancs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final synchronized aiwu n(aiwm aiwmVar) {
        aiwu aiwuVar;
        boolean z;
        String substring;
        boolean z2;
        boolean z3;
        ?? r0 = this.b;
        Uri uri = aiwmVar.a;
        aiwuVar = (aiwu) r0.get(uri);
        boolean z4 = true;
        if (aiwuVar == null) {
            Uri uri2 = aiwmVar.a;
            albo.N(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String ag = albo.ag(uri2.getLastPathSegment());
            int lastIndexOf = ag.lastIndexOf(46);
            if (lastIndexOf == -1) {
                substring = "";
            } else {
                substring = ag.substring(lastIndexOf + 1);
            }
            albo.N(substring.equals("pb"), "Uri extension must be .pb: %s", uri2);
            if (aiwmVar.b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            d.t(z2, "Proto schema cannot be null");
            if (aiwmVar.c != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            d.t(z3, "Handler cannot be null");
            aiwv aiwvVar = (aiwv) this.g.get("singleproc");
            if (aiwvVar == 0) {
                z4 = false;
            }
            albo.N(z4, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String ag2 = albo.ag(aiwmVar.a.getLastPathSegment());
            int lastIndexOf2 = ag2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                ag2 = ag2.substring(0, lastIndexOf2);
            }
            ListenableFuture g = ancj.g(albo.bI(aiwmVar.a), this.a, andi.a);
            aiws b = aiwvVar.b(aiwmVar, ag2, this.e, (agcp) this.f);
            aiwvVar.a();
            aiwu aiwuVar2 = new aiwu(b, g, false);
            alog alogVar = aiwmVar.d;
            if (!alogVar.isEmpty()) {
                aiwuVar2.d(new aiwk(alogVar, this.e));
            }
            this.b.put(uri, aiwuVar2);
            this.d.put(uri, aiwmVar);
            aiwuVar = aiwuVar2;
        } else {
            aiwm aiwmVar2 = (aiwm) this.d.get(uri);
            if (!aiwmVar.equals(aiwmVar2)) {
                String F = albo.F("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", aiwmVar.b.getClass().getSimpleName(), aiwmVar.a);
                albo.N(aiwmVar.a.equals(aiwmVar2.a), F, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                albo.N(aiwmVar.b.equals(aiwmVar2.b), F, "schema");
                albo.N(aiwmVar.c.equals(aiwmVar2.c), F, "handler");
                albo.N(alzz.at(aiwmVar.d, aiwmVar2.d), F, "migrations");
                albo.N(aiwmVar.f.equals(aiwmVar2.f), F, "variantConfig");
                if (aiwmVar.e == aiwmVar2.e) {
                    z = true;
                } else {
                    z = false;
                }
                albo.N(z, F, "useGeneratedExtensionRegistry");
                albo.N(true, F, "enableTracing");
                throw new IllegalArgumentException(albo.F(F, "unknown"));
            }
        }
        return aiwuVar;
    }

    public final ListenableFuture o() {
        albo.U(((ahyr) this.g).c(), "ApiConfig must be initialized.");
        return albo.bI(ahws.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, aegu] */
    public final acir p(aibl aiblVar, final int i) {
        if (!aiblVar.a.isEmpty()) {
            List list = aiblVar.b;
            if (list.isEmpty()) {
                return actx.r(new abra(new Status(9012, "Place fields must not be empty.")));
            }
            final long a = this.f.a();
            ArrayList arrayList = new ArrayList(ahxx.a(list));
            arrayList.add("attributions");
            String a2 = ahxe.a(arrayList, false, new ArrayList());
            final ListenableFuture o = o();
            ListenableFuture g = ancj.g(o, new xrd(this, a2, aiblVar, 13), andi.a);
            adae adaeVar = aiblVar.c;
            if (adaeVar != null) {
                adaeVar.g(new acdp(g, 7));
            }
            return agkx.g(g).e(new ahxq(this, 3)).c(new acig() { // from class: ahxu
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, aegu] */
                @Override // defpackage.acig
                public final Object a(acir acirVar) {
                    if (!((aciv) acirVar).c) {
                        ListenableFuture listenableFuture = o;
                        int i2 = i;
                        long j = a;
                        atsg atsgVar = atsg.this;
                        ((ahiy) atsgVar.c).h(acirVar, j, atsgVar.f.a(), 3, i2, (ahws) ((aneh) listenableFuture).b);
                    }
                    return acirVar;
                }
            });
        }
        return actx.r(new abra(new Status(9012, "Place id must not be an empty string.")));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final afdm q() {
        return (afdm) this.b.a();
    }

    public final Object r(Uri uri, arpe arpeVar) {
        return ((afva) this.f).b(new afho(this, uri, 7, null), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r2v4, types: [arwe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(android.net.Uri r18, defpackage.arpe r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.afuz
            if (r3 == 0) goto L19
            r3 = r2
            afuz r3 = (defpackage.afuz) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            afuz r3 = new afuz
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.b
            arpl r4 = defpackage.arpl.a
            int r5 = r3.c
            r6 = 4
            r7 = 3
            r8 = 1
            r9 = 2
            r10 = 0
            if (r5 == 0) goto L4a
            if (r5 == r8) goto L45
            if (r5 == r9) goto L3c
            if (r5 == r7) goto L45
            if (r5 != r6) goto L34
            goto L45
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            java.lang.Object r1 = r3.a
            atsg r5 = r3.e
            defpackage.aqil.P(r2)
            r12 = r5
            goto L83
        L45:
            defpackage.aqil.P(r2)
            goto Lc3
        L4a:
            defpackage.aqil.P(r2)
            afdm r2 = r17.q()
            boolean r2 = r2.a
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r0.g
            ikv r5 = new ikv
            r6 = 15
            r5.<init>(r0, r1, r10, r6)
            r3.c = r8
            afuu r2 = (defpackage.afuu) r2
            java.lang.Object r1 = r2.a(r5, r3)
            if (r1 != r4) goto L69
            goto Lc2
        L69:
            return r1
        L6a:
            r3.e = r0
            r3.a = r1
            r3.c = r9
            java.lang.Object r2 = r0.a
            arpi r2 = r2.b()
            afov r5 = new afov
            r5.<init>(r1, r0, r10, r9)
            java.lang.Object r2 = defpackage.arro.q(r2, r5, r3)
            if (r2 != r4) goto L82
            goto Lc2
        L82:
            r12 = r0
        L83:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lab
            r3.e = r10
            r3.a = r10
            r3.c = r7
            java.lang.Object r2 = r12.g
            ikv r5 = new ikv
            r13 = r1
            android.net.Uri r13 = (android.net.Uri) r13
            r15 = 16
            r16 = 0
            r14 = 0
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            afuu r2 = (defpackage.afuu) r2
            java.lang.Object r1 = r2.a(r5, r3)
            if (r1 != r4) goto Laa
            goto Lc2
        Laa:
            return r1
        Lab:
            java.lang.Object r2 = r12.g
            vvd r5 = new vvd
            android.net.Uri r1 = (android.net.Uri) r1
            r5.<init>(r12, r1, r10, r9)
            r3.e = r10
            r3.a = r10
            r3.c = r6
            afuu r2 = (defpackage.afuu) r2
            java.lang.Object r1 = r2.a(r5, r3)
            if (r1 != r4) goto Lc4
        Lc2:
            r2 = r4
        Lc3:
            return r2
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atsg.s(android.net.Uri, arpe):java.lang.Object");
    }

    public final Object t(Uri uri, arpe arpeVar) {
        return ((afva) this.e).b(new afho(this, uri, 8, null), arpeVar);
    }

    public final andc u(Uri uri, String[] strArr, akmy akmyVar) {
        strArr.getClass();
        uri.getClass();
        return h(uri, strArr, (String) ((agrk) akmyVar.a).a, v(akmyVar), null);
    }

    public atsg(Context context, afiz afizVar, afus afusVar, afuu afuuVar, afvb afvbVar, arwe arweVar, armf armfVar) {
        context.getClass();
        arweVar.getClass();
        armfVar.getClass();
        this.d = context;
        this.c = afizVar;
        this.f = afusVar;
        this.g = afuuVar;
        this.e = afvbVar;
        this.a = arweVar;
        this.b = armd.a(new afpw(armfVar, 7));
    }

    public atsg(Optional optional, Optional optional2, java.util.Map map) {
        this.f = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.a = new AtomicBoolean(false);
        this.c = optional2;
        this.g = map;
        this.e = optional;
        optional2.isPresent();
        this.d = altg.a;
    }

    public atsg(asnl asnlVar, alhr alhrVar, alhr alhrVar2, Executor executor, apwt apwtVar, ahmv ahmvVar, armf armfVar) {
        this.b = new AtomicBoolean(true);
        this.c = asnlVar;
        this.g = alhrVar;
        this.f = alhrVar2;
        this.e = executor;
        this.d = ahmvVar.a(executor, apwtVar, null);
        this.a = armfVar;
    }

    public atsg(ahyr ahyrVar, aquc aqucVar, ahiy ahiyVar, aegu aeguVar, adze adzeVar, adef adefVar, adxs adxsVar) {
        this.g = ahyrVar;
        this.e = (aows) aows.g(new wci(5), aqucVar);
        this.a = adxsVar;
        this.c = ahiyVar;
        this.f = aeguVar;
        this.d = adzeVar;
        this.b = adefVar;
    }

    public atsg(Executor executor, agcp agcpVar, aiwx aiwxVar, java.util.Map map) {
        this.b = new HashMap();
        this.d = new HashMap();
        executor.getClass();
        this.e = executor;
        agcpVar.getClass();
        this.f = agcpVar;
        this.c = aiwxVar;
        this.g = map;
        d.s(!map.isEmpty());
        this.a = new akdk(1);
    }

    public atsg(qyo qyoVar, ahiy ahiyVar, arwe arweVar, Optional optional, armf armfVar, ajwt ajwtVar) {
        this.d = qyoVar;
        this.c = ahiyVar;
        this.a = arweVar;
        this.b = optional;
        this.g = armfVar;
        this.e = ajwtVar;
        this.f = armd.a(new arih(this, 4));
    }

    public atsg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
    }
}
