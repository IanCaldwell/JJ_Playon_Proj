package jjProgFactory;

public class AlbumsCreatorFactory {
	public AlbumsFactoryFactory create(String type, int songs){
        if (type.equals("Single")){
            return new AlbumsSingleFactory(songs);
            
        }
        else if (type.equals("Various")){
            return new AlbumsVariousFactory(songs);
        }
        else{
        	throw new IllegalArgumentException("Please use various artist and single artist albums only.");
        }
    }

}
