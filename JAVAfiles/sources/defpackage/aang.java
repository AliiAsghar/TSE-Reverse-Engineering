package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.hardware.Camera;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aang implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aang(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [uvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [alhr, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul akulVar;
        algw algwVar;
        Optional of;
        int i = 7;
        byte[] bArr = null;
        int i2 = 2;
        int i3 = 4;
        switch (this.b) {
            case 0:
                return ((aanj) this.a).g.c();
            case 1:
                return vex.l((veo) ((aalt) this.a).o.b(), (aqen) obj);
            case 2:
                vbq vbqVar = (vbq) obj;
                return vbqVar.m().g().i(new aang(vbqVar, i3), ((zlz) this.a).c);
            case 3:
                return ((vbs) ((zlz) this.a).d.b()).b((String) obj);
            case 4:
                return ((vby) this.a).k();
            case 5:
                vbq vbqVar2 = (vbq) obj;
                akul e = vbqVar2.m().e();
                akul f = vbqVar2.m().f();
                return aktp.ap(e, f).h(akto.k(new aakf(e, f, i3, bArr)), ((zlz) this.a).c);
            case 6:
                long j = ((aaps) obj).a;
                zkm zkmVar = (zkm) this.a;
                return zkmVar.b(zkmVar.a(j, "vnd.android.cursor.item/postal-address_v2", new String[]{"data1", "data2", "data3"}).d(new lfg(6), zkmVar.b).f());
            case 7:
                long j2 = ((aaps) obj).a;
                zkm zkmVar2 = (zkm) this.a;
                return zkmVar2.b(zkmVar2.a(j2, "vnd.android.cursor.item/im", new String[]{"data1", "data5", "data6"}).d(new lfg(i2), zkmVar2.b).f());
            case 8:
                long j3 = ((aaps) obj).a;
                zkm zkmVar3 = (zkm) this.a;
                return zkmVar3.b(zkmVar3.a(j3, "vnd.android.cursor.item/organization", new String[]{"data1", "data4"}).d(new lfg(5), zkmVar3.b).f());
            case 9:
                long j4 = ((aaps) obj).a;
                zkm zkmVar4 = (zkm) this.a;
                return zkmVar4.b(zkmVar4.a(j4, "vnd.android.cursor.item/website", new String[]{"data1", "data2", "data3"}).d(new lfg(i3), zkmVar4.b).f());
            case 10:
                long j5 = ((aaps) obj).a;
                zkm zkmVar5 = (zkm) this.a;
                return zkmVar5.b(zkmVar5.a(j5, "vnd.android.cursor.item/contact_event", new String[]{"data1", "data2", "data3"}).d(new lfg(9), zkmVar5.b).f());
            case 11:
                long j6 = ((aaps) obj).a;
                zkm zkmVar6 = (zkm) this.a;
                return zkmVar6.b(zkmVar6.a(j6, "vnd.android.cursor.item/note", new String[]{"data1"}).d(new lfg(i), zkmVar6.b).f());
            case 12:
                zkm zkmVar7 = (zkm) this.a;
                return zkmVar7.c.b((Throwable) obj).h(new zms(13), zkmVar7.b);
            case 13:
                long j7 = ((aaps) obj).a;
                zkm zkmVar8 = (zkm) this.a;
                return zkmVar8.b(zkmVar8.a(j7, "vnd.android.cursor.item/phone_v2", new String[]{"data1", "data2", "data3"}).d(new lfg(8), zkmVar8.b).f());
            case 14:
                long j8 = ((aaps) obj).a;
                zkm zkmVar9 = (zkm) this.a;
                return zkmVar9.b(zkmVar9.a(j8, "vnd.android.cursor.item/email_v2", new String[]{"data1", "data2", "data3"}).d(new lfg(3), zkmVar9.b).f());
            case 15:
                Object obj2 = this.a;
                final SettableFuture create = SettableFuture.create();
                final aava aavaVar = (aava) obj2;
                qjb.a(new Runnable() { // from class: aaup
                    @Override // java.lang.Runnable
                    public final void run() {
                        final SettableFuture settableFuture = create;
                        final aava aavaVar2 = aava.this;
                        Camera camera = aavaVar2.i;
                        if (camera == null) {
                            settableFuture.setException(new aauy("Camera not open"));
                            return;
                        }
                        aavaVar2.p();
                        Camera.PictureCallback pictureCallback = new Camera.PictureCallback() { // from class: aaut
                            @Override // android.hardware.Camera.PictureCallback
                            public final void onPictureTaken(byte[] bArr2, Camera camera2) {
                                alwo alwoVar = aava.a;
                                SettableFuture settableFuture2 = SettableFuture.this;
                                if (bArr2 == null) {
                                    settableFuture2.setException(new aauy("Camera returned no data"));
                                } else {
                                    settableFuture2.set(bArr2);
                                }
                            }
                        };
                        try {
                            aavaVar2.l(camera);
                            camera.takePicture(new Camera.ShutterCallback() { // from class: aauu
                                @Override // android.hardware.Camera.ShutterCallback
                                public final void onShutter() {
                                    aava aavaVar3 = aava.this;
                                    if (!aavaVar3.d.canDisableShutterSound) {
                                        return;
                                    }
                                    ygd ygdVar = new ygd(null);
                                    ygdVar.a = new ygi("file:///product/media/audio/ui/camera_click.ogg");
                                    ygdVar.b = Optional.of(new ygi("file:///system/media/audio/ui/camera_click.ogg"));
                                    ygdVar.b(aava.b);
                                    ygdVar.c(0.5f);
                                    qiu.h(aavaVar3.w.v(ygdVar.a()).e(ygm.class, new zms(15), andi.a));
                                }
                            }, null, pictureCallback);
                        } catch (Throwable th) {
                            settableFuture.setException(th);
                        }
                    }
                }, aavaVar.s);
                return akul.g(create);
            case 16:
                abch abchVar = (abch) this.a;
                if (((ytk) abchVar.c.b()).c()) {
                    abch.b.o("Calling C11N to get phone numbers...");
                    ytw ytwVar = (ytw) abchVar.g.b();
                    if (!ytwVar.n.isDone()) {
                        ytw.a.o("Received a registration request for C11N but something else is already running.");
                        akulVar = ytwVar.n;
                    } else if (!ytwVar.e.e()) {
                        ytw.a.o("VSMS is not enabled/supported, skipping retrieval.");
                        akulVar = aktp.ag(false);
                    } else {
                        akul i4 = ytwVar.b.e().i(new ytu(ytwVar, i2), ytwVar.j);
                        ytwVar.n = i4;
                        akulVar = i4;
                    }
                    return akulVar.e(Throwable.class, new zms(16), abchVar.h).h(new zms(17), abchVar.h);
                }
                abch.b.o("Not calling C11N to get phone numbers.");
                return aktp.ag(abch.a);
            case 17:
                List list = (List) obj;
                ahmn ao = aktp.ao(list);
                Object obj3 = this.a;
                return ao.h(new aakf(obj3, list, i, bArr), ((abcu) obj3).h);
            case 18:
                ShortcutInfo m = ead$$ExternalSyntheticApiModelOutline0.m(obj);
                if (m != null) {
                    abcu abcuVar = (abcu) this.a;
                    ead$$ExternalSyntheticApiModelOutline0.m343m(abcuVar.d.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m())).pushDynamicShortcut(m);
                    return aktp.ag(true);
                }
                return aktp.ag(false);
            case 19:
                algw algwVar2 = (algw) obj;
                if (algwVar2.f()) {
                    GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) algwVar2.b();
                    long j9 = abzx.a;
                    byte[] bArr2 = gmsDeviceComplianceResponse.f;
                    if (bArr2 != null) {
                        try {
                            algwVar = algw.i((aovk) apag.parseFrom(aovk.a, bArr2, aozs.a()));
                        } catch (apba unused) {
                        }
                        Object obj4 = this.a;
                        addy addyVar = ((abzz) obj4).e;
                        Long l = (Long) ((algw) addyVar.a.get()).d(0L);
                        l.longValue();
                        final accs accsVar = new accs((Context) addyVar.b, addyVar.c, new accq(algw.i(l), alfd.a));
                        return (ListenableFuture) abzz.a(algwVar, new algy() { // from class: abzy
                            /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x01a6 A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
                            @Override // defpackage.algy
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final boolean a(java.lang.Object r22) {
                                /*
                                    Method dump skipped, instructions count: 426
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.abzy.a(java.lang.Object):boolean");
                            }
                        }).a(new aald(obj4, 18)).c(new ylq(obj4, algwVar2, 11));
                    }
                }
                algwVar = alfd.a;
                Object obj42 = this.a;
                addy addyVar2 = ((abzz) obj42).e;
                Long l2 = (Long) ((algw) addyVar2.a.get()).d(0L);
                l2.longValue();
                final accs accsVar2 = new accs((Context) addyVar2.b, addyVar2.c, new accq(algw.i(l2), alfd.a));
                return (ListenableFuture) abzz.a(algwVar, new algy() { // from class: abzy
                    @Override // defpackage.algy
                    public final boolean a(Object obj5) {
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            */
                        /*
                            Method dump skipped, instructions count: 426
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzy.a(java.lang.Object):boolean");
                    }
                }).a(new aald(obj42, 18)).c(new ylq(obj42, algwVar2, 11));
            default:
                HttpResponse httpResponse = (HttpResponse) obj;
                HashMap hashMap = new HashMap();
                Header firstHeader = httpResponse.getFirstHeader("Accept-Ranges");
                if (firstHeader != null) {
                    hashMap.put("Accept-Ranges", firstHeader.getValue());
                }
                Header firstHeader2 = httpResponse.getFirstHeader("Retry-After");
                if (firstHeader2 != null) {
                    hashMap.put("Retry-After", firstHeader2.getValue());
                }
                Object obj5 = this.a;
                int statusCode = httpResponse.getStatusLine().getStatusCode();
                HttpEntity entity = httpResponse.getEntity();
                if (!((actm) obj5).c.contains(Integer.valueOf(statusCode))) {
                    of = Optional.empty();
                } else if (entity == null) {
                    advr.q("[SR] Did not receive a response body to download.", new Object[0]);
                    of = Optional.empty();
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    amcp.a(entity.getContent(), byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    entity.consumeContent();
                    of = Optional.of(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                }
                return albo.bI(actg.a(statusCode, of, hashMap));
        }
    }
}
