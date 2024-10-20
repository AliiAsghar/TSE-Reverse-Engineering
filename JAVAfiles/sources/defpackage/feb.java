package defpackage;

import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feb implements fdy {
    private final UUID a;
    private final MediaDrm b;
    private int c;

    private feb(UUID uuid) {
        d.t(!eqc.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(q(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (eqc.d.equals(uuid) && "ASUS_Z00AD".equals(eul.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static feb o(UUID uuid) {
        try {
            return new feb(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new fee(e);
        } catch (Exception e2) {
            throw new fee(e2);
        }
    }

    private static UUID q(UUID uuid) {
        if (eul.a < 27 && eqc.c.equals(uuid)) {
            return eqc.b;
        }
        return uuid;
    }

    @Override // defpackage.fdy
    public final int a() {
        return 2;
    }

    @Override // defpackage.fdy
    public final /* bridge */ /* synthetic */ ewg b(byte[] bArr) {
        return new fdz(q(this.a), bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        if (j$.util.Objects.equals(r0, "aidl-1") == false) goto L98;
     */
    @Override // defpackage.fdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fdx c(byte[] r12, java.util.List r13, int r14, java.util.HashMap r15) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feb.c(byte[], java.util.List, int, java.util.HashMap):fdx");
    }

    @Override // defpackage.fdy
    public final Map d(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // defpackage.fdy
    public final void e(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // defpackage.fdy
    public final void f(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // defpackage.fdy
    public final synchronized void g() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // defpackage.fdy
    public final void h(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.fdy
    public final void i(byte[] bArr, fbz fbzVar) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        if (eul.a >= 31) {
            try {
                MediaDrm mediaDrm = this.b;
                LogSessionId a = fbzVar.a();
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                equals = a.equals(logSessionId);
                if (!equals) {
                    playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                    dzg.g(playbackComponent);
                    playbackComponent.setLogSessionId(a);
                }
            } catch (UnsupportedOperationException unused) {
                eub.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0.startsWith("16.0") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r0 = r3.b;
        r4 = r0.getSecurityLevel(r4);
        r4 = r0.requiresSecureDecoder(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r3.a.equals(defpackage.eqc.c) == false) goto L19;
     */
    @Override // defpackage.fdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(byte[] r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = defpackage.eul.a
            r1 = 31
            if (r0 < r1) goto L4b
            java.util.UUID r0 = r3.a
            java.util.UUID r1 = defpackage.eqc.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            java.lang.String r0 = r3.p()
            java.lang.String r1 = "v5."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "14."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "15."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "16.0"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L4b
            goto L40
        L35:
            java.util.UUID r0 = r3.a
            java.util.UUID r1 = defpackage.eqc.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L4b
        L40:
            android.media.MediaDrm r0 = r3.b
            int r4 = defpackage.cok$$ExternalSyntheticApiModelOutline0.m(r0, r4)
            boolean r4 = defpackage.fbw$$ExternalSyntheticApiModelOutline2.m(r0, r5, r4)
            goto L6a
        L4b:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch: java.lang.Throwable -> L60 android.media.MediaCryptoException -> L67
            java.util.UUID r2 = r3.a     // Catch: java.lang.Throwable -> L60 android.media.MediaCryptoException -> L67
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L60 android.media.MediaCryptoException -> L67
            boolean r4 = r1.requiresSecureDecoderComponent(r5)     // Catch: java.lang.Throwable -> L5b android.media.MediaCryptoException -> L5e
            r1.release()
            goto L6a
        L5b:
            r4 = move-exception
            r0 = r1
            goto L61
        L5e:
            r0 = r1
            goto L67
        L60:
            r4 = move-exception
        L61:
            if (r0 == 0) goto L66
            r0.release()
        L66:
            throw r4
        L67:
            r4 = 1
            if (r0 != 0) goto L6b
        L6a:
            return r4
        L6b:
            r0.release()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feb.j(byte[], java.lang.String):boolean");
    }

    @Override // defpackage.fdy
    public final byte[] k() {
        return this.b.openSession();
    }

    @Override // defpackage.fdy
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        if (eqc.c.equals(this.a) && eul.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(eul.H(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(edx.g(jSONObject2.getString("k")));
                    sb.append("\",\"kid\":\"");
                    sb.append(edx.g(jSONObject2.getString("kid")));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = eul.ac(sb.toString());
            } catch (JSONException e) {
                eub.d("ClearKeyUtil", "Failed to adjust response data: ".concat(eul.H(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.fdy
    public final fvq m() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new fvq(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // defpackage.fdy
    public final void n(final qdq qdqVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: fea
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                fdk fdkVar = ((fdn) qdq.this.a).k;
                dzg.g(fdkVar);
                fdkVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    public final String p() {
        return this.b.getPropertyString(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
    }
}
