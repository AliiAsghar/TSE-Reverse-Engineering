package defpackage;

import com.google.android.ims.provisioning.config.CapabilityConfiguration;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.provisioning.config.ServerMessage;
import com.google.android.ims.provisioning.config.WelcomeMessage;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnb {
    private final yjr f;
    private final adaw g;
    private static final advp b = new advp("OMACPRcsConfigParser");
    private static final String[] c = {BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, "validity"};
    private static final String[] d = {"imSessionStart", "ftWarnSize", "MaxSizeFileTr"};
    public static final acyz a = acyy.b("override_config_validity_for_debug");
    private static final acyz e = acyy.b("log_warning_on_invalid_public_user_identity");

    public adnb(yjr yjrVar) {
        this.f = yjrVar;
        this.g = new adaw(yjrVar);
    }

    static final void b(adjt adjtVar, adjp adjpVar) {
        if (adjpVar != null) {
            adjp c2 = adjpVar.c("transportProto");
            adjtVar.q(adom.f(c2, "psSignalling"));
            adjtVar.p(adom.f(c2, "psRTMedia"));
            adjtVar.o(adom.f(c2, "psMedia"));
            adjtVar.C(adom.f(c2, "wifiSignalling"));
            adjtVar.B(adom.f(c2, "wifiRTMedia"));
            adjtVar.A(adom.f(c2, "wifiMedia"));
            return;
        }
        throw new adna("Unable to parse transportProto, source characteristic is null", 1);
    }

    private static adjp c(adjp adjpVar) {
        adjp c2 = adjpVar.c("SERVICEPROVIDEREXT");
        if (c2 == null) {
            return null;
        }
        return c2.c("joyn");
    }

    private static adjp d(adjp adjpVar) {
        return adjpVar.c("UX");
    }

    private static void e(adjp adjpVar, Configuration configuration) {
        adjp c2;
        adjp c3 = adjpVar.c("CAPDISCOVERY");
        if (c3 != null) {
            CapabilityConfiguration capabilityConfiguration = new CapabilityConfiguration();
            boolean z = false;
            capabilityConfiguration.mPollingPeriod = c3.a("pollingPeriod", 0);
            capabilityConfiguration.mCapInfoExpiry = c3.a("capInfoExpiry", 0);
            capabilityConfiguration.mNonRcsCapInfoExpiry = c3.a("nonRCScapInfoExpiry", 0);
            int a2 = c3.a("defaultDisc", 0);
            if (a2 == 0) {
                capabilityConfiguration.mPresenceDiscovery = false;
            } else if (a2 == 1) {
                capabilityConfiguration.mPresenceDiscovery = true;
            } else {
                advr.r(b, "Invalid parameter value defaultDisc:%d", Integer.valueOf(a2));
                capabilityConfiguration.mPresenceDiscovery = false;
            }
            if (c3.a("disableInitialAddressBookScan", 0) == 1) {
                z = true;
            }
            capabilityConfiguration.disableInitialAddressBookScan = z;
            adjp c4 = c3.c("Ext");
            if (c4 == null) {
                c2 = null;
            } else {
                c2 = c4.c("joyn");
            }
            if (c2 != null) {
                capabilityConfiguration.msgCapValidity = c2.a("msgCapValidity", 5);
            }
            configuration.mCapabilityDiscoveryConfiguration = capabilityConfiguration;
        }
    }

    private static void f(adjp adjpVar, Configuration configuration) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        adjp c2 = adjpVar.c("IM");
        adom.g(c2, d);
        if (c2 != null) {
            InstantMessageConfiguration instantMessageConfiguration = new InstantMessageConfiguration();
            if (c2.a("imCapAlwaysON", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            instantMessageConfiguration.mImCapAlwaysOn = z;
            if (c2.a("GroupChatFullStandFwd", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            instantMessageConfiguration.mFullGroupSandFSupported = z2;
            if (c2.a("imWarnSF", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            instantMessageConfiguration.mImWarnSF = z3;
            instantMessageConfiguration.mImSessionStart = c2.a("imSessionStart", 0);
            if (c2.a("ChatAuth", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            instantMessageConfiguration.mChatAuth = z4;
            if (c2.a("SmsFallBackAuth", 0) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            instantMessageConfiguration.mSmsFallBackAuth = z5;
            if (c2.a("AutAccept", 0) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            instantMessageConfiguration.mAutoAccept = z6;
            if (c2.a("AutAcceptGroupChat", 1) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            instantMessageConfiguration.mAutoAcceptGroupChat = z7;
            int a2 = c2.a("MaxSize", Integer.MAX_VALUE);
            instantMessageConfiguration.mMaxSize1to1 = c2.a("MaxSize1to1", a2);
            instantMessageConfiguration.mMaxSize1toM = c2.a("MaxSize1toM", a2);
            int a3 = c2.a("TimerIdle", 120);
            instantMessageConfiguration.mTimerIdleSecs = a3;
            advp advpVar = b;
            advr.d(advpVar, "Instant Message Session TimerIdle: %d", Integer.valueOf(a3));
            if (c2.a("pres-srv-cap", 0) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            instantMessageConfiguration.mPublishPresenceCap = z8;
            instantMessageConfiguration.mMaxAdhocGroupSize = c2.a("max_adhoc_group_size", Integer.MAX_VALUE);
            String e2 = c2.e("deferred-msg-func-uri");
            if (e2 != null && e2.trim().length() != 0) {
                if (!e2.startsWith("sip:") && !e2.startsWith("sips:")) {
                    e2 = "sip:".concat(e2);
                }
                instantMessageConfiguration.mDeferredMessageFunctionUri = e2;
            } else {
                instantMessageConfiguration.mDeferredMessageFunctionUri = null;
            }
            String e3 = c2.e("conf-fcty-uri");
            if (e3 != null) {
                instantMessageConfiguration.mConferenceFactoryUri = e3;
                instantMessageConfiguration.mExploderUri = c2.e("exploder-uri");
                if (c2.a("ftAutAccept", 1) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                instantMessageConfiguration.mFileTransferAutoAcceptSupported = z9;
                instantMessageConfiguration.mMaxSizeFileTransfer = c2.a("MaxSizeFileTr", 0) * 1024;
                instantMessageConfiguration.mWarnSizeFileTransfer = c2.a("ftWarnSize", 0) * 1024;
                if (c2.a("ftCapAlwaysON", 0) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                instantMessageConfiguration.mFtCapAlwaysOn = z10;
                String e4 = c2.e("ftDefaultMech");
                String str = "http";
                if (!"http".equalsIgnoreCase(e4)) {
                    if ("msrp".equalsIgnoreCase(e4)) {
                        str = "msrp";
                    } else {
                        advr.q("Invalid parameter ftDefaultMech:%s. Falling back to HTTP.", String.valueOf(e4));
                    }
                }
                instantMessageConfiguration.mFtDefaultMechanism = str;
                instantMessageConfiguration.mDefaultSharingMethod = c2.a("ftHTTPFallback", -1);
                if (c2.a("ftStAndFwEnabled", 0) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                instantMessageConfiguration.mFtStoreAndForwardEnabled = z11;
                if (c2.a("ftThumb", 0) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                instantMessageConfiguration.mFtThumbnailSupported = z12;
                instantMessageConfiguration.mMaxConcurrentSession = c2.a("MaxConcurrentSession", -1);
                String e5 = c2.e("ftHTTPCSURI");
                if (e5 != null) {
                    instantMessageConfiguration.mFtHttpContentServerUri = e5;
                }
                String e6 = c2.e("ftHTTPCSUser");
                if (e6 != null) {
                    instantMessageConfiguration.mFtHttpContentServerUser = e6;
                }
                String e7 = c2.e("ftHTTPCSPwd");
                if (e7 != null) {
                    instantMessageConfiguration.mFtHttpContentServerPassword = e7;
                }
                instantMessageConfiguration.mChatRevokeTimer = c2.a("ChatRevokeTimer", 0);
                int a4 = c2.a("imMsgTech", 0);
                if (a4 == 0) {
                    instantMessageConfiguration.mMessageTech = 0;
                } else if (a4 == 1) {
                    instantMessageConfiguration.mMessageTech = 1;
                } else {
                    advr.r(advpVar, "Invalid parameter value imMsgTech:%d", Integer.valueOf(a4));
                    instantMessageConfiguration.mMessageTech = 0;
                }
                configuration.mInstantMessageConfiguration = instantMessageConfiguration;
                return;
            }
            throw new adna("conferenceFactoryUri cannot be set to null.", 1);
        }
    }

    private static void g(Configuration configuration, adjp adjpVar) {
        boolean z;
        boolean z2;
        boolean z3;
        String e2 = adjpVar.e("message");
        if (e2 != null) {
            String e3 = adjpVar.e(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
            if (e3 != null) {
                if (adjpVar.a("Reject_btn", 0) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (adjpVar.a("Accept_btn", 0) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 != z) {
                    if (adjpVar.a("Settings_btn", 0) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    advr.d(b, "welcome msg: %s, title: %s, accept: %s, reject: %s, settings: %s", e2, e3, Boolean.valueOf(z2), Boolean.valueOf(z), Boolean.valueOf(z3));
                    configuration.welcomeMessage = new WelcomeMessage(e2, e3, z2, z, z3);
                    return;
                }
                advr.d(b, "msg: %s, title: %s, accept: %s, reject: %s", e2, e3, Boolean.valueOf(z2), Boolean.valueOf(z));
                configuration.mServerMessage = new ServerMessage(e2, e3, z2, z);
                return;
            }
            throw new adna("title field cannot be null.", 3);
        }
        throw new adna("message field cannot be null.", 3);
    }

    private static adjp h(adjp adjpVar) {
        adjp d2 = adjpVar.d("AppId", "ap2002");
        if (d2 == null) {
            d2 = adjpVar.d("Name", "RCS-e settings");
        }
        if (d2 == null) {
            return adjpVar.d("Name", "RCS settings");
        }
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.adjp i(java.io.InputStream r9) {
        /*
            adjp r0 = new adjp
            java.lang.String r1 = "WapProvisioningDocument"
            r0.<init>(r1)
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            java.lang.String r2 = "utf-8"
            r1.setInput(r9, r2)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            r1.nextTag()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            java.lang.String r9 = r1.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            java.util.Stack r2 = new java.util.Stack     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            r2.<init>()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            int r3 = r1.nextTag()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            r4 = 0
            r5 = r4
        L26:
            java.lang.String r6 = r1.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            boolean r6 = r6.equals(r9)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            if (r6 != 0) goto Lb2
            java.lang.String r6 = r1.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            r7 = 2
            java.lang.String r8 = "characteristic"
            if (r3 != r7) goto L91
            java.lang.String r3 = "param"
            boolean r3 = r6.equals(r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            if (r3 != 0) goto L6f
            java.lang.String r3 = "parm"
            boolean r3 = r6.equals(r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            if (r3 == 0) goto L4a
            goto L6f
        L4a:
            boolean r3 = r6.equals(r8)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            if (r3 == 0) goto Lac
            java.lang.String r3 = "type"
            java.lang.String r3 = r1.getAttributeValue(r4, r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            if (r3 == 0) goto L68
            if (r5 != 0) goto L5f
            adjp r3 = r0.b(r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            goto L63
        L5f:
            adjp r3 = r5.b(r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
        L63:
            r5 = r3
            r2.push(r5)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            goto Lac
        L68:
            adna r9 = new adna     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            r0 = 1
            r9.<init>(r4, r0)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            throw r9     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
        L6f:
            if (r5 != 0) goto L73
            r5 = r4
            goto L8d
        L73:
            java.lang.String r3 = "name"
            java.lang.String r3 = r1.getAttributeValue(r4, r3)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            java.lang.String r6 = "value"
            java.lang.String r6 = r1.getAttributeValue(r4, r6)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            if (r3 == 0) goto L8d
            if (r6 == 0) goto L8d
            adjo r7 = new adjo     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            r7.<init>(r3, r6)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            java.util.List r3 = r5.a     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            r3.add(r7)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
        L8d:
            r1.nextTag()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            goto Lac
        L91:
            r7 = 3
            if (r3 != r7) goto Lac
            boolean r3 = r6.equals(r8)     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            if (r3 == 0) goto Lac
            r2.pop()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            boolean r3 = r2.isEmpty()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            if (r3 == 0) goto La5
            r5 = r4
            goto Lac
        La5:
            java.lang.Object r3 = r2.peek()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            r5 = r3
            adjp r5 = (defpackage.adjp) r5     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
        Lac:
            int r3 = r1.nextTag()     // Catch: org.xmlpull.v1.XmlPullParserException -> Lb3
            goto L26
        Lb2:
            return r0
        Lb3:
            r9 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r9.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Error while parsing document: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.Throwable r9 = r9.getCause()
            r0.<init>(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adnb.i(java.io.InputStream):adjp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.io.InputStream r18, com.google.android.ims.provisioning.config.Configuration r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 2036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adnb.a(java.io.InputStream, com.google.android.ims.provisioning.config.Configuration, boolean):void");
    }
}
