package defpackage;

import android.net.Uri;
import android.os.PersistableBundle;
import android.telephony.gba.UaSecurityProtocolIdentifier;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class actf {
    public final acto a;
    public final acsy b;
    private final adwt c;
    private final anen d;

    public actf(adwt adwtVar, anen anenVar, acto actoVar, acsy acsyVar) {
        this.c = adwtVar;
        this.d = anenVar;
        this.a = actoVar;
        this.b = acsyVar;
    }

    public final ListenableFuture a(String str, boolean z) {
        PersistableBundle carrierConfig;
        Uri parse;
        SettableFuture create = SettableFuture.create();
        actc actcVar = new actc(this, create);
        carrierConfig = this.c.a.getCarrierConfig();
        int i = carrierConfig.getInt("gba_ua_security_organization_int");
        int i2 = carrierConfig.getInt("gba_ua_security_protocol_int");
        int i3 = carrierConfig.getInt("gba_ua_tls_cipher_suite_int");
        advr.c("[SR] Creating the security protocol identifier: organization - %s, protocol - %s, cipher suite - %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        UaSecurityProtocolIdentifier build = new UaSecurityProtocolIdentifier.Builder().setOrg(i).setProtocol(i2).setTlsCipherSuite(i3).build();
        try {
            acyz acyzVar = actt.a;
            String str2 = (String) aczf.o().a.t.a();
            if (TextUtils.isEmpty(str2)) {
                Uri parse2 = Uri.parse(str);
                parse = Uri.parse(String.format("%s://%s@%s", parse2.getScheme(), "3GPP-bootstrapping", parse2.getHost()));
            } else {
                parse = Uri.parse(str2);
                String userInfo = parse.getUserInfo();
                if (userInfo != null && userInfo.equals("3GPP-bootstrapping")) {
                    if (!TextUtils.isEmpty(parse.getPath())) {
                        throw new IllegalStateException(String.format("Wrong NAF ID %s. The path should be empty, but was %s.", parse, parse.getPath()));
                    }
                } else {
                    throw new IllegalStateException(String.format("Wrong NAF ID %s. GBA mode is %s instead of %s.", parse, parse.getUserInfo(), "3GPP-bootstrapping"));
                }
            }
            Uri uri = parse;
            advr.c("[SR] Making a bootstrap authentication request to %s with forcedBootstrapping = %s", uri, Boolean.valueOf(z));
            try {
                try {
                    this.c.a.bootstrapAuthenticationRequest(5, uri, new adws(build).a, z, this.d, new adwr(actcVar).a);
                } catch (SecurityException e) {
                    throw new adwk("PERFORM_IMS_SINGLE_REGISTRATION and MODIFY_PHONE_STATE permissions required", e);
                }
            } catch (adwk e2) {
                acto actoVar = this.a;
                aozy createBuilder = apgh.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                apgh apghVar = (apgh) apagVar;
                apghVar.c = 1;
                apghVar.b = 1 | apghVar.b;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apgh apghVar2 = (apgh) createBuilder.b;
                apghVar2.d = 2;
                apghVar2.b = 2 | apghVar2.b;
                actoVar.a(4, (apgh) createBuilder.s());
                create.setException(e2);
            }
            return create;
        } catch (IllegalStateException e3) {
            acto actoVar2 = this.a;
            aozy createBuilder2 = apgh.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            apgh apghVar3 = (apgh) apagVar2;
            apghVar3.c = 1;
            apghVar3.b = 1 | apghVar3.b;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            apgh apghVar4 = (apgh) createBuilder2.b;
            apghVar4.d = 4;
            apghVar4.b = 2 | apghVar4.b;
            actoVar2.a(4, (apgh) createBuilder2.s());
            create.setException(e3);
            return create;
        }
    }
}
