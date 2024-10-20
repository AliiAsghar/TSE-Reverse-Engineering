package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znp {
    public final Object a;
    public final Object b;

    public znp(abrv abrvVar) {
        this.b = new acit();
        this.a = abrvVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final int a(ConversationIdType conversationIdType) {
        int i;
        aiut.b();
        akrh e = aktp.e("AddContactBannerDatabaseOperations#getConversationOpenCount");
        try {
            smr q = ((rtz) this.b.b()).q(conversationIdType);
            if (q != null) {
                i = q.n();
            } else {
                i = 0;
            }
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v54, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    public final aahj b(View view, SuggestionData suggestionData) {
        aahj aahkVar;
        if (suggestionData instanceof SmartSuggestionData) {
            albo.T(suggestionData instanceof SmartSuggestionItemSuggestionData);
            Object obj = this.a;
            SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) suggestionData;
            aqbc s = smartSuggestionItemSuggestionData.s();
            int ordinal = s.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 30) {
                            if (ordinal != 40) {
                                switch (ordinal) {
                                    case 5:
                                        return new aagy((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                                    case 6:
                                        return new aagu((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                                    case 7:
                                        return new aags((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                                    case 8:
                                    case 14:
                                    case 17:
                                    case 18:
                                    case 19:
                                        break;
                                    case 9:
                                        return new aahg((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                                    case 10:
                                        return new aagv((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                                    case 11:
                                        return new aahf((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                                    case 12:
                                        return new aagx((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                                    case 13:
                                        znp znpVar = (znp) obj;
                                        aahkVar = new aagw((Context) znpVar.a, smartSuggestionItemSuggestionData, view, znpVar.b);
                                        break;
                                    case 15:
                                    case 16:
                                        break;
                                    default:
                                        switch (ordinal) {
                                            case 21:
                                                break;
                                            case 22:
                                                return new aahb((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                                            case 23:
                                                return new aagt((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                                            default:
                                                throw new IllegalStateException("Unexpected value: " + s.a());
                                        }
                                }
                            }
                        } else {
                            return new aahh((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                        }
                    } else {
                        return new aagz((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
                    }
                }
                return new aahi((Context) ((znp) obj).a, smartSuggestionItemSuggestionData, view);
            }
            throw new IllegalArgumentException("Unhandled suggestion type: " + s.a());
        }
        Object obj2 = this.b;
        RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) suggestionData;
        int suggestionType = rbmSuggestionData.b.getSuggestionType();
        if (suggestionType != 0) {
            if (suggestionType != 1) {
                if (suggestionType != 2) {
                    if (suggestionType != 3) {
                        if (suggestionType != 4) {
                            if (suggestionType == 5) {
                                return new aahe((Context) ((znp) obj2).a, rbmSuggestionData, view);
                            }
                            throw new IllegalArgumentException(a.bV(suggestionType, "Unhandled suggestion type: "));
                        }
                        return new aahd((Context) ((znp) obj2).a, rbmSuggestionData, view);
                    }
                    return new aaha((Context) ((znp) obj2).a, rbmSuggestionData, view);
                }
                return new aahc((Context) ((znp) obj2).a, rbmSuggestionData, view);
            }
            znp znpVar2 = (znp) obj2;
            Object obj3 = znpVar2.b;
            Object obj4 = znpVar2.a;
            xve xveVar = (xve) ((zfh) obj3).a.b();
            xveVar.getClass();
            obj4.getClass();
            rbmSuggestionData.getClass();
            view.getClass();
            aahkVar = new aahk(xveVar, (Context) obj4, rbmSuggestionData, view);
        } else {
            return new aahi((Context) ((znp) obj2).a, rbmSuggestionData, view);
        }
        return aahkVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    public final void c(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap((Map) this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap((Map) this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).h(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((acit) entry2.getKey()).c(new abra(status));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, abik] */
    public final void d(abii abiiVar) {
        aboq aboqVar = new aboq((abor) this.b, aozb.w((byte[]) this.a.a(abiiVar.a)));
        aboqVar.k = apwa.b(0);
        if (!aboqVar.b) {
            aboqVar.b = true;
            ((abor) aboqVar.a).g.b(aboqVar).q(new acik() { // from class: abim
                @Override // defpackage.acik
                public final void a(acir acirVar) {
                    acirVar.g();
                }
            });
            return;
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }

    public final Object e(abif abifVar, Duration duration) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        Intent intent = new Intent("com.google.android.apps.tycho.psd.api.ACTION_BIND_PSD_SERVICE").setPackage("com.google.android.apps.tycho");
        abie abieVar = new abie(this, abifVar, atomicReference, countDownLatch, atomicReference2);
        try {
            if (((Context) this.a).bindService(intent, abieVar, 1)) {
                if (countDownLatch.await(duration.toNanos(), TimeUnit.NANOSECONDS)) {
                    if (atomicReference2.get() == null) {
                        return atomicReference.get();
                    }
                    throw ((abig) atomicReference2.get());
                }
                throw new TimeoutException("Timed out waiting for response from Fi app");
            }
            throw new abig("Fi product-specific data service is not available");
        } finally {
            ((Context) this.a).unbindService(abieVar);
        }
    }

    public znp(armf armfVar, aneo aneoVar) {
        this.b = armfVar;
        this.a = aneoVar;
    }

    public znp(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public znp(znp znpVar, znp znpVar2) {
        this.a = znpVar;
        this.b = znpVar2;
    }

    public znp(Context context) {
        context.getClass();
        this.a = context;
        String string = context.getString(R.string.forwarding_and_sharing_file_provider_authority);
        string.getClass();
        this.b = string;
    }

    public znp(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public znp(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public znp(Context context, ExecutorService executorService) {
        this.a = context.getApplicationContext();
        this.b = executorService;
    }

    public znp(Context context, String str, abik abikVar) {
        abnm abnmVar = new abnm(context, str);
        abnmVar.b(abon.b);
        abor aborVar = new abor(abnmVar.a, abnmVar.b, abnmVar.g, abnmVar.e, abnmVar.f, abnmVar.c, abnmVar.d, abnmVar.h);
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", str, Integer.valueOf(Integer.parseInt(str))));
        } catch (NumberFormatException unused) {
            this.b = aborVar;
            this.a = abikVar;
        }
    }

    public znp(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.b = new CloudMessagingMessengerCompat(iBinder);
            this.a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public znp() {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }
}
