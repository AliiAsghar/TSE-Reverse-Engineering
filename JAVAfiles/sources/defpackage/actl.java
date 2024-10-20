package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.auth.RFC2617Scheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class actl implements ancs {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ actl(actm actmVar, long j, DefaultHttpClient defaultHttpClient, HttpGet httpGet, int i) {
        this.e = i;
        this.b = actmVar;
        this.a = j;
        this.c = defaultHttpClient;
        this.d = httpGet;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int aF;
        final int i;
        int i2;
        int aF2;
        int aF3;
        final int i3;
        int i4 = this.e;
        RFC2617Scheme rFC2617Scheme = null;
        if (i4 != 0) {
            if (i4 != 1) {
                alqf alqfVar = (alqf) obj;
                alek alekVar = (alek) this.c;
                int c = aiep.c(alekVar, Instant.ofEpochMilli(this.a));
                alob alobVar = new alob();
                for (ales alesVar : alekVar.h) {
                    aleq b = aleq.b(alesVar.q);
                    if (b == null) {
                        b = aleq.UNRECOGNIZED;
                    }
                    Object obj2 = this.d;
                    if (b == aleq.RELEASE_STAGE_NOT_SET || ((aieo) obj2).c.a() <= alesVar.q) {
                        Object obj3 = this.b;
                        aieo aieoVar = (aieo) obj2;
                        final int i5 = c;
                        final aidn aidnVar = new aidn(aieoVar.f, aieoVar.g, alekVar.b, alesVar.f);
                        int i6 = alesVar.g;
                        int av = albo.av(i6);
                        if (av != 0 && av == 14 && (((aF2 = a.aF((i2 = alesVar.k))) != 0 && aF2 == 9) || ((aF3 = a.aF(i2)) != 0 && aF3 == 10))) {
                            final aidd aiddVar = aieoVar.h;
                            final alex a = aieoVar.i.a(alesVar, alqfVar);
                            int Z = a.Z(alesVar.p);
                            if (Z == 0) {
                                i3 = 1;
                            } else {
                                i3 = Z;
                            }
                            final long j = alesVar.m;
                            final aidj aidjVar = (aidj) obj3;
                            final int i7 = 1;
                            alobVar.h(akul.g(aiddVar.c.f(new aixt() { // from class: aicz
                                @Override // defpackage.aixt
                                public final void a(agrk agrkVar) {
                                    if (i7 != 0) {
                                        mle mleVar = new mle(16);
                                        long j2 = j;
                                        aidj aidjVar2 = aidjVar;
                                        int i8 = i3;
                                        alex alexVar = a;
                                        aidd.e(agrkVar, aidnVar, i5, alexVar, i8, aidjVar2, j2, 0, mleVar);
                                        return;
                                    }
                                    jgl jglVar = new jgl(new mle(15), 6);
                                    long j3 = j;
                                    aidj aidjVar3 = aidjVar;
                                    int i9 = i3;
                                    alex alexVar2 = a;
                                    aidd.e(agrkVar, aidnVar, i5, alexVar2, i9, aidjVar3, j3, 1L, jglVar);
                                }
                            })));
                        } else {
                            int av2 = albo.av(i6);
                            if (av2 != 0 && av2 == 19 && (aF = a.aF(alesVar.k)) != 0 && aF == 5) {
                                final aidd aiddVar2 = aieoVar.h;
                                final alex a2 = aieoVar.i.a(alesVar, alqfVar);
                                int Z2 = a.Z(alesVar.p);
                                if (Z2 == 0) {
                                    i = 1;
                                } else {
                                    i = Z2;
                                }
                                final long j2 = alesVar.m;
                                final aidj aidjVar2 = (aidj) obj3;
                                final int i8 = 0;
                                alobVar.h(akul.g(aiddVar2.c.f(new aixt() { // from class: aicz
                                    @Override // defpackage.aixt
                                    public final void a(agrk agrkVar) {
                                        if (i8 != 0) {
                                            mle mleVar = new mle(16);
                                            long j22 = j2;
                                            aidj aidjVar22 = aidjVar2;
                                            int i82 = i;
                                            alex alexVar = a2;
                                            aidd.e(agrkVar, aidnVar, i5, alexVar, i82, aidjVar22, j22, 0, mleVar);
                                            return;
                                        }
                                        jgl jglVar = new jgl(new mle(15), 6);
                                        long j3 = j2;
                                        aidj aidjVar3 = aidjVar2;
                                        int i9 = i;
                                        alex alexVar2 = a2;
                                        aidd.e(agrkVar, aidnVar, i5, alexVar2, i9, aidjVar3, j3, 1L, jglVar);
                                    }
                                })));
                            } else {
                                int av3 = albo.av(i6);
                                if (av3 != 0 && av3 == 13) {
                                    final aidd aiddVar3 = aieoVar.h;
                                    final alex a3 = aieoVar.i.a(alesVar, alqfVar);
                                    final long j3 = alesVar.m;
                                    final aidj aidjVar3 = (aidj) obj3;
                                    alobVar.h(akul.g(aiddVar3.c.f(new aixt() { // from class: aicy
                                        @Override // defpackage.aixt
                                        public final void a(agrk agrkVar) {
                                            aidd.e(agrkVar, aidnVar, i5, a3, 5, aidjVar3, j3, 1L, new jgl(new mle(14), 6));
                                        }
                                    })));
                                }
                            }
                        }
                        c = i5;
                    }
                }
                return aktp.ad(alobVar.g());
            }
            if (((Boolean) obj).booleanValue()) {
                return aktp.ah(new maa(this.d, this.a, this.c, 0), ((mac) this.b).b);
            }
            return aktp.ag(null);
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        actm actmVar = (actm) this.b;
        actmVar.a.b(actmVar.f, statusCode, agkx.W().longValue() - this.a);
        alpr alprVar = new alpr();
        alprVar.j(actmVar.c);
        alprVar.c(401);
        alpt g = alprVar.g();
        advr.c("[SR] Received %s, expecting %s", httpResponse.getStatusLine(), g);
        int statusCode2 = httpResponse.getStatusLine().getStatusCode();
        if (g.contains(Integer.valueOf(statusCode2))) {
            if (statusCode != 401) {
                return aktp.ag(httpResponse);
            }
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                entity.consumeContent();
            }
            if (httpResponse.getStatusLine().getStatusCode() != 401) {
                advr.o("[SR] HTTP client authentication not required!", new Object[0]);
                actmVar.a.a = aphx.AUTHENTICATION_TYPE_NONE;
            } else if (httpResponse.containsHeader("WWW-Authenticate")) {
                rFC2617Scheme = acul.a(httpResponse.getFirstHeader("WWW-Authenticate"));
                DefaultHttpClient defaultHttpClient = actmVar.e;
                defaultHttpClient.getClass();
                acul.c(defaultHttpClient, rFC2617Scheme);
            } else {
                throw new IOException(String.format("No %s header found in initial response!", "WWW-Authenticate"));
            }
            Object obj4 = this.d;
            Object obj5 = this.c;
            BasicHttpContext b2 = acul.b(rFC2617Scheme);
            if (b2 == null) {
                return actmVar.b.b((DefaultHttpClient) obj5, (HttpRequestBase) obj4);
            }
            return actmVar.b.a((DefaultHttpClient) obj5, b2, (HttpRequestBase) obj4);
        }
        actmVar.a.a(aphy.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE);
        try {
            throw new acui(statusCode2, actt.c(httpResponse));
        } catch (IllegalArgumentException e) {
            actmVar.a.a(aphy.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
            throw new IOException(e);
        }
    }

    public /* synthetic */ actl(aieo aieoVar, alek alekVar, aidj aidjVar, long j, int i) {
        this.e = i;
        this.d = aieoVar;
        this.c = alekVar;
        this.b = aidjVar;
        this.a = j;
    }

    public /* synthetic */ actl(mac macVar, mej mejVar, long j, Optional optional, int i) {
        this.e = i;
        this.b = macVar;
        this.d = mejVar;
        this.a = j;
        this.c = optional;
    }
}
