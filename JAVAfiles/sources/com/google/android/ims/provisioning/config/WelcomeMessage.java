package com.google.android.ims.provisioning.config;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class WelcomeMessage extends ServerMessage {
    private static final long serialVersionUID = -1083751324432627812L;
    public boolean hasSettingsButton;

    public WelcomeMessage(String str, String str2, boolean z, boolean z2, boolean z3) {
        super(str, str2, z, z2);
        this.hasSettingsButton = z3;
    }
}
