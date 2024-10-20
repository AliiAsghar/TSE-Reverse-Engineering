package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwu implements Callable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public vwu(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr, int i) {
        this.c = i;
        this.a = parcelFileDescriptor;
        this.b = bArr;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [armf, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (Log.isLoggable("WearableClient", 3)) {
                            Log.d("WearableClient", "processAssets: writing data to FD : ".concat(String.valueOf(String.valueOf(this.a))));
                        }
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) this.a);
                        try {
                            try {
                                autoCloseOutputStream.write((byte[]) this.b);
                                autoCloseOutputStream.flush();
                                if (Log.isLoggable("WearableClient", 3)) {
                                    Log.d("WearableClient", "processAssets: wrote data: " + String.valueOf(this.a));
                                }
                                try {
                                    if (Log.isLoggable("WearableClient", 3)) {
                                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.a));
                                    }
                                    autoCloseOutputStream.close();
                                    return true;
                                } catch (IOException unused) {
                                    return true;
                                }
                            } catch (IOException unused2) {
                                Log.w("WearableClient", "processAssets: writing data failed: " + String.valueOf(this.a));
                                try {
                                    if (Log.isLoggable("WearableClient", 3)) {
                                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.a));
                                    }
                                    autoCloseOutputStream.close();
                                } catch (IOException unused3) {
                                }
                                return false;
                            }
                        } catch (Throwable th) {
                            try {
                                if (Log.isLoggable("WearableClient", 3)) {
                                    Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.a));
                                }
                                autoCloseOutputStream.close();
                            } catch (IOException unused4) {
                            }
                            throw th;
                        }
                    }
                    return ((rxq) ((xrf) this.b).e.b()).b(((qei) this.a).d);
                }
                return ((rtz) ((vwy) this.b).d.b()).q((ConversationIdType) this.a);
            }
            return ((znj) ((tby) this.a).h.b()).K((ConversationIdType) this.b);
        }
        return ((rtz) ((vwv) this.b).e.b()).q((ConversationIdType) this.a);
    }

    public vwu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public vwu(tby tbyVar, ConversationIdType conversationIdType, int i) {
        this.c = i;
        this.b = conversationIdType;
        this.a = tbyVar;
    }
}
