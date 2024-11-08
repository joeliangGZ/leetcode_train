

char* Buffer::alloc(int numBytes) {
    //Allocate space for the new data
    char* data= allocateAppend(numBytes);
    //Get the last chunk in the buffer
    Buffer::Chunk* lastChunk=this->chunksTail;
    //Check if the last chunk is not null and is internal
    if((lastChunk !=NULL && lastChunk->isInternal())
        //Check if the data pointer is equal to the length of the last chunk
        && (data-astChunk->length==astChunk->data)){
        //Fast path: grow the existing Chunk.
        astChunk->length += numBytes ;
        this->totalLength += numBytes;
    } else {
        //Creates a new chunk out of the allocated
        data.append(data, numBytes);
    }
    return data;
}

//Allocates new space at the end of the Buffer; uses space at the end
//of the last current allocation, if possible; otherwise creates a
//new allocation.Returns a pointer to the new space .
char* Buffer::allocateAppend(int size){
    void: data;
    //Check if there are any allocations
    if(this->allocations != NULL) {
        //Allocate space at the end of the last allocation
        data=this->allocations->allocateAppend(size);
        //Check if the allocation was successful
        if(data != NULL) {
            //Fast path
            return data;
        }
    }
    //Create a new allocation
    data = newA1location(0, size)->a1locateAppend(size);
    assert(data != NULL);
    return data;
}

// Tries to allocate space at the end of an existing allocation. Returns
//a pointer to the new space, or NULL if not enough room.
char: Buffer::Alocation::allocateAppend(int size){
    //Check if there is enough space at the end of the chunk
    if((this->chunkTop-this->appendTop)<size)
        return NULL;
    //Get the pointer to the new space
    char *retVal= &data[this->appendTop];
    //Update the append top
    this->appendTop += size;
    return retVal;
}

char* Buffer::alloc(int numBytes)
    //Check if there is enough extra space at the end of the last chunk
    if(this->extraAppendBytes >=numBytes){
        //There is extra space at the end of the current
        //last chunk,so we can just allocate the new
        ///region there.
        Buffer::Chunk* chunk=this->lastChunk;
        //Get the pointer to the new space
        char* resut=chunk->data + chunk->length;
        //Update the length of the chunk
        chunk->length += numBytes;
        //Update the extra append bytes
        this->extraAppendBytes-=numBytes;
        //Update the total length
        this->totalLength += numBytes;
        return result;
    }
    //We're going to have to create a new chunk.
}