package defpackage;

import android.os.Message;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adls extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adls(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    private final void q() {
        this.a.P();
        this.a.aD(24);
        adlw adlwVar = this.a;
        String str = adlwVar.n;
        try {
            aduw aduwVar = adlwVar.z.b;
            aozy createBuilder = wfy.a.createBuilder();
            apct b = apds.b(Instant.now().toEpochMilli());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            wfy wfyVar = (wfy) apagVar;
            b.getClass();
            wfyVar.e = b;
            wfyVar.b |= 4;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            wfy wfyVar2 = (wfy) createBuilder.b;
            wfyVar2.c = a.ak(3);
            wfyVar2.b |= 1;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wfy wfyVar3 = (wfy) createBuilder.b;
            wfyVar3.d = a.aq(3);
            wfyVar3.b |= 2;
            aduwVar.p(aduw.h("phone_number_input_ui_event_key_for_sim_", str), (wfy) createBuilder.s());
            advr.l(adnk.a, "requestPhoneNumberInputUI for sim %s", advq.SIM_ID.c(str));
        } catch (adux e) {
            advr.j(e, adnk.a, "Error while putting PhoneNumberInputUIEvent in bugle storage", new Object[0]);
        }
        if (((Boolean) adlw.c.a()).booleanValue()) {
            adjk.c(this.a.s, 13, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r2.G.a(r4, (java.lang.String) r0, defpackage.aczf.d()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean r() {
        /*
            r6 = this;
            adlw r0 = r6.a
            boolean r0 = r0.ae()
            r1 = 1
            if (r0 != 0) goto La
            goto L4e
        La:
            adlw r0 = r6.a
            boolean r0 = r0.ai()
            if (r0 != 0) goto L4e
            adlw r0 = r6.a
            j$.util.Optional r0 = r0.o()
            boolean r2 = r0.isPresent()
            r3 = 0
            if (r2 == 0) goto L36
            adlw r2 = r6.a
            java.lang.String r4 = r2.n
            java.lang.Object r0 = r0.get()
            int r5 = defpackage.aczf.d()
            java.lang.String r0 = (java.lang.String) r0
            adkn r2 = r2.G
            boolean r0 = r2.a(r4, r0, r5)
            if (r0 != 0) goto L36
            goto L37
        L36:
            r1 = r3
        L37:
            adlw r0 = r6.a
            adkm r0 = r0.D
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Should attempt verification using sim number: "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.d(r2, r3)
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adls.r():boolean");
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "WaitingForManualMsisdnEntryState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        this.a.D(apjx.MANUAL_MSISDN_ENTRY_STAGE);
        int i = 0;
        if (this.a.at()) {
            if (this.a.ai()) {
                this.a.D.d("UPI - found manually entered msisdn, go straight to VerifyMsisdnState", new Object[0]);
                adlw adlwVar = this.a;
                adlwVar.ac(adlwVar.ak);
                return;
            } else {
                this.a.D.d("UPI - manually entered msisdn not found, requesting phone number input UI", new Object[0]);
                alvw i2 = adlw.k.i();
                i2.X(alwp.a, "BugleRcsProvisioning");
                ((alvg) ((alvg) i2).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "enter", 4993, "ProvisioningEngineStateMachine.java")).q("UPI - manually entered msisdn not found, requesting phone number input UI");
                q();
                this.a.K.ifPresent(new adlr(this, 1));
                return;
            }
        }
        if (this.a.aj() && r()) {
            n(this.a.av, apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE);
            return;
        }
        if (!this.a.aj()) {
            alvw i3 = adlw.k.i();
            i3.X(alwp.a, "BugleRcsProvisioning");
            ((alvg) ((alvg) i3).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "enter", 5006, "ProvisioningEngineStateMachine.java")).q("No msisdn found, requesting phone number input UI");
        }
        if (!r()) {
            alvw i4 = adlw.k.i();
            i4.X(alwp.a, "BugleRcsProvisioning");
            ((alvg) ((alvg) i4).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "enter", 5009, "ProvisioningEngineStateMachine.java")).q("Does not have manual entered msisdn or sim msisdn reached max threshold, requesting phone number input UI");
        }
        q();
        this.a.K.ifPresent(new adlr(this, i));
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_WAITING_FOR_MANUAL_MSISDN;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean i() {
        if (!this.a.ag() && !this.a.at()) {
            super.i();
            return true;
        }
        return false;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return this.a.ag();
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.a.J("WaitingForManualMsisdnEntryState", message);
        int ordinal = adlw.av(message).ordinal();
        int i = 2;
        if (ordinal != 2) {
            if (ordinal != 8) {
                if (ordinal != 23) {
                    if (ordinal != 33) {
                        return super.o(message, adjjVar);
                    }
                    if (!aczv.F()) {
                        this.a.D.a("Did not transition to setGoogleToSConsentState because enableRcsConsentViaAsterismApi is disabled via PH.", new Object[0]);
                        adlw adlwVar = this.a;
                        adlwVar.ac(adlwVar.av);
                    } else if (this.a.aJ.m() && !this.a.aJ.n()) {
                        this.a.aD(7);
                        adlw adlwVar2 = this.a;
                        adlwVar2.ac(adlwVar2.aB);
                    } else {
                        this.a.D.e("Did not transition to setGoogleToSConsentState because client does not have consent or consent is already saved to server.", new Object[0]);
                        adlw adlwVar3 = this.a;
                        adlwVar3.ac(adlwVar3.an);
                    }
                    return true;
                }
            } else {
                if (this.a.ag()) {
                    this.a.aD(49);
                    this.a.aB(11);
                    this.a.aA();
                    adlw adlwVar4 = this.a;
                    adlwVar4.ac(adlwVar4.af);
                    return true;
                }
                return super.o(message, adjjVar);
            }
        } else {
            this.a.D.e("%s: received provisioning request message while blocked.", "WaitingForManualMsisdnEntryState");
            adlw adlwVar5 = this.a;
            adlwVar5.aE.i(adlwVar5.s, apkn.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE, adlwVar5.r, new adiw(adlwVar5.n));
        }
        if (this.a.at()) {
            if (this.a.ai()) {
                this.a.aD(25);
                this.a.D.d("UPI - received manually entered msisdn, traisition to VerifyMsisdnState", new Object[0]);
                adlw adlwVar6 = this.a;
                adlwVar6.ac(adlwVar6.ak);
            } else {
                this.a.D.d("UPI - manually entered msisdn not received, requesting phone number input UI", new Object[0]);
                alvw i2 = adlw.k.i();
                i2.X(alwp.a, "BugleRcsProvisioning");
                ((alvg) ((alvg) i2).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "processCombinedMessage", 5072, "ProvisioningEngineStateMachine.java")).q("UPI - manually entered msisdn not received, requesting phone number input UI");
                q();
                this.a.K.ifPresent(new adlr(this, i));
            }
        } else if (this.a.aj()) {
            this.a.aD(25);
            adlw adlwVar7 = this.a;
            adlwVar7.ac(adlwVar7.av);
        } else {
            alvw i3 = adlw.k.i();
            i3.X(alwp.a, "BugleRcsProvisioning");
            ((alvg) ((alvg) i3).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "processCombinedMessage", 5087, "ProvisioningEngineStateMachine.java")).q("No msisdn found, requesting phone number input UI");
            q();
            this.a.K.ifPresent(new adlr(this, 3));
        }
        return true;
    }

    @Override // defpackage.adll
    public final Duration l() {
        if (this.a.ag()) {
            return Duration.ofMillis(aczv.o());
        }
        return super.l();
    }
}
