package data;

import androidx.lifecycle.LiveData;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class DAOClient implements IRepository{
    private DatabaseReference databaseReference;

    public  DAOClient(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Client.class.getSimpleName());
    }

    @Override
    public Task<Void> insertClient(Client client) {
        return databaseReference.push().setValue(client);
    }

    @Override
    public void deleteClient(Client client) {

    }

    @Override
    public void deleteAllClients() {

    }

    @Override
    public LiveData<List<Client>> getAllClients() {
        return null;
    }
}
