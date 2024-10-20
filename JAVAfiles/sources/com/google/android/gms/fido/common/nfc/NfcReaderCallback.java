package com.google.android.gms.fido.common.nfc;

import android.nfc.Tag;
import com.google.android.gms.fido.common.nfc.INfcReaderCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class NfcReaderCallback extends INfcReaderCallback.Stub {
    @Override // com.google.android.gms.fido.common.nfc.INfcReaderCallback
    public abstract void onTagDiscovered(Tag tag);
}
